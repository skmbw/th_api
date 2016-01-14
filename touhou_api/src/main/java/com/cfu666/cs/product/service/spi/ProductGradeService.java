package com.cfu666.cs.product.service.spi;

import com.cfu666.cs.product.model.ProductGrade;
import com.cfu666.cs.product.model.ProductGradeBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 收益分配相关的业务service接口。
 * @author yinlei
 * @date 2015-11-11 20:17:12
 */
public interface ProductGradeService extends MyBatisService<ProductGrade, ProductGradeBean, String> {

}
