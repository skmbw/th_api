package com.cfu666.cs.my.action;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.alibaba.fastjson.JSON;
import com.cfu666.cs.customer.model.Customer;
import com.cfu666.cs.customer.service.spi.CustomerService;
import com.cfu666.cs.employee.model.Employee;
import com.cfu666.cs.employee.service.spi.EmployeeService;
import com.cfu666.cs.favorite.model.Favorite;
import com.cfu666.cs.favorite.service.spi.FavoriteService;
import com.cfu666.cs.feedback.model.Feedback;
import com.cfu666.cs.feedback.service.spi.FeedbackService;
import com.cfu666.cs.investor.model.Investor;
import com.cfu666.cs.investor.service.spi.InvestorService;
import com.cfu666.cs.my.bean.EmployeeResBean;
import com.cfu666.cs.my.bean.FavoriteReqBean;
import com.cfu666.cs.my.bean.FavoriteResBean;
import com.cfu666.cs.my.bean.FeedbackReqBean;
import com.cfu666.cs.my.bean.VersionResBean;
import com.cfu666.cs.org.model.Org;
import com.cfu666.cs.org.service.spi.OrgService;
import com.cfu666.cs.utils.ImgType;
import com.cfu666.cs.utils.MyFileUtils;
import com.cfu666.cs.version.model.Version;
import com.cfu666.cs.version.model.VersionBean;
import com.cfu666.cs.version.service.spi.VersionService;
import com.vteba.utils.common.PropUtils;
import com.vteba.utils.id.ObjectId;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 我的控制器
 * @author yinlei
 * @date 2015-10-29 15:44:32
 */
@Controller
@RequestMapping("/my")
public class MyAction extends GenericAction<Favorite> {
	private static final Logger LOGGER = LogManager.getLogger(MyAction.class);
	
	@Inject
	private FavoriteService favoriteServiceImpl;
	@Inject
	private CustomerService customerServiceImpl;
	@Inject
	private InvestorService investorServiceImpl;
	@Inject
	private EmployeeService employeeServiceImpl;
	@Inject
	private OrgService orgServiceImpl;
	@Inject
	private FeedbackService feedbackServiceImpl;
	@Inject
	private VersionService versionServiceImpl;
	
	public static final String IMAGES_URL = PropUtils.get("images.url");
	private static final Pattern IMAGE = Pattern
			.compile("^[\u4e00-\u9fffa-zA-Z0-9_\\(\\)\\-\\s.]+.(jpg|jpeg|gif|png|bmp)$");
	
	@ResponseBody
	@RequestMapping("/getNewestVersion")
	public JsonBean getNewestVersion(HttpServletRequest httpRequest) {
		JsonBean json = new JsonBean();
		try {
//			String UserAgent = httpRequest.getHeader("User-Agent");
//			UserAgent = UserAgent.substring(UserAgent.indexOf("(")+1, UserAgent.indexOf(")"));
//			if(UserAgent.indexOf("Android") == -1){
//				json.setCode(0);
//				json.setMessage("请求来之非安卓平台，请确认后重试");
//				return json;
//			}else{
				String versionNumber = httpRequest.getParameter("versionNumber");
				String productSerial = httpRequest.getParameter("productSerial");
				VersionResBean vrb = new VersionResBean();
				// 验证参数
				if (StringUtils.isAnyBlank(productSerial, versionNumber)) {
					LOGGER.info("params is null");
					json.setCode(0);
					json.setMessage("版本号或产品号不能为空");
					return json;
				}
				if(! versionNumber.matches("^\\d+(\\.\\d+)*$")){
					json.setCode(0);
					json.setMessage("检查版本号格式");
					return json;
				}
				
				LOGGER.info("request version newest. param=[{}]", JSON.toJSONString(versionNumber+productSerial));
				Version versionNewest = null;
				VersionBean versionBean = new VersionBean();
				Date date = new Date();
				versionBean.setOrderBy("update_time desc");
				versionBean.createCriteria().andProductSerialEqualTo(productSerial)
						.andUpdateTimeLessThanOrEqualTo(date);
				try {
					versionNewest = versionServiceImpl.pagedForList(versionBean).get(0);
				} catch (Exception e) {
					LOGGER.error("get version newest error, errorMsg=[{}].", e.getMessage());
					json.setCode(0);
					json.setMessage("找不到该产品对应版本信息，如有疑问，请联系管理员！");
					return json;
				}
				if(versionNewest == null){
					json.setCode(1);
					json.setMessage("找不到该产品对应版本信息，如有疑问，请联系管理员！");
					return json;
				}
				LOGGER.info("newest version param=[{}]", JSON.toJSONString(versionNewest));
				// 判断当前版本是否为最近版本
				// 封装json
				if (1 == versionCompareTo(versionNumber, versionNewest.getVersionNumber())) {
					json.setCode(1);
					json.setMessage("已是最新版本，如有疑问，请联系管理员！");
					return json;
				}
				if (true == versionNewest.getTips()) {
					vrb.setUpdate(true);
				} else {
					vrb.setUpdate(false);
				}
				if (-1 == versionCompareTo(versionNumber, versionNewest.getUpdateLowestVersion())) {
					vrb.setForceUpdate(true);
				} else {
					vrb.setForceUpdate(false);
				}
				vrb.setDownloadUrl(versionNewest.getDownloadUrl());
				vrb.setUpdateTime(versionNewest.getUpdateTime());
				vrb.setUpdateDescription(versionNewest.getUpdateDescription());
				vrb.setVersionNumber(versionNewest.getVersionNumber());
				json.setCode(1);
				json.setMessage(SUCCESS);
				json.setData(vrb);
//			}
		} catch (Exception e) {
			LOGGER.error("get version newest error, errorMsg=[{}].", e.getMessage());
			json.setCode(0);
			json.setMessage(ERROR);
			return json;
		}
		return json;
	}
	
