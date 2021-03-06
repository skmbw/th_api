package com.cfu666.cs.news.dao;

import java.util.List;

import com.cfu666.cs.news.bean.NewsReqBean;
import com.cfu666.cs.news.model.News;
import com.cfu666.cs.news.model.NewsBean;
import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 表news的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-11-11 10:07:45
 */
@DaoMapper
public interface NewsDao extends BaseDao<News, NewsBean, String> {

	List<News> getNewsList(NewsReqBean bean);
}