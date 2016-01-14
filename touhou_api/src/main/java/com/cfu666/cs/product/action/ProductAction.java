package com.cfu666.cs.product.action;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.commons.collections.ListUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.cfu666.cs.employee.model.Employee;
import com.cfu666.cs.employee.service.spi.EmployeeService;
import com.cfu666.cs.favorite.model.Favorite;
import com.cfu666.cs.favorite.service.spi.FavoriteService;
import com.cfu666.cs.my.bean.FundManagerResBean;
import com.cfu666.cs.product.bean.EmployeeInfo;
import com.cfu666.cs.product.bean.ProductInfo;
import com.cfu666.cs.product.bean.ProductInvestDetailResBean;
import com.cfu666.cs.product.bean.ProductInvestResBean;
import com.cfu666.cs.product.bean.ProductInvestorDeatil;
import com.cfu666.cs.product.bean.ProductNetReqBean;
import com.cfu666.cs.product.bean.ProductReqBean;
import com.cfu666.cs.product.bean.ProductResBean;
import com.cfu666.cs.product.model.FundManagerProduct;
import com.cfu666.cs.product.model.InvestReport;
import com.cfu666.cs.product.model.Product;
import com.cfu666.cs.product.model.ProductAttachment;
import com.cfu666.cs.product.model.ProductGrade;
import com.cfu666.cs.product.model.ProductNet;
import com.cfu666.cs.product.service.spi.FundManagerProductService;
import com.cfu666.cs.product.service.spi.InvestReportService;
import com.cfu666.cs.product.service.spi.ProductAttachmentService;
import com.cfu666.cs.product.service.spi.ProductGradeService;
import com.cfu666.cs.product.service.spi.ProductNetService;
import com.cfu666.cs.product.service.spi.ProductService;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.vteba.web.editer.DoubleEditor;
import com.vteba.web.editer.IntEditor;
import com.vteba.web.editer.LongEditor;
import com.vteba.web.editer.StringEditor;

/**
 * 产品控制器
 * 
 * @author yinlei
 * @date 2015-11-4 10:14:40
 */
@Controller
@RequestMapping("/product")
public class ProductAction extends GenericAction<Product> {
	private static final Logger LOGGER = LogManager.getLogger(ProductAction.class);