	/**
	 * 获得收藏List，Json格式。
	 * @param model 参数
	 * @return 收藏List
	 */
	@ResponseBody
	@RequestMapping("/favoriteList")
	public JsonBean list(Favorite model) {
		JsonBean json = new JsonBean();
		if(StringUtils.isAnyBlank(model.getCustomerId(),model.getOrgId())){
			json.setCode(0);
			json.setMessage("请检查参数个数");
			return json;
		}
		List<FavoriteResBean> list = null;
		try {
			Integer i = model.getPage();
			if (i != null) {
				model.setPage(i * model.getPageSize());
			}
			list = favoriteServiceImpl.getFavoriteResBeanList(model);
			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(list);
		} catch (Exception e) {
			LOGGER.error("get favoriteList list error, errorMsg=[{}].", e.getMessage());
			json.setCode(0);
			json.setMessage(ERROR);
			return json;
		}
		return json;
	}
	
	/**
     * 收藏操作
     * @param model 收藏相关数据 
     * @param model.type 1.收藏 2.取消收藏
     * @return json
     */
    @ResponseBody
    @RequestMapping("/favorite")
    public JsonBean favorite(FavoriteReqBean model) {
    	JsonBean bean = new JsonBean();
    	if(StringUtils.isAnyBlank(model.getCustomerId(),model.getOrgId(),model.getProductId()) || model.getType() == null){
    		bean.setCode(0);
    		bean.setMessage("请检查参数个数");
			return bean;
		}
    	try {
    		if(1 == model.getType()){
    			Favorite fa = new Favorite();
    			
    			fa.setCustomerId(model.getCustomerId());
    			fa.setOrgId(model.getOrgId());
    			fa.setProductId(model.getProductId());
    			Favorite f = favoriteServiceImpl.unique(fa);
    			if(f != null){
    				bean.setCode(0);
                    bean.setMessage("请勿重复收藏");
                    LOGGER.error("产品已收藏");
                    return bean;
    			}
    			
    			fa.setCreateTime(new Date());
    			fa.setId(ObjectId.get().toString());
    			
    			int result = favoriteServiceImpl.save(fa);
    			if (result == 1) {
                    bean.setMessage(SUCCESS);
                    bean.setCode(1);
                    LOGGER.info("save record success.");
                } else {
                	bean.setCode(0);
                    bean.setMessage(ERROR);
                    LOGGER.error("save record error.");
                }
    		}else if(2 == model.getType()){
    			Favorite fa = new Favorite();
    			fa.setCustomerId(model.getCustomerId());
    			fa.setOrgId(model.getOrgId());
    			fa.setProductId(model.getProductId());
    			int result = favoriteServiceImpl.deleteBulks(fa);
    			if (result == 1) {
                    bean.setMessage(SUCCESS);
                    bean.setCode(1);
                    LOGGER.info("delete record success.");
                } else {
                	bean.setCode(0);
                    bean.setMessage(ERROR);
                    LOGGER.error("delete record error.");
                }
    		}
		} catch (Exception e) {
			LOGGER.error("save record error, errorMsg=[{}].", e.getMessage());
			bean.setMessage(ERROR);
		}
        return bean;
    }
    
    /**
	 * 获得我的理财师，Json格式。
	 * @param model 参数
	 * @return json
	 */
	@ResponseBody
	@RequestMapping("/employee")
	public JsonBean employee(Favorite model) {
		JsonBean json = new JsonBean();
		if(StringUtils.isAnyBlank(model.getCustomerId(),model.getOrgId())){
			json.setCode(0);
			json.setMessage("请检查参数个数");
			return json;
		}
		try {
			Customer customer = customerServiceImpl.get(model.getCustomerId());
			if(null == customer){
				json.setCode(0);
				json.setMessage("客户不存在");
				return json;
			}
			Investor inv = new Investor();
			inv.setMobile(customer.getMobile());
			inv.setOrgId(model.getOrgId());
			inv = investorServiceImpl.unique(inv);
			if(null == inv){
				json.setCode(0);
				json.setMessage("机构中不存在该投资人");
				return json;
			}
			Employee e = employeeServiceImpl.get(inv.getEmployeeId());
			if(null == e){
				json.setCode(0);
				json.setMessage("机构中不存在该理财师");
				return json;
			}
			Org org = orgServiceImpl.get(e.getOrgId());
			EmployeeResBean empResBean = new EmployeeResBean();
			empResBean.setAddress(e.getAddress());
			empResBean.setAvatar(e.getAvatar());
			empResBean.setEmail(e.getEmail());
			empResBean.setEmployeeId(e.getEmployeeId());
			empResBean.setGender(e.getGender());
			empResBean.setMobile(e.getMobile());
			empResBean.setEmployeeName(e.getName());
			empResBean.setOrgBriefName(org.getBriefName());
			empResBean.setOrgName(org.getName());
			
			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(empResBean);
		} catch (Exception e) {
			LOGGER.error("fetch employee error, errorMsg=[{}].", e.getMessage());
			json.setCode(0);
			json.setMessage(ERROR);
			return json;
		}
		return json;
	}
	
