package com.cfu666.cs.message.service.spi;

import java.util.List;

import com.cfu666.cs.message.bean.MsgReqBean;
import com.cfu666.cs.message.model.MessageLog;
import com.cfu666.cs.message.model.MessageLogBean;
import com.vteba.service.generic.MyBatisService;

/**
 * 消息日志相关的业务service接口。
 * @author yinlei
 * @date 2015-11-5 10:37:15
 */
public interface MessageLogService extends MyBatisService<MessageLog, MessageLogBean, String> {

	public List<MessageLog> myqueryList(MsgReqBean model);
	
	public int updateMsgState(MsgReqBean model);
}
