package com.cfu666.cs.product.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.cfu666.cs.my.bean.FundManagerResBean;
import com.cfu666.cs.product.dao.FundManagerProductDao;
import com.cfu666.cs.product.model.FundManagerProduct;
import com.cfu666.cs.product.model.FundManagerProductBean;
import com.cfu666.cs.product.service.spi.FundManagerProductService;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 基金经理产品关系表相关的service业务实现。
 * @author yinlei
 * @date 2015-11-11 17:30:44
 */
@Named
public class FundManagerProductServiceImpl extends MyBatisServiceImpl<FundManagerProduct, FundManagerProductBean, String> implements FundManagerProductService {
	// 添加了方法后，记得改为private
	protected FundManagerProductDao fundManagerProductDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<FundManagerProduct, FundManagerProductBean, String> fundManagerProductDao) {
		this.baseDao = fundManagerProductDao;
		this.fundManagerProductDao = (FundManagerProductDao) fundManagerProductDao;
	}

	@Override
	public List<FundManagerResBean> getfundManagerResBeanList(FundManagerProduct mp) {
		return fundManagerProductDao.getfundManagerResBeanList(mp);
	}
}
