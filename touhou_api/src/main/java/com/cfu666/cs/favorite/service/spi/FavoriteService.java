package com.cfu666.cs.favorite.service.spi;

import java.util.List;

import com.cfu666.cs.favorite.model.Favorite;
import com.cfu666.cs.favorite.model.FavoriteBean;
import com.cfu666.cs.my.bean.FavoriteResBean;
import com.vteba.service.generic.MyBatisService;

/**
 * 收藏相关的业务service接口。
 * @author yinlei
 * @date 2015-10-29 15:44:32
 */
public interface FavoriteService extends MyBatisService<Favorite, FavoriteBean, String> {
	public List<FavoriteResBean> getFavoriteResBeanList(Favorite favorite);
}
