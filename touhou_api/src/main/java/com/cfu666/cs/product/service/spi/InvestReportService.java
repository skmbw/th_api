package com.cfu666.cs.product.service.spi;

import com.cfu666.cs.product.model.InvestReport;
import com.cfu666.cs.product.model.InvestReportBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 投后报告相关的业务service接口。
 * @author yinlei
 * @date 2015-11-12 16:44:35
 */
public interface InvestReportService extends MyBatisService<InvestReport, InvestReportBean, String> {

}
