package com.cfu666.cs.product.dao;

import java.util.List;

import com.cfu666.cs.product.bean.ProductInvestDetailResBean;
import com.cfu666.cs.product.bean.ProductInvestResBean;
import com.cfu666.cs.product.bean.ProductReqBean;
import com.cfu666.cs.product.bean.ProductResBean;
import com.cfu666.cs.product.model.Product;
import com.cfu666.cs.product.model.ProductBean;
import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 表product的MyBatis Dao Mapper。 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * 
 * @date 2015-11-04 10:14:41
 */
@DaoMapper
public interface ProductDao extends BaseDao<Product, ProductBean, String> {
	List<ProductResBean> list(ProductReqBean productReqBean);

	List<ProductInvestResBean> investList(ProductReqBean productReqBean);

	ProductInvestDetailResBean investDetail(ProductReqBean productReqBean);
}