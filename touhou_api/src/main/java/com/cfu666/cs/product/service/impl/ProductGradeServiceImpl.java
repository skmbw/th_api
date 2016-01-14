package com.cfu666.cs.product.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.cfu666.cs.product.dao.ProductGradeDao;
import com.cfu666.cs.product.model.ProductGrade;
import com.cfu666.cs.product.model.ProductGradeBean;
import com.cfu666.cs.product.service.spi.ProductGradeService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 收益分配相关的service业务实现。
 * @author yinlei
 * @date 2015-11-11 20:17:12
 */
@Named
public class ProductGradeServiceImpl extends MyBatisServiceImpl<ProductGrade, ProductGradeBean, String> implements ProductGradeService {
	// 添加了方法后，记得改为private
	protected ProductGradeDao productGradeDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<ProductGrade, ProductGradeBean, String> productGradeDao) {
		this.baseDao = productGradeDao;
		this.productGradeDao = (ProductGradeDao) productGradeDao;
	}
}
