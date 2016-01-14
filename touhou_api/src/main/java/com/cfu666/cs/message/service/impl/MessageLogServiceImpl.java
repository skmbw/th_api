package com.cfu666.cs.message.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.cfu666.cs.message.bean.MsgReqBean;
import com.cfu666.cs.message.dao.MessageLogDao;
import com.cfu666.cs.message.model.MessageLog;
import com.cfu666.cs.message.model.MessageLogBean;
import com.cfu666.cs.message.service.spi.MessageLogService;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 消息日志相关的service业务实现。
 * @author yinlei
 * @date 2015-11-5 10:37:15
 */
@Named
public class MessageLogServiceImpl extends MyBatisServiceImpl<MessageLog, MessageLogBean, String> implements MessageLogService {
	// 添加了方法后，记得改为private
	protected MessageLogDao messageLogDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<MessageLog, MessageLogBean, String> messageLogDao) {
		this.baseDao = messageLogDao;
		this.messageLogDao = (MessageLogDao) messageLogDao;
	}
	
	/**
	 * 获取用户消息列表
	 */
	@Override
	public List<MessageLog> myqueryList(MsgReqBean model) {
		return messageLogDao.myqueryList(model);
	}
	
	/**
	 * 更新用户消息状态
	 */
	@Override
	public int updateMsgState(MsgReqBean model) {
		return messageLogDao.updateMsgState(model);
	}
}
