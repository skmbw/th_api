package com.cfu666.cs.org.service.spi;

import com.cfu666.cs.org.model.Org;
import com.cfu666.cs.org.model.OrgBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 机构相关的业务service接口。
 * @author yinlei
 * @date 2015-11-4 10:13:36
 */
public interface OrgService extends MyBatisService<Org, OrgBean, String> {

}
