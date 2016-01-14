package com.cfu666.cs.appointment.service.spi;

import java.util.List;

import com.cfu666.cs.appointment.bean.AppoReqBean;
import com.cfu666.cs.appointment.model.Appointment;
import com.cfu666.cs.appointment.model.AppointmentBean;
import com.vteba.service.generic.MyBatisService;

/**
 * 预约相关的业务service接口。
 * @author yinlei
 * @date 2015-11-5 10:25:54
 */
public interface AppointmentService extends MyBatisService<Appointment, AppointmentBean, String> {
	
	public List<Appointment> myqueryList(AppoReqBean model);
}
