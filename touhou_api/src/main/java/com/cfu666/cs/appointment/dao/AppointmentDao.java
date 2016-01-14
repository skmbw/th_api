package com.cfu666.cs.appointment.dao;

import java.util.List;

import com.cfu666.cs.appointment.bean.AppoReqBean;
import com.cfu666.cs.appointment.model.Appointment;
import com.cfu666.cs.appointment.model.AppointmentBean;
import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 表appointment的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-11-05 10:25:55
 */
@DaoMapper
public interface AppointmentDao extends BaseDao<Appointment, AppointmentBean, String> {

	List<Appointment> myqueryList(AppoReqBean model);
	
}