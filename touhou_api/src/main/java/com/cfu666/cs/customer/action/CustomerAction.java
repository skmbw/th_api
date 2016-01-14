package com.cfu666.cs.customer.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cfu666.cs.consts.Consts;
import com.cfu666.cs.customer.bean.CusReqBean;
import com.cfu666.cs.customer.bean.OrgResBean;
import com.cfu666.cs.customer.model.Customer;
import com.cfu666.cs.customer.service.spi.CustomerService;
import com.cfu666.cs.investor.model.Investor;
import com.cfu666.cs.investor.service.spi.InvestorService;
import com.cfu666.cs.org.model.Org;
import com.cfu666.cs.org.service.spi.OrgService;
import com.cfu666.cs.token.TokenService;
import com.cfu666.cs.utils.SmsUtils;
import com.vteba.cache.redis.RedisService;
import com.vteba.utils.common.PropsUtils;
import com.vteba.utils.id.ObjectId;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 客户控制器
 * 
 * @author yinlei
 * @date 2015-11-4 10:32:35
 */
@Controller
@RequestMapping("/customer")
public class CustomerAction extends GenericAction<Customer> {
	private static final Logger LOGGER = LogManager.getLogger(CustomerAction.class);

	@Inject
	private CustomerService customerServiceImpl;
	@Inject
	private InvestorService investorServiceImpl;
	@Inject
	private PasswordEncoder bcryptPasswordEncoder;
	@Inject
	private TokenService tokenService;
	@Inject
	private RedisService<String, String> redisService;
	@Inject
	private OrgService orgServiceImpl;

	/**
	 * 获取验证码
	 * 
	 * @param bean
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getVerificationCode")
	public JsonBean getVerificationCode(CusReqBean bean) {
		JsonBean json = new JsonBean();
		// 入参检验
		if (StringUtils.isAnyBlank(bean.getMobile())) {
			json.setCode(0);
			json.setMessage("参数不完整！");
			return json;
		}
		// 业务
		try {
			if (bean.getType() == 1) {
				String smsContent = PropsUtils.get("sms.registeMsg");
				String authCode = getAuthCode(bean.getMobile(), 1);
				smsContent = smsContent.replaceFirst("#", authCode);
				String result = SmsUtils.send(bean.getMobile(), smsContent);
				if (result.startsWith("true")) {
					json.setCode(1);
					json.setMessage(SUCCESS);
				} else {
					json.setCode(0);
					json.setMessage(result);
				}
			} else if (bean.getType() == 2) {
				String smsContent = PropsUtils.get("sms.findPasswordMsg");
				String authCode = getAuthCode(bean.getMobile(), 2);
				smsContent = smsContent.replaceFirst("#", authCode);
				String result = SmsUtils.send(bean.getMobile(), smsContent);
				if (result.startsWith("true")) {
					json.setCode(1);
					json.setMessage(SUCCESS);
				} else {
					json.setCode(0);
					json.setMessage(result);
				}
			} else {
				json.setCode(0);
				json.setMessage("type参数只能为1或者2！");
			}
		} catch (Exception e) {
			LOGGER.error("customer getVerificationCode error, errorMsg=[{}].", e.getMessage());
			json.setCode(0);
			json.setMessage(ERROR);
		}
		return json;
	}

	/**
	 * 获取短信验证码，1为注册，2为找回密码
	 * @param mobile
	 * @param type
	 * @return
	 */
	private String getAuthCode(String mobile, int type) {
		String authCode = null;
		if (type == 1) {
			authCode = redisService.get(Consts.CHECK_SMS_REGISTER + mobile);
			if (null == authCode) {
				authCode = (int) (Math.random() * 9000 + 1000) + "";
				int smsTimeout = PropsUtils.getInt("sms.timeout");// 这里是分钟为单位
				redisService.set(Consts.CHECK_SMS_REGISTER + mobile, authCode, smsTimeout * 60);
			}
		} else {
			authCode = redisService.get(Consts.CHECK_SMS_FIND_PASSWORD + mobile);
			if (null == authCode) {
				authCode = (int) (Math.random() * 9000 + 1000) + "";
				int smsTimeout = PropsUtils.getInt("sms.timeout");// 这里是分钟为单位
				redisService.set(Consts.CHECK_SMS_FIND_PASSWORD + mobile, authCode, smsTimeout * 60);
			}
		}
		return authCode;
	}

