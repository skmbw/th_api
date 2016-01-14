package com.cfu666.cs.product.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.cfu666.cs.product.bean.ProductNetReqBean;
import com.cfu666.cs.product.model.ProductNet;
import com.cfu666.cs.product.service.spi.ProductNetService;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.vteba.web.editer.DoubleEditor;
import com.vteba.web.editer.IntEditor;
import com.vteba.web.editer.LongEditor;
import com.vteba.web.editer.StringEditor;

/**
 * 基金净值控制器
 * 
 * @author yinlei
 * @date 2015-11-11 17:45:45
 */
@Controller
@RequestMapping("/productAchieve")
public class ProductAchieveAction extends GenericAction<ProductNet> {
	private static final Logger LOGGER = LogManager.getLogger(ProductAchieveAction.class);

	@Inject
	private ProductNetService productNetServiceImpl;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat(
				"yyyy-MM-dd"), true));
		binder.registerCustomEditor(int.class, new IntEditor());
		binder.registerCustomEditor(long.class, new LongEditor());
		binder.registerCustomEditor(double.class, new DoubleEditor());
		binder.registerCustomEditor(String.class, new StringEditor());
	}

	/**
	 * 获得基金净值List，Json格式。
	 * 
	 * @param model
	 *            参数
	 * @return 基金净值List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public JsonBean list(ProductNetReqBean productNetReqBean) {
		JsonBean jsonBean = new JsonBean();

		try {
			// 发起请求的参数,以后直接用AOP代替
			LOGGER.info("request productNet list, param=[{}]", JSON.toJSONString(productNetReqBean));

			// 员工id是必传的
			String productId = productNetReqBean.getProductId();
			String orgId = productNetReqBean.getOrgId();
			Date endTime = productNetReqBean.getEndTime();

			if (StringUtils.isBlank(productId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("产品Id不能为空");
				LOGGER.error("productId is required, productId = [{}]", productId);
				return jsonBean;
			}

			if (StringUtils.isBlank(orgId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("机构Id不能为空");
				LOGGER.error("orgId is required, orgId = [{}]", orgId);
				return jsonBean;
			}

			if (endTime != null) {
				productNetReqBean.setEndTime(new DateTime(endTime).minusHours(-23)
						.minusMinutes(-59).minusSeconds(-59).toDate());
			}

			List<ProductNet> list = productNetServiceImpl.list(productNetReqBean);
			LOGGER.info("query productNet list success,  size=[{}]", list.size());

			jsonBean.setCode(1);
			jsonBean.setData(list);
			jsonBean.setMessage(SUCCESS);
		} catch (Exception e) {
			LOGGER.error("fetch productNet list error, error=[{}]", e.getMessage());
			jsonBean.setCode(0);
			jsonBean.setMessage("fetch productNet list error");
		}

		return jsonBean;
	}

}
