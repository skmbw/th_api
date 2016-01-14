package com.cfu666.cs.employee.action;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cfu666.cs.employee.model.Employee;
import com.cfu666.cs.employee.service.spi.EmployeeService;

import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 员工控制器
 * @author yinlei
 * @date 2015-11-4 10:29:01
 */
@Controller
@RequestMapping("/employee")
public class EmployeeAction extends GenericAction<Employee> {
	private static final Logger LOGGER = LogManager.getLogger(EmployeeAction.class);
	
	@Inject
	private EmployeeService employeeServiceImpl;
	
	/**
     * 获得员工List，初始化列表页。
     * @param model 参数
     * @return 员工List
     */
    @RequestMapping("/initial")
    public String initial(Employee model, Map<String, Object> maps) {
    	try {
    		List<Employee> list = employeeServiceImpl.pagedList(model);
            maps.put("list", list);
		} catch (Exception e) {
			LOGGER.error("get record list error, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
        return "employee/initial";
    }
	
	/**
	 * 获得员工List，Json格式。
	 * @param model 参数
	 * @return 员工List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public List<Employee> list(Employee model) {
		List<Employee> list = null;
		try {
			list = employeeServiceImpl.pagedList(model);
		} catch (Exception e) {
			LOGGER.error("get record list error, errorMsg=[{}].", e.getMessage());
		}
		return list;
	}
	
	/**
     * 根据Id获得员工实体，Json格式。
     * @param id 参数id
     * @return 员工实体
     */
    @ResponseBody
    @RequestMapping("/get")
    public Employee get(String id) {
    	Employee model = null;
    	try {
    		model = employeeServiceImpl.get(id);
		} catch (Exception e) {
			LOGGER.error("get record error, errorMsg=[{}].", e.getMessage());
		}
        return model;
    }
	
	/**
     * 跳转到新增页面
     * @return 新增页面逻辑视图
     */
    @RequestMapping("/add")
    public String add() {
        return "employee/add";
    }
    
    /**
     * 执行实际的新增操作
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(Employee model) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = employeeServiceImpl.save(model);
            if (result == 1) {
                bean.setMessage(SUCCESS);
                bean.setCode(1);
                LOGGER.info("save record success.");
            } else {
                bean.setMessage(ERROR);
                LOGGER.error("save record error.");
            }
		} catch (Exception e) {
			LOGGER.error("save record error, errorMsg=[{}].", e.getMessage());
			bean.setMessage(ERROR);
		}
        return bean;
    }
    
    /**
     * 查看员工详情页。
     * @param model 查询参数，携带ID
     * @return 员工详情页
     */
    @RequestMapping("/detail")
    public String detail(Employee model, Map<String, Object> maps) {
    	try {
    		model = employeeServiceImpl.get(model.getEmployeeId());
            maps.put("model", model);//将model放入视图中，供页面视图使用
		} catch (Exception e) {
			LOGGER.error("query record detail, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
        return "employee/detail";
    }
    
    /**
     * 跳转到编辑信息页面
     * @param model 查询参数，携带ID
     * @return 编辑页面
     */
    @RequestMapping("/edit")
    public String edit(Employee model, Map<String, Object> maps) {
        model = employeeServiceImpl.get(model.getEmployeeId());
        maps.put("model", model);
        return "employee/edit";
    }
    
    /**
     * 更新员工信息
     * @param model 要更新的员工信息，含有ID
     * @return 操作结果信息
     */
    @ResponseBody
    @RequestMapping("/update")
    public JsonBean update(Employee model) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = employeeServiceImpl.updateById(model);
            if (result == 1) {
                bean.setMessage(SUCCESS);
                bean.setCode(1);
                LOGGER.info("update record success.");
            } else {
                bean.setMessage(ERROR);
                LOGGER.error("update record error.");
            }
		} catch (Exception e) {
			LOGGER.error("update record error, errorMsg=[{}].", e.getMessage());
			bean.setMessage(ERROR);
		}
        return bean;
    }
    
    /**
     * 删除员工信息
     * @param id 要删除的员工ID
     */
    @ResponseBody
    @RequestMapping("/delete")
    public JsonBean delete(String id) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = employeeServiceImpl.deleteById(id);
    		if (result == 1) {
    			bean.setMessage(SUCCESS);
    			bean.setCode(1);
    			LOGGER.info("delete record success, id=[{}].", id);
    		} else {
    			bean.setMessage(ERROR);
    			LOGGER.error("delete record error.");
    		}
		} catch (Exception e) {
			LOGGER.error("delete record error, id=[{}], errorMsg=[{}].", id, e.getMessage());
			bean.setMessage(ERROR);
		}
        return bean;
    }
}
