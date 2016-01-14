package com.cfu666.cs.news.service.spi;

import java.util.List;

import com.cfu666.cs.news.bean.NewsReqBean;
import com.cfu666.cs.news.model.News;
import com.cfu666.cs.news.model.NewsBean;
import com.vteba.service.generic.MyBatisService;

/**
 * 新闻相关的业务service接口。
 * @author yinlei
 * @date 2015-11-11 10:07:44
 */
public interface NewsService extends MyBatisService<News, NewsBean, String> {

	List<News> getNewsList(NewsReqBean bean);

}
