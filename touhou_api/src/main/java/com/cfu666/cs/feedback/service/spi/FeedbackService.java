package com.cfu666.cs.feedback.service.spi;

import com.cfu666.cs.feedback.model.Feedback;
import com.cfu666.cs.feedback.model.FeedbackBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 反馈相关的业务service接口。
 * @author yinlei
 * @date 2015-11-4 11:24:11
 */
public interface FeedbackService extends MyBatisService<Feedback, FeedbackBean, String> {

}
