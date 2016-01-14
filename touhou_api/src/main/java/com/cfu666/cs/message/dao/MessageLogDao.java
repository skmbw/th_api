package com.cfu666.cs.message.dao;

import java.util.List;

import com.cfu666.cs.message.bean.MsgReqBean;
import com.cfu666.cs.message.model.MessageLog;
import com.cfu666.cs.message.model.MessageLogBean;
import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 表message_log的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-11-05 10:37:16
 */
@DaoMapper
public interface MessageLogDao extends BaseDao<MessageLog, MessageLogBean, String> {

	List<MessageLog> myqueryList(MsgReqBean model);

	int updateMsgState(MsgReqBean model);
}