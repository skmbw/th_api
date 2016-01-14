package com.cfu666.cs.version.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.cfu666.cs.version.dao.VersionDao;
import com.cfu666.cs.version.model.Version;
import com.cfu666.cs.version.model.VersionBean;
import com.cfu666.cs.version.service.spi.VersionService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 版本相关的service业务实现。
 * @author yinlei
 * @date 2015-11-9 9:17:36
 */
@Named
public class VersionServiceImpl extends MyBatisServiceImpl<Version, VersionBean, String> implements VersionService {
	// 添加了方法后，记得改为private
	protected VersionDao versionDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Version, VersionBean, String> versionDao) {
		this.baseDao = versionDao;
		this.versionDao = (VersionDao) versionDao;
	}
}
