package com.cfu666.cs.product.action;

import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.cfu666.cs.product.model.ProductGrade;
import com.cfu666.cs.product.service.spi.ProductGradeService;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 收益分配控制器
 * 
 * @author yinlei
 * @date 2015-11-11 20:17:12
 */
@Controller
@RequestMapping("/productGrade")
public class ProductGradeAction extends GenericAction<ProductGrade> {
	private static final Logger LOGGER = LogManager.getLogger(ProductGradeAction.class);

	@Inject
	private ProductGradeService productGradeServiceImpl;

	/**
	 * 获得收益分配List，Json格式。
	 * 
	 * @param model
	 *            参数
	 * @return 收益分配List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public JsonBean list(ProductGrade model) {
		JsonBean jsonBean = new JsonBean();

		try {
			// 发起请求的参数,以后直接用AOP代替
			LOGGER.info("request productGrade list, param=[{}]", JSON.toJSONString(model));

			// 员工id是必传的
			String productId = model.getProductId();

			if (StringUtils.isBlank(productId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("产品Id不能为空");
				LOGGER.error("productId is required, productId = [{}]", productId);
				return jsonBean;
			}

			List<ProductGrade> list = productGradeServiceImpl.queryList(model);
			LOGGER.info("query productGrade success,  size=[{}]", list.size());

			jsonBean.setCode(1);
			jsonBean.setData(list);
			jsonBean.setMessage(SUCCESS);
		} catch (Exception e) {
			LOGGER.error("fetch productGrade list error, error=[{}]", e.getMessage());
			jsonBean.setCode(0);
			jsonBean.setMessage("fetch productGrade list error");
		}

		return jsonBean;
	}

}