	@Inject
	private ProductService productServiceImpl;
	@Inject
	private ProductAttachmentService productAttachmentServiceImpl;
	@Inject
	private FundManagerProductService fundManagerProductServiceImpl;
	@Inject
	private ProductNetService productNetServiceImpl;
	@Inject
	private FavoriteService favoriteServiceImpl;
	@Inject
	private ProductGradeService productGradeServiceImpl;
	@Inject
	private InvestReportService investReportServiceImpl;
	@Inject
	private EmployeeService employeeServiceImpl;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat(
				"yyyy-MM-dd"), true));
		binder.registerCustomEditor(int.class, new IntEditor());
		binder.registerCustomEditor(long.class, new LongEditor());
		binder.registerCustomEditor(double.class, new DoubleEditor());
		binder.registerCustomEditor(String.class, new StringEditor());
	}

	/**
	 * 获得我的产品List/订购列表，Json格式。
	 * 
	 * @param model
	 *            参数
	 * @return 产品List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public JsonBean list(ProductReqBean productReqBean) {
		JsonBean jsonBean = new JsonBean();

		try {
			// 发起请求的参数,以后直接用AOP代替
			LOGGER.info("request product list, param=[{}]", JSON.toJSONString(productReqBean));

			// 员工id是必传的
			String customerId = productReqBean.getCustomerId();
			String orgId = productReqBean.getOrgId();

			if (StringUtils.isBlank(customerId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("用户Id不能为空");
				LOGGER.error("customerId is required, customerId = [{}]", customerId);
				return jsonBean;
			}

			if (StringUtils.isBlank(orgId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("机构Id不能为空");
				LOGGER.error("orgId is required, orgId = [{}]", orgId);
				return jsonBean;
			}

			Integer page = productReqBean.getPage();
			if (null != page) {
				productReqBean.setPage(page * productReqBean.getPageSize());
			}

			List<ProductResBean> list = productServiceImpl.list(productReqBean);
			LOGGER.info("query product list success,  size=[{}]", list.size());

			jsonBean.setCode(1);
			jsonBean.setData(list);
			jsonBean.setMessage(SUCCESS);
		} catch (Exception e) {
			LOGGER.error("fetch product list error, error=[{}]", e.getMessage());
			jsonBean.setCode(0);
			jsonBean.setMessage("fetch product list error");
		}

		return jsonBean;
	}

	/**
	 * 获得我的产品详情，Json格式。
	 * 
	 * @param model
	 *            参数
	 * @return 产品List
	 */
	@ResponseBody
	@RequestMapping("/detail")
	public JsonBean detail(ProductReqBean productReqBean) {
		JsonBean jsonBean = new JsonBean();

		try {
			// 发起请求的参数
			LOGGER.info("request product detail, param=[{}]", JSON.toJSONString(productReqBean));

			String customerId = productReqBean.getCustomerId();
			String productId = productReqBean.getProductId();
			String orgId = productReqBean.getOrgId();
			if (StringUtils.isBlank(customerId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("用户Id不能为空");
				LOGGER.error("customerId is required, customerId = [{}]", customerId);
				return jsonBean;
			}

			if (StringUtils.isBlank(productId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("产品Id不能为空");
				LOGGER.error("productId is required, productId = [{}]", productId);
				return jsonBean;
			}

			if (StringUtils.isBlank(orgId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("机构Id不能为空");
				LOGGER.error("orgId is required, orgId = [{}]", orgId);
				return jsonBean;
			}

			// 查询产品详情

			Product product = productServiceImpl.get(productId);
			LOGGER.info("query product detail success, productId=[{}]", product.getId());

			ProductInfo productInfo = new ProductInfo();

			// 产品基础信息
			productInfo.setProductBase(product);

			// 是否有收益分配
			ProductGrade productGradeParam = new ProductGrade();
			productGradeParam.setProductId(productId);
			List<ProductGrade> pgList = productGradeServiceImpl.queryList(productGradeParam);
			productInfo.setHaveIncomeDivide(!(pgList == null || pgList.size() == 0));

			// 是否有产品附件（相关文件）
			ProductAttachment productAttachmentParam = new ProductAttachment();
			productAttachmentParam.setProductId(productId);
			List<ProductAttachment> paList = productAttachmentServiceImpl
					.queryList(productAttachmentParam);
			productInfo.setHaveProductAttachment(!(paList == null || paList.size() == 0));

			// 是否有基金经理
			FundManagerProduct fundManagerProductParam = new FundManagerProduct();
			fundManagerProductParam.setProductId(productId);
			List<FundManagerProduct> fmpList = fundManagerProductServiceImpl
					.queryList(fundManagerProductParam);
			productInfo.setHaveFundManager(!(fmpList == null || fmpList.size() == 0));

			// 是否有基金业绩
			ProductNet productNetParam = new ProductNet();
			productNetParam.setProductId(productId);
			List<ProductNet> pnList = productNetServiceImpl.queryList(productNetParam);
			productInfo.setHaveProductNet(!(pnList == null || pnList.size() == 0));

			// 咨询电话，专属理财师咨询电话
			Employee employee = employeeServiceImpl.getEmployeeByCustomer(productReqBean);
			productInfo.setConsultPhone(employee.getMobile());

			// 分享内容，待定，TODO

			// 是否已收藏
			Favorite favoriteParam = new Favorite();
			favoriteParam.setCustomerId(customerId);
			favoriteParam.setProductId(productId);
			favoriteParam.setOrgId(orgId);
			Favorite favorite = favoriteServiceImpl.unique(favoriteParam);
			productInfo.setHaveFavorite(favorite != null);

			// 封装jsonBean
			jsonBean.setCode(1);
			jsonBean.setData(productInfo);
			jsonBean.setMessage(SUCCESS);

		} catch (Exception e) {
			LOGGER.error("fetch product detail error, error=[{}]", e.getMessage());
			jsonBean.setCode(0);
			jsonBean.setMessage("fetch product detail error");
		}

		return jsonBean;
	}

	/**
	 * 获得我的产品List/订购列表，Json格式。
	 * 
	 * @param model
	 *            参数
	 * @return 产品List
	 */
	@ResponseBody
	@RequestMapping("/investList")
	public JsonBean investList(ProductReqBean productReqBean) {
		JsonBean jsonBean = new JsonBean();

		try {
			// 发起请求的参数,以后直接用AOP代替
			LOGGER.info("request product list, param=[{}]", JSON.toJSONString(productReqBean));

			// 员工id是必传的
			String customerId = productReqBean.getCustomerId();
			String orgId = productReqBean.getOrgId();

			if (StringUtils.isBlank(customerId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("用户Id不能为空");
				LOGGER.error("customerId is required, customerId = [{}]", customerId);
				return jsonBean;
			}

			if (StringUtils.isBlank(orgId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("机构Id不能为空");
				LOGGER.error("orgId is required, orgId = [{}]", orgId);
				return jsonBean;
			}

			Integer page = productReqBean.getPage();
			if (null != page) {
				productReqBean.setPage(page * productReqBean.getPageSize());
			}

			List<ProductInvestResBean> list = productServiceImpl.investList(productReqBean);
			LOGGER.info("query product list success,  size=[{}]", list.size());

			jsonBean.setCode(1);
			jsonBean.setData(list);
			jsonBean.setMessage(SUCCESS);
		} catch (Exception e) {
			LOGGER.error("fetch invest product list error, error=[{}]", e.getMessage());
			jsonBean.setCode(0);
			jsonBean.setMessage("获取投资列表失败！");
		}

		return jsonBean;
	}

	/**
	 * 获得我的产品详情，Json格式。
	 * 
	 * @param model
	 *            参数
	 * @return 产品List
	 */
	@ResponseBody
	@RequestMapping("/investDetail")
	public JsonBean investDetail(ProductReqBean productReqBean) {
		JsonBean jsonBean = new JsonBean();

		try {
			// 发起请求的参数
			LOGGER.info("request investDetail, param=[{}]", JSON.toJSONString(productReqBean));

			String customerId = productReqBean.getCustomerId();
			String orderId = productReqBean.getOrderId();
			String orgId = productReqBean.getOrgId();
			if (StringUtils.isBlank(customerId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("用户Id不能为空");
				LOGGER.error("customerId is required, customerId = [{}]", customerId);
				return jsonBean;
			}

			if (StringUtils.isBlank(orderId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("订单Id不能为空");
				LOGGER.error("orderId is required, orderId = [{}]", orderId);
				return jsonBean;
			}

			if (StringUtils.isBlank(orgId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("机构Id不能为空");
				LOGGER.error("orgId is required, orgId = [{}]", orgId);
				return jsonBean;
			}

			ProductInvestDetailResBean investDetail = productServiceImpl
					.investDetail(productReqBean);
			LOGGER.info("query investDetail success, orderId=[{}]", investDetail.getOrderId());

			// 查询投后报告
			InvestReport investReportParam = new InvestReport();
			investReportParam.setProductId(investDetail.getProductId());
			investReportParam.setOrgId(orgId);
			List<InvestReport> investReportList = investReportServiceImpl
					.queryList(investReportParam);
			if (null != investReportList) {
				for (InvestReport report : investReportList) {
					File reportFile = new File(report.getFilePath());
					report.setSize(reportFile.length());
				}
			}

			ProductInvestorDeatil productInvestorDeatil = new ProductInvestorDeatil();

			productInvestorDeatil.setOrderId(investDetail.getOrderId());
			productInvestorDeatil.setProduct(productServiceImpl.get(investDetail.getProductId()));
			EmployeeInfo employeeInfo = new EmployeeInfo();
			employeeInfo.setEmployeeId(investDetail.getEmployeeId());
			employeeInfo.setEmployeeName(investDetail.getEmployeeName());
			employeeInfo.setEmployeeAvatar(investDetail.getEmployeeAvatar());
			employeeInfo.setEmployeePhone(investDetail.getEmployeePhone());
			productInvestorDeatil.setEmployeeInfo(employeeInfo);

			productInvestorDeatil.setOrgBriefName(investDetail.getOrgBriefName());
			productInvestorDeatil.setInvestAmount(investDetail.getInvestAmount());
			productInvestorDeatil.setSubTime(investDetail.getSubTime());
			productInvestorDeatil.setContactFile(investDetail.getContactFile());
			productInvestorDeatil.setOrderState(investDetail.getOrderState());
			productInvestorDeatil.setInvestReportList(investReportList);

			// 封装jsonBean
			jsonBean.setCode(1);
			jsonBean.setData(productInvestorDeatil);
			jsonBean.setMessage(SUCCESS);

		} catch (Exception e) {
			LOGGER.error("fetch investDetail error, error=[{}]", e.getMessage());
			jsonBean.setCode(0);
			jsonBean.setMessage("fetch investDetail error");
		}

		return jsonBean;
	}

	/**
	 * 获得基金经理，Json格式。
	 * 
	 * @param model
	 *            参数
	 * @return 基金经理List
	 */
	@ResponseBody
	@RequestMapping("/fundManager")
	public JsonBean fundManager(Favorite model) {
		JsonBean json = new JsonBean();
		if (StringUtils.isAnyBlank(model.getCustomerId(), model.getOrgId(), model.getProductId())) {
			json.setCode(0);
			json.setMessage("请检查参数个数");
			return json;
		}
		List<FundManagerResBean> list = null;
		try {
			FundManagerProduct mp = new FundManagerProduct();
			mp.setProductId(model.getProductId());
			list = fundManagerProductServiceImpl.getfundManagerResBeanList(mp);
			json.setCode(1);
			json.setMessage(SUCCESS);
			if (list == null || list.size() == 0) {
				json.setData(ListUtils.EMPTY_LIST);
			} else {
				json.setData(list);
			}
		} catch (Exception e) {
			LOGGER.error("get fundManager list error, errorMsg=[{}].", e.getMessage());
			json.setCode(0);
			json.setMessage(ERROR);
			return json;
		}
		return json;
	}

	/**
	 * 获取产品列表页面，仅仅只是页面而已
	 * 
	 * @param model
	 *            参数
	 * @return 产品List
	 */
	@RequestMapping("/share/{id}")
	public String share(@PathVariable("id") String id, Map<String, Object> maps) {
		try {
			// 获取产品详情
			Product product = productServiceImpl.get(id);
			ProductGrade productGradeParam = new ProductGrade();
			productGradeParam.setProductId(id);
			maps.put("product", product);

			// 获取产品档次
			List<ProductGrade> productGradeList = productGradeServiceImpl
					.pagedList(productGradeParam);
			maps.put("productGradeList", productGradeList);
		} catch (Exception e) {
			LOGGER.error("get wap detail error, errorMsg=[{}].", e.getMessage());
		}

		return "wap/detail";
	}

	@ResponseBody
	@RequestMapping("/net")
	public JsonBean net(ProductNetReqBean productNetReqBean) {
		JsonBean json = new JsonBean();
		try {
			String productId = productNetReqBean.getProductId();
			String orgId = productNetReqBean.getOrgId();
			String timeRange = productNetReqBean.getTimeRange();
			if (StringUtils.isAnyBlank(productId, orgId, timeRange)) {
				json.setCode(0);
				json.setMessage("请检查参数个数");
				LOGGER.error("param is error, productId=[{}], timeRange=[{}].", productId,
						timeRange);
				return json;
			}

			Calendar c = Calendar.getInstance();
			switch (timeRange) {
			case "近一月":
				c.add(Calendar.MONTH, -1);
				break;
			case "近三月":
				c.add(Calendar.MONTH, -3);
				break;
			case "近六月":
				c.add(Calendar.MONTH, -6);
				break;
			case "近一年":
				c.add(Calendar.MONTH, -12);
				break;
			default:
				break;
			}

			productNetReqBean.setStartTime(c.getTime());
			productNetReqBean.setEndTime(new Date());
			List<ProductNet> list = productNetServiceImpl.list(productNetReqBean);
			List<String> netDate = new ArrayList<String>();
			List<Double> netData = new ArrayList<Double>();

			if (null != list) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				int n = list.size();
				for (int i = n - 1; i >= 0; i--) {
					if (n > 6) {
						if (i == 0 || i == n - 1 || i % (n / 6) == 0) {
							netDate.add(sdf.format(list.get(i).getDate()));
							netData.add(list.get(i).getUnitNet());
						}
					} else {
						netDate.add(sdf.format(list.get(i).getDate()));
						netData.add(list.get(i).getUnitNet());
					}

					if (netData.size() >= 6) {
						break;
					}
				}
			}

			json.setCode(1);

			Map<String, Object> map = new HashMap<String, Object>();
			Collections.reverse(netDate);
			Collections.reverse(netData);
			map.put("netDate", netDate);
			map.put("netData", netData);
			json.setData(map);
		} catch (Exception e) {
			json.setCode(0);
			json.setMessage("获取净值失败！");
			LOGGER.error("get net list error, msg=[{}].", e.getMessage());
		}

		return json;
	}
}
