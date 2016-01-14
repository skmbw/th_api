package com.cfu666.cs.product.dao;

import com.cfu666.cs.product.model.ProductGrade;
import com.cfu666.cs.product.model.ProductGradeBean;
import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 表product_grade的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-11-11 20:17:12
 */
@DaoMapper
public interface ProductGradeDao extends BaseDao<ProductGrade, ProductGradeBean, String> {
}