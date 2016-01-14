package com.cfu666.cs.ads.dao;

import com.cfu666.cs.ads.model.Ads;
import com.cfu666.cs.ads.model.AdsBean;
import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 表ads的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-11-10 15:01:48
 */
@DaoMapper
public interface AdsDao extends BaseDao<Ads, AdsBean, String> {
}