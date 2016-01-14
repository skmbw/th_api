package com.cfu666.cs.product.action;

import java.io.File;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.cfu666.cs.product.model.ProductAttachment;
import com.cfu666.cs.product.service.spi.ProductAttachmentService;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 相关文件控制器
 * 
 * @author yinlei
 * @date 2015-11-11 17:11:59
 */
@Controller
@RequestMapping("/productAttachment")
public class ProductAttachmentAction extends GenericAction<ProductAttachment> {
	private static final Logger LOGGER = LogManager.getLogger(ProductAttachmentAction.class);

	@Inject
	private ProductAttachmentService productAttachmentServiceImpl;

	/**
	 * 获得相关文件List，Json格式。
	 * 
	 * @param model
	 *            参数
	 * @return 相关文件List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public JsonBean list(ProductAttachment model) {
		JsonBean jsonBean = new JsonBean();

		try {
			// 发起请求的参数,以后直接用AOP代替
			LOGGER.info("request productAttachment list, param=[{}]", JSON.toJSONString(model));

			// 员工id是必传的
			String productId = model.getProductId();
			String orgId = model.getOrgId();

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

			List<ProductAttachment> list = productAttachmentServiceImpl.queryList(model);
			LOGGER.info("query productAttachment list success,  size=[{}]", list.size());

			if (null != list) {
				for (ProductAttachment pa : list) {
					File file = new File(pa.getFilePath());
					pa.setSize(file.length());
				}
			}

			jsonBean.setCode(1);
			jsonBean.setData(list);
			jsonBean.setMessage(SUCCESS);
		} catch (Exception e) {
			LOGGER.error("fetch productAttachment list error, error=[{}]", e.getMessage());
			jsonBean.setCode(0);
			jsonBean.setMessage("fetch productAttachment list error");
		}

		return jsonBean;
	}

}
