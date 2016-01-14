package com.cfu666.cs.version.dao;

import com.cfu666.cs.version.model.Version;
import com.cfu666.cs.version.model.VersionBean;
import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 表version的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-11-09 09:17:37
 */
@DaoMapper
public interface VersionDao extends BaseDao<Version, VersionBean, String> {
}