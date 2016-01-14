package com.cfu666.cs.investor.service.spi;

import com.cfu666.cs.investor.model.Investor;
import com.cfu666.cs.investor.model.InvestorBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 投资人相关的业务service接口。
 * @author yinlei
 * @date 2015-11-9 14:25:14
 */
public interface InvestorService extends MyBatisService<Investor, InvestorBean, String> {

}
