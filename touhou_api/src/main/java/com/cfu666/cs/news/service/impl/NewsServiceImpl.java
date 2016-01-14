package com.cfu666.cs.news.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.cfu666.cs.news.bean.NewsReqBean;
import com.cfu666.cs.news.dao.NewsDao;
import com.cfu666.cs.news.model.News;
import com.cfu666.cs.news.model.NewsBean;
import com.cfu666.cs.news.service.spi.NewsService;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 新闻相关的service业务实现。
 * @author yinlei
 * @date 2015-11-11 10:07:44
 */
@Named
public class NewsServiceImpl extends MyBatisServiceImpl<News, NewsBean, String> implements NewsService {
	// 添加了方法后，记得改为private
	protected NewsDao newsDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<News, NewsBean, String> newsDao) {
		this.baseDao = newsDao;
		this.newsDao = (NewsDao) newsDao;
	}

	@Override
	public List<News> getNewsList(NewsReqBean bean) {
		return newsDao.getNewsList(bean);
	}
}
