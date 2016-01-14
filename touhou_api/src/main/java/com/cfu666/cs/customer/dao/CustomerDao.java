package com.cfu666.cs.customer.dao;

import com.cfu666.cs.customer.model.Customer;
import com.cfu666.cs.customer.model.CustomerBean;
import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 表customer的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-11-04 10:32:36
 */
@DaoMapper
public interface CustomerDao extends BaseDao<Customer, CustomerBean, String> {
}