	/**
	 * 注册
	 * 
	 * @param bean
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/registe")
	public JsonBean registe(CusReqBean bean) {
		JsonBean json = new JsonBean();
		// 入参检验
		if (StringUtils.isAnyBlank(bean.getMobile(), bean.getPassword(),
				bean.getVerificationCode(), bean.getInvitationCode())) {
			json.setCode(0);
			json.setMessage("参数不完整！");
			return json;
		}
		// 业务
		try {
			// 验证短信验证码
			String authCode = redisService.get(Consts.CHECK_SMS_REGISTER + bean.getMobile());
			if (null == authCode) {
				json.setCode(0);
				json.setMessage("验证码已过期，请重新获取验证码！");
				return json;
			}
			if (!(bean.getVerificationCode().equals(authCode))) {
				json.setCode(0);
				json.setMessage("验证码错误！");
				return json;
			}
			// 验证邀请码
			Investor investor = new Investor();
			investor.setInvitationCode(bean.getInvitationCode());
			investor = investorServiceImpl.unique(investor);
			if (null == investor) {
				json.setCode(0);
				json.setMessage("邀请码不存在！");
				return json;
			}
			// 验证电话号码
			if (null == investor.getMobile()) {
				json.setCode(0);
				json.setMessage("电话号码不存在！");
				return json;
			}
			if (!(investor.getMobile().equals(bean.getMobile()))) {
				json.setCode(0);
				json.setMessage("电话号码不正确！");
				return json;
			}
			// 验证电话号码是否已经注册
			Customer customer = new Customer();
			customer.setMobile(bean.getMobile());
			customer = customerServiceImpl.unique(customer);
			if (null != customer) {
				json.setCode(0);
				json.setMessage("电话号码已经被注册！");
				return json;
			}
			customer = new Customer();
			customer.setId(ObjectId.get().toString());
			customer.setMobile(bean.getMobile());
			customer.setName(investor.getName());
			customer.setGender(investor.getGender());
			customer.setPassword(bcryptPasswordEncoder.encode(bean.getPassword()));
			int result = customerServiceImpl.registe(customer, investor);
			if (result == 1) {
				Customer cus = new Customer();
				cus.setId(customer.getId());
				cus.setGender(customer.getGender());
				cus.setName(customer.getName());
				cus.setMobile(customer.getMobile());
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("id", customer.getId());
				map.put("gender", customer.getGender());
				map.put("name", customer.getName());
				map.put("mobile", customer.getMobile());
				map.put("tokenId", tokenService.getToken(customer.getId()));
				json.setCode(1);
				json.setData(map);
				json.setMessage(SUCCESS);
				LOGGER.info("新用户注册：[{}]", customer.getId());
			} else {
				json.setCode(0);
				json.setMessage("注册失败，请稍后重试！");
			}
		} catch (Exception e) {
			LOGGER.error("customer registe error, errorMsg=[{}].", e.getMessage());
			json.setCode(0);
			json.setMessage(ERROR);
		}
		return json;
	}

	/**
	 * 登录
	 * 
	 * @param bean
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/login")
	public JsonBean login(CusReqBean bean) {
		JsonBean json = new JsonBean();
		// 入参检验
		if (StringUtils.isAnyBlank(bean.getMobile(), bean.getPassword())) {
			json.setCode(0);
			json.setMessage("参数不完整！");
			return json;
		}
		// 业务
		try {
			Customer customer = new Customer();
			customer.setMobile(bean.getMobile());
			customer = customerServiceImpl.unique(customer);
			if (null == customer) {
				json.setCode(0);
				json.setMessage("账号不存在！");
				return json;
			}
			if (!(bcryptPasswordEncoder.matches(bean.getPassword(), customer.getPassword()))) {
				json.setCode(0);
				json.setMessage("密码错误！");
				return json;
			}
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("id", customer.getId());
			result.put("name", customer.getName());
			result.put("gender", customer.getGender());
			result.put("avatar", customer.getAvatar());
			result.put("mobile", customer.getMobile());
			result.put("tokenId", tokenService.getToken(customer.getId()));
			json.setCode(1);
			json.setData(result);
			json.setMessage(SUCCESS);
		} catch (Exception e) {
			LOGGER.error("customer login error, errorMsg=[{}].", e.getMessage());
			json.setCode(0);
			json.setMessage(ERROR);
		}
		return json;
	}

	/**
	 * 找回密码
	 * 
	 * @param bean
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findPassword")
	public JsonBean findPassword(CusReqBean bean) {
		JsonBean json = new JsonBean();
		// 入参检验
		if (StringUtils
				.isAnyBlank(bean.getMobile(), bean.getPassword(), bean.getVerificationCode())) {
			json.setCode(0);
			json.setMessage("参数不完整！");
			return json;
		}
		// 业务
		try {
			Customer customer = new Customer();
			customer.setMobile(bean.getMobile());
			customer = customerServiceImpl.unique(customer);
			if (null == customer) {
				json.setCode(0);
				json.setMessage("账号不存在！");
				return json;
			}
			String authCode = redisService.get(Consts.CHECK_SMS_FIND_PASSWORD + bean.getMobile());
			if (null == authCode) {
				json.setCode(0);
				json.setMessage("验证码错误！");
				return json;
			}
			if (!(bean.getVerificationCode().equals(authCode))) {
				json.setCode(0);
				json.setMessage("验证码错误！");
				return json;
			}
			Customer customerUpdata = new Customer();
			customerUpdata.setId(customer.getId());
			customerUpdata.setPassword(bcryptPasswordEncoder.encode(bean.getPassword()));
			int result = customerServiceImpl.updateById(customerUpdata);
			if (result == 1) {
				json.setCode(1);
				json.setMessage(SUCCESS);
			} else {
				json.setCode(0);
				json.setMessage("修改失败，请稍后重试！");
			}
		} catch (Exception e) {
			LOGGER.error("customer findPassword error, errorMsg=[{}].", e.getMessage());
			json.setCode(0);
			json.setMessage(ERROR);
		}
		return json;
	}

	/**
	 * 修改密码
	 * 
	 * @param bean
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/updatePassword")
	public JsonBean updatePassword(CusReqBean bean) {
		JsonBean json = new JsonBean();
		// 入参检验
		if (StringUtils.isAnyBlank(bean.getId(), bean.getOldPassword(), bean.getNewPassword())) {
			json.setCode(0);
			json.setMessage("参数不完整！");
			return json;
		}
		// 业务
		try {
			Customer customer = customerServiceImpl.get(bean.getId());
			if (null == customer) {
				json.setCode(0);
				json.setMessage("账号不存在！");
				return json;
			}
			if (!(bcryptPasswordEncoder.matches(bean.getOldPassword(), customer.getPassword()))) {
				json.setCode(0);
				json.setMessage("旧密码错误！");
				return json;
			}
			Customer customerUpdata = new Customer();
			customerUpdata.setId(customer.getId());
			customerUpdata.setPassword(bcryptPasswordEncoder.encode(bean.getNewPassword()));
			int result = customerServiceImpl.updateById(customerUpdata);
			if (result == 1) {
				json.setCode(1);
				json.setMessage(SUCCESS);
			} else {
				json.setCode(0);
				json.setMessage("修改密码失败，请稍后重试！");
			}
		} catch (Exception e) {
			LOGGER.error("customer updatePassword error, errorMsg=[{}].", e.getMessage());
			json.setCode(0);
			json.setMessage(ERROR);
		}
		return json;
	}

	/**
	 * 认证机构
	 * 
	 * @param bean
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/authenticateOrg")
	public JsonBean authenticateOrg(CusReqBean bean) {
		JsonBean json = new JsonBean();
		// 入参检验
		if (StringUtils.isAnyBlank(bean.getId(), bean.getInvitationCode(), bean.getOrgId())) {
			json.setCode(0);
			json.setMessage("参数不完整！");
			return json;
		}
		// 业务
		try {
			Customer customer = customerServiceImpl.get(bean.getId());
			if (null == customer) {
				json.setCode(0);
				json.setMessage("用户不存在！");
				return json;
			}
			// 验证邀请码
			Investor investor = new Investor();
			investor.setInvitationCode(bean.getInvitationCode());
			investor.setOrgId(bean.getOrgId());
			investor = investorServiceImpl.unique(investor);
			if (null == investor) {
				json.setCode(0);
				json.setMessage("邀请码不存在！");
				return json;
			}
			if (!(investor.getMobile().equals(customer.getMobile()))) {
				json.setCode(0);
				json.setMessage("预留在机构的电话号码与当前用户的电话号码不匹配，请联系相应机构修改！");
				return json;
			}
			Investor investorUpdata = new Investor();
			investorUpdata.setId(investor.getId());
			investorUpdata.setVerify(true);
			int result = investorServiceImpl.updateById(investorUpdata);
			if (result == 1) {
				json.setCode(1);
				json.setMessage(SUCCESS);
			} else {
				json.setCode(0);
				json.setMessage("认证机构失败，请稍后重试！");
			}
		} catch (Exception e) {
			LOGGER.error("customer authenticateOrg error, errorMsg=[{}].", e.getMessage());
			json.setCode(0);
			json.setMessage(ERROR);
		}
		return json;
	}

	/**
	 * 获取机构列表
	 * 
	 * @param bean
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getOrgList")
	public JsonBean getOrgList(CusReqBean bean) {
		JsonBean json = new JsonBean();
		// 入参检验
		if (StringUtils.isAnyBlank(bean.getId())) {
			json.setCode(0);
			json.setMessage("参数不完整！");
			return json;
		}
		// 业务
		try {
			Customer customer = customerServiceImpl.get(bean.getId());
			if (null == customer) {
				json.setCode(0);
				json.setMessage("用户不存在！");
				return json;
			}
			Investor investor = new Investor();
			investor.setMobile(customer.getMobile());
			investor.setDeleted(false);
			List<Investor> investorList = investorServiceImpl.queryList(investor);
			List<OrgResBean> orgList = new ArrayList<OrgResBean>();
			for (Investor investor2 : investorList) {
				Org org = orgServiceImpl.get(investor2.getOrgId());
				if (null != org) {
					OrgResBean orgResBean = new OrgResBean();
					orgResBean.setId(org.getId());
					orgResBean.setBriefName(org.getBriefName());
					orgResBean.setName(org.getName());
					orgResBean.setOrgCode(org.getOrgCode());
					if (null != investor2.getVerify()) {
						orgResBean.setVerify(investor2.getVerify());
					} else {
						orgResBean.setVerify(false);
					}
					orgList.add(orgResBean);
				}
			}
			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(orgList);
		} catch (Exception e) {
			LOGGER.error("customer authenticateOrg error, errorMsg=[{}].", e.getMessage());
			json.setCode(0);
			json.setMessage(ERROR);
		}
		return json;
	}
	
	/**
	 * 获取用户详情
	 * 
	 * @param bean
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/detail")
	public JsonBean detail(CusReqBean bean) {
		JsonBean json = new JsonBean();
		// 入参检验
		if (StringUtils.isAnyBlank(bean.getId())) {
			json.setCode(0);
			json.setMessage("参数不完整！");
			return json;
		}
		// 业务
		try {
			Customer customer = customerServiceImpl.get(bean.getId());
			if (null == customer) {
				json.setCode(0);
				json.setMessage("用户不存在！");
				return json;
			}
			customer.setPassword(null);
			json.setCode(1);
			json.setData(customer);
			json.setMessage(SUCCESS);
		} catch (Exception e) {
			LOGGER.error("customer login error, errorMsg=[{}].", e.getMessage());
			json.setCode(0);
			json.setMessage(ERROR);
		}
		return json;
	}

}
