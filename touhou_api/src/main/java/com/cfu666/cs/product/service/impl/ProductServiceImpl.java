package com.cfu666.cs.product.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.cfu666.cs.product.bean.ProductInvestDetailResBean;
import com.cfu666.cs.product.bean.ProductInvestResBean;
import com.cfu666.cs.product.bean.ProductReqBean;
import com.cfu666.cs.product.bean.ProductResBean;
import com.cfu666.cs.product.dao.ProductDao;
import com.cfu666.cs.product.model.Product;
import com.cfu666.cs.product.model.ProductBean;
import com.cfu666.cs.product.service.spi.ProductService;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 产品相关的service业务实现。
 * 
 * @author yinlei
 * @date 2015-11-4 10:14:40
 */
@Named
public class ProductServiceImpl extends MyBatisServiceImpl<Product, ProductBean, String> implements
		ProductService {
	// 添加了方法后，记得改为private
	protected ProductDao productDao;

	@Override
	@Inject
	public void setBaseDao(BaseDao<Product, ProductBean, String> productDao) {
		this.baseDao = productDao;
		this.productDao = (ProductDao) productDao;
	}

	@Override
	public List<ProductResBean> list(ProductReqBean productReqBean) {
		return productDao.list(productReqBean);
	}

	@Override
	public List<ProductInvestResBean> investList(ProductReqBean productReqBean) {
		return productDao.investList(productReqBean);
	}

	@Override
	public ProductInvestDetailResBean investDetail(ProductReqBean productReqBean) {
		return productDao.investDetail(productReqBean);
	}

}
