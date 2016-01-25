package com.cfu666.cs.token;

import java.io.IOException;
import java.io.Writer;
import java.util.Set;
import java.util.regex.Pattern;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.cfu666.cs.consts.Consts;
import com.vteba.utils.common.PropUtils;
import com.vteba.utils.json.FastJsonUtils;
import com.vteba.web.action.JsonBean;
import com.vteba.web.filter.token.DefaultMultipartParser;

/**
 * 验证Token合法性过滤器
 * 
 * @author yinlei
 * @date 2015年7月4日 上午11:39:18
 */
@Named
public class VerifyTokenFilter implements Filter {
	private static final Logger LOGGER = LoggerFactory.getLogger(VerifyTokenFilter.class);
	private static final Pattern PATTERN = Pattern
			.compile("^([\\w\\W]*)+.(jpg|jpeg|gif|png|bmp|js|css)$");

	@Inject
	private TokenService tokenService;

	// 要放行的url，例如登录注册
	private Set<String> pathSet;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		ServletContext context = filterConfig.getServletContext();
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(context);
		AutowireCapableBeanFactory factory = ctx.getAutowireCapableBeanFactory();
		factory.autowireBean(this);

		pathSet = PropUtils.getSet(Consts.FILTER_PATH);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 验证是否是登录或者注册
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String path = httpRequest.getServletPath();

		// 过滤掉配置文件里面的URL
		boolean isVerify = true;
		for (String string : pathSet) {
			if (path.startsWith(string)) {
				isVerify = false;
				break;
			}
		}
		// 过滤掉js,CSS
		if (isVerify) {
			String[] split = path.split("\\.");
			if (split.length > 0) {
				isVerify = !PATTERN.matcher(path).matches();
			}
		}

		if (isVerify) { // 验证token
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info("will verify token, url=[{}].", path);
			}

			JsonBean bean = new JsonBean();
			response.setContentType("application/json;charset=UTF-8");
			response.setCharacterEncoding("UTF-8");

			// 判断是否是multipart/form-data上传文件请求，如果是，解析request并重新包装request
			try {
				httpRequest = DefaultMultipartParser.parse(httpRequest);
			} catch (Exception e) {
				if (LOGGER.isInfoEnabled()) {
					LOGGER.info("parse request is multipart ort not error. msg=[{}].", e);
				}
				bean.setCode(-10);
				bean.setMessage("解析上传文件错误。");

				response(response, bean);
			}

			String tokenId = httpRequest.getParameter(Consts.TOKEN_ID);
			if (tokenId == null) {
				tokenId = httpRequest.getHeader(Consts.TOKEN_ID);
			}
			int result = 0;
			try {
				result = tokenService.verifyToken(tokenId);
			} catch (Exception e) {
				LOGGER.error("tokenId verify error, msg=[{}].", e);
				bean.setCode(-10);
				bean.setMessage("Token验证错误。");

				response(response, bean);
			}
			if (result == 1) { // 验证通过
				if (LOGGER.isInfoEnabled()) {
					LOGGER.info("tokenId verify success.");
				}
				chain.doFilter(httpRequest, response);
			} else { // 失败
				if (result == 0) { // 没有通过
					if (LOGGER.isInfoEnabled()) {
						LOGGER.info("tokenId verify failure.");
					}
					bean.setCode(-10);
					bean.setMessage("Token验证错误。");
				} else if (result == -100) { // 用户pad被回收，不通过
					if (LOGGER.isInfoEnabled()) {
						LOGGER.info("tokenId verify failure, because user's pad is recycle.");
					}
					bean.setCode(-100);
					bean.setMessage("用户Pad被回收。");
				}

				response(response, bean);
			}
		} else { // 不需验证token
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info("non filter url, url=[{}].", path);
			}
			chain.doFilter(request, response);

		}
	}

	/**
	 * 响应错误消息
	 * 
	 * @param response
	 * @param bean
	 * @throws IOException
	 */
	private void response(ServletResponse response, JsonBean bean) throws IOException {
		String json = FastJsonUtils.toJson(bean);
		Writer writer = response.getWriter();
		writer.write(json);
		writer.flush();
	}

	@Override
	public void destroy() {
		// do nothing
	}

}
