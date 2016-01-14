package com.cfu666.cs.customer.service.spi;

import com.cfu666.cs.customer.model.Customer;
import com.cfu666.cs.customer.model.CustomerBean;
import com.cfu666.cs.investor.model.Investor;
import com.vteba.service.generic.MyBatisService;

/**
 * 客户相关的业务service接口。
 * @author yinlei
 * @date 2015-11-4 10:32:35
 */
public interface CustomerService extends MyBatisService<Customer, CustomerBean, String> {

	int registe(Customer customer, Investor investor);

}
