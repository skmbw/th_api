package com.cfu666.cs.product.service.spi;

import java.util.List;

import com.cfu666.cs.product.bean.ProductNetReqBean;
import com.cfu666.cs.product.model.ProductNet;
import com.cfu666.cs.product.model.ProductNetBean;
import com.vteba.service.generic.MyBatisService;

/**
 * 基金净值相关的业务service接口。
 * @author yinlei
 * @date 2015-11-11 17:45:45
 */
public interface ProductNetService extends MyBatisService<ProductNet, ProductNetBean, String> {
	List<ProductNet> list(ProductNetReqBean productNetReqBean);
}
