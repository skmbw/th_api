package com.cfu666.cs.appointment.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.cfu666.cs.appointment.bean.AppoReqBean;
import com.cfu666.cs.appointment.dao.AppointmentDao;
import com.cfu666.cs.appointment.model.Appointment;
import com.cfu666.cs.appointment.model.AppointmentBean;
import com.cfu666.cs.appointment.service.spi.AppointmentService;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 预约相关的service业务实现。
 * @author yinlei
 * @date 2015-11-5 10:25:54
 */
@Named
public class AppointmentServiceImpl extends MyBatisServiceImpl<Appointment, AppointmentBean, String> implements AppointmentService {
	// 添加了方法后，记得改为private
	protected AppointmentDao appointmentDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Appointment, AppointmentBean, String> appointmentDao) {
		this.baseDao = appointmentDao;
		this.appointmentDao = (AppointmentDao) appointmentDao;
	}
	
	/**
	 * 获取投后用户所在机构预约列表
	 */
	@Override
	public List<Appointment> myqueryList(AppoReqBean model) {
		return appointmentDao.myqueryList(model);
	}
	
}