	/**
	 * 修改头像。
	 * @param model 参数
	 * @return json
	 */
	@ResponseBody
	@RequestMapping("/changeAvatar")
	public JsonBean changeAvatar(HttpServletRequest request) {
		JsonBean json = new JsonBean();
		try {
			String customerId = request.getParameter("customerId");
//			String orgId = request.getParameter("orgId");
			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
			// 获得头像文件
			MultipartFile firstFile = multipartRequest.getFile("avatar");
			
			// 判断customerId是否传过来
			if (StringUtils.isBlank(customerId)) {
				json.setCode(0);
				json.setMessage("customerId are required");
				return json;
			}
			if(firstFile == null){
				json.setCode(0);
				json.setMessage("avatar file are required");
				return json;
			}
			if(! IMAGE.matcher(firstFile.getOriginalFilename()).matches()){
				json.setCode(0);
				json.setMessage("上传的图片格式有问题!");
				return json;
			}
			Customer customer = customerServiceImpl.get(customerId);
			String oldAvatarPath = customer.getAvatar();
			String avatar = null;
			avatar = MyFileUtils.uploadImg(firstFile, ImgType.CUSTOMER);
			customer.setAvatar(avatar);
			
			//删除原来的头像
			String filePath =IMAGES_URL+ oldAvatarPath;
			File files = new File(filePath);
			MyFileUtils.deleteFileDir(files);
			if (null != files) {
				files.delete();
			}
			
			int result = customerServiceImpl.updateById(customer);
			if(1 == result){
				json.setCode(1);
				json.setMessage(SUCCESS);
				json.setData(avatar);
			}else{
				json.setCode(0);
				json.setMessage("头像保存出错");
				//删除刚刚上传的头像
				String filePath1 =IMAGES_URL+ avatar;
				File files1 = new File(filePath1);
				MyFileUtils.deleteFileDir(files1);
				if (null != files1) {
					files.delete();
				}
			}
		} catch (Exception e) {
			LOGGER.error("change avatar error, errorMsg=[{}].", e.getMessage());
			json.setCode(0);
			json.setMessage(ERROR);
			return json;
		}
		return json;
	}
	
	/**
	 * 意见反馈
	 * @param model 参数
	 * @return json
	 */
	@ResponseBody
	@RequestMapping("/feedback")
	public JsonBean feedback(FeedbackReqBean model) {
		JsonBean json = new JsonBean();
		if(StringUtils.isAnyBlank(model.getCustomerId(),model.getContent())){
			json.setCode(0);
			json.setMessage("请检查参数");
			return json;
		}
		try {
			Customer customer = customerServiceImpl.get(model.getCustomerId());
			if(null == customer){
				json.setCode(0);
				json.setMessage("用户不存在");
				return json;
			}
			
			Feedback fd = new Feedback();
			fd.setContent(model.getContent());
			fd.setCreateTime(new Date());
			fd.setId(ObjectId.get().toString());
			fd.setSource("3");
			fd.setInvestorId(customer.getId());
			fd.setSubmitPlatform(true);
			fd.setReply(false);
			
			int result = feedbackServiceImpl.save(fd);
			
			if(1 == result){
				json.setCode(1);
				json.setMessage(SUCCESS);
			}else{
				json.setCode(0);
				json.setMessage(ERROR);
			}
		} catch (Exception e) {
			LOGGER.error("save feedback error, errorMsg=[{}].", e.getMessage());
			json.setCode(0);
			json.setMessage(ERROR);
			return json;
		}
		return json;
	}
	
	/**
	 * 版本比较器
	 * @param v1
	 * @param v2
	 * @return 1- v1>=v2 -1- v1<v2
	 */
	protected int versionCompareTo(String v1, String v2) {
		String[] a1 = v1.split("\\.");
		String[] a2 = v2.split("\\.");
		int minLength = a1.length >= a2.length ? a2.length : a1.length;
		for (int i = 0; i < minLength;i++) {
			if (1 == Integer.compare(Integer.parseInt(a1[i]), Integer.parseInt(a2[i]))) {
				return 1;
			} else if(-1 == Integer.compare(Integer.parseInt(a1[i]), Integer.parseInt(a2[i]))){
				return -1;
			}
		}
		if (a1.length >= a2.length) {
			return 1;
		} else {
			return -1;
		}
	}
}
