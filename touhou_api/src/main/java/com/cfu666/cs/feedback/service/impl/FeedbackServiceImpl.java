package com.cfu666.cs.feedback.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.cfu666.cs.feedback.dao.FeedbackDao;
import com.cfu666.cs.feedback.model.Feedback;
import com.cfu666.cs.feedback.model.FeedbackBean;
import com.cfu666.cs.feedback.service.spi.FeedbackService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 反馈相关的service业务实现。
 * @author yinlei
 * @date 2015-11-4 11:24:11
 */
@Named
public class FeedbackServiceImpl extends MyBatisServiceImpl<Feedback, FeedbackBean, String> implements FeedbackService {
	// 添加了方法后，记得改为private
	protected FeedbackDao feedbackDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Feedback, FeedbackBean, String> feedbackDao) {
		this.baseDao = feedbackDao;
		this.feedbackDao = (FeedbackDao) feedbackDao;
	}
}
