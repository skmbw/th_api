package com.cfu666.cs.org.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.cfu666.cs.org.dao.OrgDao;
import com.cfu666.cs.org.model.Org;
import com.cfu666.cs.org.model.OrgBean;
import com.cfu666.cs.org.service.spi.OrgService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 机构相关的service业务实现。
 * @author yinlei
 * @date 2015-11-4 10:13:36
 */
@Named
public class OrgServiceImpl extends MyBatisServiceImpl<Org, OrgBean, String> implements OrgService {
	// 添加了方法后，记得改为private
	protected OrgDao orgDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Org, OrgBean, String> orgDao) {
		this.baseDao = orgDao;
		this.orgDao = (OrgDao) orgDao;
	}
}
