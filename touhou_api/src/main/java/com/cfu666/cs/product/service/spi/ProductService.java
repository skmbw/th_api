package com.cfu666.cs.product.service.spi;

import java.util.List;

import com.cfu666.cs.product.bean.ProductInvestDetailResBean;
import com.cfu666.cs.product.bean.ProductInvestResBean;
import com.cfu666.cs.product.bean.ProductReqBean;
import com.cfu666.cs.product.bean.ProductResBean;
import com.cfu666.cs.product.model.Product;
import com.cfu666.cs.product.model.ProductBean;
import com.vteba.service.generic.MyBatisService;

/**
 * 产品相关的业务service接口。
 * 
 * @author yinlei
 * @date 2015-11-4 10:14:40
 */
public interface ProductService extends MyBatisService<Product, ProductBean, String> {
	List<ProductResBean> list(ProductReqBean productReqBean);

	List<ProductInvestResBean> investList(ProductReqBean productReqBean);

	ProductInvestDetailResBean investDetail(ProductReqBean productReqBean);
}
