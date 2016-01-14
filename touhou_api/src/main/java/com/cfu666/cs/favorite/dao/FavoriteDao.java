package com.cfu666.cs.favorite.dao;

import java.util.List;

import com.cfu666.cs.favorite.model.Favorite;
import com.cfu666.cs.favorite.model.FavoriteBean;
import com.cfu666.cs.my.bean.FavoriteResBean;
import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 表favorite的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-10-29 15:44:33
 */
@DaoMapper
public interface FavoriteDao extends BaseDao<Favorite, FavoriteBean, String> {
	public List<FavoriteResBean> getFavoriteResBeanList(Favorite favorite);
}