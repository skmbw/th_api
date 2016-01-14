package com.cfu666.cs.investor.dao;

import com.cfu666.cs.investor.model.Investor;
import com.cfu666.cs.investor.model.InvestorBean;
import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 表investor的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-11-09 14:25:15
 */
@DaoMapper
public interface InvestorDao extends BaseDao<Investor, InvestorBean, String> {
}