package com.cfu666.cs.appointment.action;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.cfu666.cs.appointment.bean.AppoReqBean;
import com.cfu666.cs.appointment.model.Appointment;
import com.cfu666.cs.appointment.service.spi.AppointmentService;
import com.cfu666.cs.customer.model.Customer;
import com.cfu666.cs.customer.service.spi.CustomerService;
import com.cfu666.cs.employee.model.Employee;
import com.cfu666.cs.employee.service.spi.EmployeeService;
import com.cfu666.cs.investor.model.Investor;
import com.cfu666.cs.investor.service.spi.InvestorService;
import com.cfu666.cs.product.model.Product;
import com.cfu666.cs.product.service.spi.ProductService;
import com.vteba.utils.id.ObjectId;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.vteba.web.editer.DoubleEditor;
import com.vteba.web.editer.IntEditor;
import com.vteba.web.editer.LongEditor;
import com.vteba.web.editer.StringEditor;

/**
 * 预约控制器
 * 
 * @author zhangyz
 * @date 2015-11-5 10:25:54
 */
@Controller
@RequestMapping("/appointment")
public class AppointmentAction extends GenericAction<Appointment> {
	private static final Logger LOGGER = LogManager.getLogger(AppointmentAction.class);

	@Inject
	private AppointmentService appointmentServiceImpl;
	@Inject
	private InvestorService investorServiceImpl;
	@Inject
	private CustomerService customerServiceImpl;
	@Inject
	private ProductService productServiceImpl;
	@Inject
	private EmployeeService employeeServiceImpl;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss"), true));
		binder.registerCustomEditor(int.class, new IntEditor());
		binder.registerCustomEditor(long.class, new LongEditor());
		binder.registerCustomEditor(double.class, new DoubleEditor());
		binder.registerCustomEditor(String.class, new StringEditor());
	}
	/**
	 * 获得用户相应机构的预约列表
	 * 
	 * @param model
	 *            参数
	 * @return JsonBean
	 */
	@ResponseBody
	@RequestMapping("/list")
	public JsonBean list(AppoReqBean model) {
		JsonBean bean = new JsonBean();
		List<Appointment> list = null;
		String customerId = model.getCustomerId();
		String orgId = model.getOrgId();
		try {
			if (StringUtils.isBlank(customerId) || StringUtils.isBlank(orgId)) {
				bean.setCode(0);
				bean.setMessage("参数错误.");
				return bean;
			}
			// 获取用户信息
			Customer customer = customerServiceImpl.get(customerId);
			if (customer == null) {
				bean.setCode(0);
				bean.setMessage("您的投资人信息不存在.");
				return bean;
			}
			//查询用户所在机构投资人信息
			Investor invesReq = new Investor();
			invesReq.setOrgId(orgId);
			invesReq.setMobile(customer.getMobile());
			List<Investor> invesList = investorServiceImpl.pagedList(invesReq);
			if (invesList.size() != 1) {
				bean.setCode(0);
				bean.setMessage("获取投资人信息出错.");
				LOGGER.info("get investor info error, param=[{}]", JSON.toJSONString(invesReq));
				return bean;
			}
			Investor investor = invesList.get(0);
			model.setInvestorId(investor.getId());
			LOGGER.info("request appointment  queryList, param=[{}]", JSON.toJSONString(model));
			Integer i = model.getPage();
			if (i != null) {
				model.setPage(i * model.getPageSize());
			}
			model.setOrderBy("FIELD(a.state,0,1,3,2) asc ,a.appoint_time desc");
			list = appointmentServiceImpl.myqueryList(model);
			bean.setCode(1);
			bean.setMessage("获取预约记录成功");
			bean.setData(list);
		} catch (Exception e) {
			bean.setCode(0);
			bean.setMessage("获取预约记录失败");
			LOGGER.error("get appointment list error, errorMsg=[{}].", e.getMessage());
		}
		return bean;
	}

	/**
	 * 投后用户新增产品预约
	 * 
	 * @param model
	 * @return JsonBean
	 */
	@ResponseBody
	@RequestMapping("/doAdd")
	public JsonBean doAdd(AppoReqBean model) {
		JsonBean bean = new JsonBean();
		try {
			if (StringUtils.isBlank(model.getCustomerId()) || StringUtils.isBlank(model.getProductId())
					|| StringUtils.isBlank(model.getOrgId())) {
				bean.setCode(0);
				bean.setMessage("参数错误.");
				return bean;
			}
			String customerId = model.getCustomerId();
			String productId = model.getProductId();
			String orgId = model.getOrgId();
			String orderAmount = "";
			if(!StringUtils.isBlank(model.getOrderAmount())){
				orderAmount = model.getOrderAmount().replace(" ", "");
			}
			// 获取用户信息
			Customer customer = customerServiceImpl.get(customerId);
			if (customer == null) {
				bean.setCode(0);
				bean.setMessage("您的投资人信息不存在.");
				return bean;
			}
			// 查询用户所在机构投资人信息
			Investor invesReq = new Investor();
			invesReq.setOrgId(orgId);
			invesReq.setMobile(customer.getMobile());
			List<Investor> invesList = investorServiceImpl.pagedList(invesReq);
			if (invesList.size() != 1) {
				bean.setCode(0);
				bean.setMessage("获取投资人信息出错.");
				return bean;
			}
			Investor investor = invesList.get(0);
			// 判断所属理财师是否存在
			if ("".equals(investor.getEmployeeId())) {
				bean.setCode(0);
				bean.setMessage("您暂时还没有专属理财师,请联系管理员!");
				return bean;
			}
			// 判断预约单能否添加
			Appointment temp = new Appointment();
			temp.setInvestorId(investor.getId());
			temp.setProductId(productId);
			temp.setOrgId(orgId);
			temp.setState(0);
			List<Appointment> exist = appointmentServiceImpl.pagedList(temp);
			if (exist.size() > 0) {
				bean.setMessage("该产品已预约，请到我的预约查看");
				bean.setCode(2);
				bean.setData(exist.get(0).getId());
				return bean;
			}
			// 新增预约参数配置
			Appointment app = new Appointment();
			app.setId(ObjectId.get().toString());
			app.setAllocated(false);
			Date nowDate = new Date();
			Date appoTime = null;
			if (model.getAppointTime() == null) {
				appoTime = new Date();
			} else {
				appoTime = model.getAppointTime();
				long diff = nowDate.getTime() - appoTime.getTime();
				if (diff >= 0) {
					bean.setCode(0);
					bean.setMessage("预约时间输入有误!");
					return bean;
				}
			}
			app.setAppointTime(appoTime);
			app.setCreateTime(nowDate);
			app.setEmployeeId(investor.getEmployeeId());
			app.setInvestorId(investor.getId());
			if (null != orderAmount && !"".equals(orderAmount)) {
				Product p = productServiceImpl.get(productId);
				BigDecimal subStart = p.getSubStart();//投资起点
				BigDecimal available = p.getAvailable();//可买金额
				BigDecimal orderAmountBig = BigDecimal.valueOf(Double.parseDouble(orderAmount));
				if(orderAmountBig.compareTo(available) == 1 || orderAmountBig.compareTo(subStart) == -1){
					bean.setCode(0);
					bean.setMessage("预约金额输入有误!");
					return bean;
				}else{
					app.setOrderAmount(orderAmountBig);
				}
			}
			app.setOrgId(orgId);
			Product product = productServiceImpl.get(productId);
			if (product != null) {
				app.setProductBriefName(product.getBriefName());
				app.setProductName(product.getProductName());
			} else {
				bean.setCode(0);
				bean.setMessage("预约产品不存在!");
				return bean;
			}
			Employee employee = employeeServiceImpl.get(investor.getEmployeeId());
			if (employee != null) {
				app.setEmployeeName(employee.getName());
			}
			app.setProductId(productId);
			app.setReserved(false);
			app.setState(0);
			int result = appointmentServiceImpl.save(app);
			if (result == 1) {
				bean.setMessage("新增预约成功.");
				bean.setCode(1);
				LOGGER.info("doAdd appointment  success.");
			} else {
				bean.setCode(0);
				bean.setMessage("新增预约失败.");
				LOGGER.error("doAdd appointment  error.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			bean.setCode(0);
			bean.setMessage("新增预约失败");
			LOGGER.error("doAdd appointment  error, errorMsg=[{}].", e.getMessage());
		}
		return bean;
	}
}
