package com.cfu666.cs.message.service.spi;

import com.cfu666.cs.message.model.Message;
import com.cfu666.cs.message.model.MessageBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 消息相关的业务service接口。
 * @author yinlei
 * @date 2015-11-5 10:37:15
 */
public interface MessageService extends MyBatisService<Message, MessageBean, String> {

}
