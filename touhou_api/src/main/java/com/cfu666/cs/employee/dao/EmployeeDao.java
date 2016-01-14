package com.cfu666.cs.employee.dao;

import com.cfu666.cs.employee.model.Employee;
import com.cfu666.cs.employee.model.EmployeeBean;
import com.cfu666.cs.product.bean.ProductReqBean;
import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 表employee的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-11-04 10:29:04
 */
@DaoMapper
public interface EmployeeDao extends BaseDao<Employee, EmployeeBean, String> {
	Employee getEmployeeByCustomer(ProductReqBean productReqBean);
}