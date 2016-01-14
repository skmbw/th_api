package com.cfu666.cs.message.action;

import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.cfu666.cs.message.bean.CountResBean;
import com.cfu666.cs.message.bean.MsgReqBean;
import com.cfu666.cs.message.model.Message;
import com.cfu666.cs.message.model.MessageLog;
import com.cfu666.cs.message.service.spi.MessageLogService;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 消息控制器
 * @author zhangyz
 * @date 2015-11-5 10:37:15
 */
@Controller
@RequestMapping("/message")
public class MessageAction extends GenericAction<Message> {
	private static final Logger LOGGER = LogManager.getLogger(MessageAction.class);
	
	@Inject
	private MessageLogService messagelogServiceImpl;
	/**
	 * 获得消息List，Json格式。
	 * @param model 参数
	 * @return 消息List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public JsonBean list(MsgReqBean model) {
		JsonBean bean = new JsonBean();
		String customerId = model.getCustomerId();
		String orgId = model.getOrgId();
		try {
			if (StringUtils.isBlank(customerId) || StringUtils.isBlank(orgId)) {
				bean.setCode(0);
				bean.setMessage("参数错误.");
				return bean;
			}
			LOGGER.info("request message  queryList, param=[{}]", JSON.toJSONString(model));
			Integer i = model.getPage();
			if (i != null) {
				model.setPage(i * model.getPageSize());
			}
			model.setOrderBy("create_time desc");
			List<MessageLog>  list = messagelogServiceImpl.myqueryList(model);
			//更新该用户消息状态
			MsgReqBean reqBean = new MsgReqBean();
			reqBean.setCustomerId(customerId);
			reqBean.setOrgId(orgId);
			if(model.getBusinessType() != null){
				reqBean.setBusinessType(model.getBusinessType());
			}
			messagelogServiceImpl.updateMsgState(reqBean);
			bean.setCode(1);
    		bean.setMessage("获取消息列表成功.");
    		bean.setData(list);
		} catch (Exception e) {
			bean.setMessage("获取消息列表失败.");
			bean.setCode(0);
			LOGGER.error("get message list error, errorMsg=[{}].", e.getMessage());
		}
		return bean;
	}
	
    /**
     * 统计消息未读条数
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @ResponseBody
    @RequestMapping("/count")
    public JsonBean doAdd(MsgReqBean model) {
    	JsonBean bean = new JsonBean();
    	String customerId = model.getCustomerId();
		String orgId = model.getOrgId();
		try {
			if (StringUtils.isBlank(customerId) || StringUtils.isBlank(orgId)) {
				bean.setCode(0);
				bean.setMessage("参数错误.");
				return bean;
			}
			MessageLog msg = new MessageLog();
			msg.setCustomerId(customerId);
			msg.setOrgId(orgId);
			msg.setState(0);
			msg.setBusinessType(1);
			int  systemNum = messagelogServiceImpl.pagedList(msg).size();
			msg.setBusinessType(2);
			int  investNum = messagelogServiceImpl.pagedList(msg).size();
			CountResBean countResBean = new CountResBean();
			countResBean.setInvestNum(investNum);
			countResBean.setSystemNum(systemNum);
			bean.setMessage("获取未读消息数量成功.");
			bean.setCode(1);
			bean.setData(countResBean);
		} catch (Exception e) {
			LOGGER.error("save record error, errorMsg=[{}].", e.getMessage());
			bean.setMessage("获取未读消息数量失败.");
			bean.setCode(0);
		}
        return bean;
    }
}
