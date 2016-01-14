package com.cfu666.cs.favorite.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.cfu666.cs.favorite.dao.FavoriteDao;
import com.cfu666.cs.favorite.model.Favorite;
import com.cfu666.cs.favorite.model.FavoriteBean;
import com.cfu666.cs.favorite.service.spi.FavoriteService;
import com.cfu666.cs.my.bean.FavoriteResBean;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 收藏相关的service业务实现。
 * @author yinlei
 * @date 2015-10-29 15:44:32
 */
@Named
public class FavoriteServiceImpl extends MyBatisServiceImpl<Favorite, FavoriteBean, String> implements FavoriteService {
	// 添加了方法后，记得改为private
	protected FavoriteDao favoriteDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Favorite, FavoriteBean, String> favoriteDao) {
		this.baseDao = favoriteDao;
		this.favoriteDao = (FavoriteDao) favoriteDao;
	}

	@Override
	public List<FavoriteResBean> getFavoriteResBeanList(Favorite favorite) {
		return favoriteDao.getFavoriteResBeanList(favorite);
	}
}
