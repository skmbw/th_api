package com.cfu666.cs.product.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.cfu666.cs.product.bean.ProductNetReqBean;
import com.cfu666.cs.product.dao.ProductNetDao;
import com.cfu666.cs.product.model.ProductNet;
import com.cfu666.cs.product.model.ProductNetBean;
import com.cfu666.cs.product.service.spi.ProductNetService;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 基金净值相关的service业务实现。
 * 
 * @author yinlei
 * @date 2015-11-11 17:45:45
 */
@Named
public class ProductNetServiceImpl extends MyBatisServiceImpl<ProductNet, ProductNetBean, String>
		implements ProductNetService {
	// 添加了方法后，记得改为private
	protected ProductNetDao productNetDao;

	@Override
	@Inject
	public void setBaseDao(BaseDao<ProductNet, ProductNetBean, String> productNetDao) {
		this.baseDao = productNetDao;
		this.productNetDao = (ProductNetDao) productNetDao;
	}

	@Override
	public List<ProductNet> list(ProductNetReqBean productNetReqBean) {
		return productNetDao.list(productNetReqBean);
	}
}
