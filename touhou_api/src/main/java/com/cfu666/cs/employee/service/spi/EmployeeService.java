package com.cfu666.cs.employee.service.spi;

import com.cfu666.cs.employee.model.Employee;
import com.cfu666.cs.employee.model.EmployeeBean;
import com.cfu666.cs.product.bean.ProductReqBean;
import com.vteba.service.generic.MyBatisService;

/**
 * 员工相关的业务service接口。
 * @author yinlei
 * @date 2015-11-4 10:29:01
 */
public interface EmployeeService extends MyBatisService<Employee, EmployeeBean, String> {
	Employee getEmployeeByCustomer(ProductReqBean productReqBean);
}
