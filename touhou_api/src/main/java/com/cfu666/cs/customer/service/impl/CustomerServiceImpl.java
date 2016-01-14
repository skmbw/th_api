package com.cfu666.cs.customer.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.cfu666.cs.customer.dao.CustomerDao;
import com.cfu666.cs.customer.model.Customer;
import com.cfu666.cs.customer.model.CustomerBean;
import com.cfu666.cs.customer.service.spi.CustomerService;
import com.cfu666.cs.investor.model.Investor;
import com.cfu666.cs.investor.service.spi.InvestorService;
import com.vteba.common.exception.ServiceException;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 客户相关的service业务实现。
 * @author yinlei
 * @date 2015-11-4 10:32:35
 */
@Named
public class CustomerServiceImpl extends MyBatisServiceImpl<Customer, CustomerBean, String> implements CustomerService {
	// 添加了方法后，记得改为private
	protected CustomerDao customerDao;
	
	@Inject
	private InvestorService investorServiceImpl;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Customer, CustomerBean, String> customerDao) {
		this.baseDao = customerDao;
		this.customerDao = (CustomerDao) customerDao;
	}

	@Override
	public int registe(Customer customer, Investor investor) {
		try {
			customerDao.save(customer);
			Investor investorUpdata = new Investor();
			investorUpdata.setId(investor.getId());
			investorUpdata.setVerify(true);
			investorServiceImpl.updateById(investorUpdata);
		} catch (Exception e) {
			throw new ServiceException("注册失败！");
		}
		return 1;
	}

	
}
