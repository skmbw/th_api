package com.cfu666.cs.product.dao;

import com.cfu666.cs.product.model.InvestReport;
import com.cfu666.cs.product.model.InvestReportBean;
import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 表invest_report的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-11-12 16:44:36
 */
@DaoMapper
public interface InvestReportDao extends BaseDao<InvestReport, InvestReportBean, String> {
}