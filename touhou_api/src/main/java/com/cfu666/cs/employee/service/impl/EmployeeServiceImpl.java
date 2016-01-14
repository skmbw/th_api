package com.cfu666.cs.employee.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.cfu666.cs.employee.dao.EmployeeDao;
import com.cfu666.cs.employee.model.Employee;
import com.cfu666.cs.employee.model.EmployeeBean;
import com.cfu666.cs.employee.service.spi.EmployeeService;
import com.cfu666.cs.product.bean.ProductReqBean;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 员工相关的service业务实现。
 * @author yinlei
 * @date 2015-11-4 10:29:01
 */
@Named
public class EmployeeServiceImpl extends MyBatisServiceImpl<Employee, EmployeeBean, String> implements EmployeeService {
	// 添加了方法后，记得改为private
	protected EmployeeDao employeeDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Employee, EmployeeBean, String> employeeDao) {
		this.baseDao = employeeDao;
		this.employeeDao = (EmployeeDao) employeeDao;
	}

	@Override
	public Employee getEmployeeByCustomer(ProductReqBean productReqBean) {
		return employeeDao.getEmployeeByCustomer(productReqBean);
	}
}
