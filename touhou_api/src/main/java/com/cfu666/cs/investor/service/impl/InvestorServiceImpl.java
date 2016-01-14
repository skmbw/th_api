package com.cfu666.cs.investor.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.cfu666.cs.investor.dao.InvestorDao;
import com.cfu666.cs.investor.model.Investor;
import com.cfu666.cs.investor.model.InvestorBean;
import com.cfu666.cs.investor.service.spi.InvestorService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 投资人相关的service业务实现。
 * @author yinlei
 * @date 2015-11-9 14:25:14
 */
@Named
public class InvestorServiceImpl extends MyBatisServiceImpl<Investor, InvestorBean, String> implements InvestorService {
	// 添加了方法后，记得改为private
	protected InvestorDao investorDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Investor, InvestorBean, String> investorDao) {
		this.baseDao = investorDao;
		this.investorDao = (InvestorDao) investorDao;
	}
}
