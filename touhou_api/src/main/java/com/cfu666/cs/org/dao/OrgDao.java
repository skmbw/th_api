package com.cfu666.cs.org.dao;

import com.cfu666.cs.org.model.Org;
import com.cfu666.cs.org.model.OrgBean;
import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 表org的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-11-04 10:13:37
 */
@DaoMapper
public interface OrgDao extends BaseDao<Org, OrgBean, String> {
}