package com.cfu666.cs.news.action;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.cfu666.cs.employee.model.Employee;
import com.cfu666.cs.employee.service.spi.EmployeeService;
import com.cfu666.cs.news.bean.NewsReqBean;
import com.cfu666.cs.news.model.News;
import com.cfu666.cs.news.service.spi.NewsService;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 新闻控制器
 * 
 * @author yinlei
 * @date 2015-11-11 10:07:44
 */
@Controller
@RequestMapping("/news")
public class NewsAction extends GenericAction<News> {
	private static final Logger LOGGER = LogManager.getLogger(NewsAction.class);

	@Inject
	private NewsService newsServiceImpl;
	@Inject
	private EmployeeService employeeServiceImpl;

	@ResponseBody
	@RequestMapping("/getNewsList")
	public JsonBean getNewsList(NewsReqBean bean) {
		JsonBean json = new JsonBean();
		if (StringUtils.isAnyEmpty(bean.getOrgId(), bean.getId())) {
			json.setCode(0);
			json.setMessage("参数不完整！");
			return json;
		}
		if (null == bean.getPage() || null == bean.getPageSize()) {
			bean.setPage(0);
			bean.setPageSize(10);
		}
		try {
			LOGGER.info("request news getNewsList param=[{}]", JSON.toJSONString(bean));
			bean.setStart(bean.getPage() * bean.getPageSize());
			List<News> newsList = newsServiceImpl.getNewsList(bean);
			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(newsList);
			return json;
		} catch (Exception e) {
			LOGGER.error("request news getNewsList error.msg=[{}]", e.getMessage());
			json.setCode(0);
			json.setMessage("获取新闻失败");
			return json;
		}
	}

	@ResponseBody
	@RequestMapping("/getNewsDetail")
	public JsonBean getNewsDetail(String id) {
		JsonBean json = new JsonBean();
		if (StringUtils.isAnyEmpty(id)) {
			json.setCode(0);
			json.setMessage("参数不完整！");
			return json;
		}
		try {
			LOGGER.info("request news getThisNews param=[{}]", JSON.toJSONString(id));
			News news = newsServiceImpl.get(id);
			if (null == news) {
				json.setCode(0);
				json.setMessage("没有这条新闻!");
				return json;
			}
			if (!(news.getPlatform() == 1 || news.getPlatform() == 2)) {
				json.setCode(0);
				json.setMessage("不支持此类型的新闻！");
				return json;
			}
			if (news.getState() == 0) {
				json.setCode(0);
				json.setMessage("该新闻已经下架！");
				return json;
			}
			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(news);
			return json;
		} catch (Exception e) {
			LOGGER.error("request news getThisNews error.msg=[{}]", e.getMessage());
			json.setCode(0);
			json.setMessage("获取新闻详情失败");
			return json;
		}
	}
	
	/**
	 * 跳转详情页面页面
	 * 
	 * @param model
	 *            查询参数，携带ID
	 * @return 编辑页面
	 */
	@RequestMapping("/share/{newsId}/{employeeId}")
	public String detail(@PathVariable("newsId") String newsId, @PathVariable("employeeId") String employeeId,Map<String, Object> maps) {
		try {
			News model = new News();
			model = newsServiceImpl.get(newsId);
			if (model == null) {
				model = new News();
				model.setTitle("没有该新闻！");
				model.setContent("如有疑问，请联系管理员。。。");
				maps.put("model", model);
			}else if (model.getState() == null || model.getState() == 0) {
				model = new News();
				model.setTitle("这条新闻已过期！");
				model.setContent("如有疑问，请联系管理员。。。");
				maps.put("model", model);
			}else {
				maps.put("model", model);
				Employee employee = employeeServiceImpl.get(employeeId);
				String mobile = null;
				if (employee != null) {
					mobile = employee.getMobile();
				}
				maps.put("mobile", mobile);
			}
		} catch (Exception e) {
			LOGGER.error("edit record detail, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
		return "wap/activity";
	}
}
