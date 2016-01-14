package com.cfu666.cs.message.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.cfu666.cs.message.dao.MessageDao;
import com.cfu666.cs.message.model.Message;
import com.cfu666.cs.message.model.MessageBean;
import com.cfu666.cs.message.service.spi.MessageService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 消息相关的service业务实现。
 * @author yinlei
 * @date 2015-11-5 10:37:15
 */
@Named
public class MessageServiceImpl extends MyBatisServiceImpl<Message, MessageBean, String> implements MessageService {
	// 添加了方法后，记得改为private
	protected MessageDao messageDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Message, MessageBean, String> messageDao) {
		this.baseDao = messageDao;
		this.messageDao = (MessageDao) messageDao;
	}
}
