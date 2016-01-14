package com.cfu666.cs.ads.action;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.cfu666.cs.ads.model.Ads;
import com.cfu666.cs.ads.model.AdsBean;
import com.cfu666.cs.ads.service.spi.AdsService;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 广告控制器
 * 
 * @author yinlei
 * @date 2015-11-10 15:01:48
 */
@Controller
@RequestMapping("/ads")
public class AdsAction extends GenericAction<Ads> {
	private static final Logger LOGGER = LogManager.getLogger(AdsAction.class);

	@Inject
	private AdsService adsServiceImpl;

	@ResponseBody
	@RequestMapping("/getAdsList")
	public JsonBean getAdsList(String orgId) {
		JsonBean json = new JsonBean();
		if (StringUtils.isBlank(orgId)) {
			json.setCode(0);
			json.setMessage("参数不完整！");
			return json;
		}
		try {
			LOGGER.info("request ads getAdsList param=[{}]", JSON.toJSONString(orgId));
			// Ads ads = new Ads();
			// ads.setOrgId(orgId);
			// ads.setPlatform(12);
			// ads.setOrderBy("orders desc");
			// ads.setState(true);
			// ads.setPageSize(5);
			// ads.setStart(0);
			List<Integer> values = new ArrayList<Integer>();
			values.add(1);
			values.add(2);
			AdsBean adsBean = new AdsBean();
			adsBean.createCriteria().andOrgIdEqualTo(orgId).andPlatformIn(values)
					.andStateEqualTo(true);
			adsBean.setOrderBy("orders desc");
			adsBean.setPageSize(5);
			adsBean.setStart(0);
			// List<Ads> adsList = adsServiceImpl.queryList(ads);
			List<Ads> adsList = adsServiceImpl.queryForList(adsBean);
			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(adsList);
			return json;
		} catch (Exception e) {
			LOGGER.error("request ads getAdsList error.msg=[{}]", e.getMessage());
			json.setCode(0);
			json.setMessage("获取广告失败");
			return json;
		}
	}
}
