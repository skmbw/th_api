package com.cfu666.cs.message.dao;

import com.cfu666.cs.message.model.Message;
import com.cfu666.cs.message.model.MessageBean;
import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 表message的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-11-05 10:37:16
 */
@DaoMapper
public interface MessageDao extends BaseDao<Message, MessageBean, String> {
}