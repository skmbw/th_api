package com.cfu666.cs.product.dao;

import java.util.List;

import com.cfu666.cs.my.bean.FundManagerResBean;
import com.cfu666.cs.product.model.FundManagerProduct;
import com.cfu666.cs.product.model.FundManagerProductBean;
import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 表fund_manager_product的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-11-11 17:30:45
 */
@DaoMapper
public interface FundManagerProductDao extends BaseDao<FundManagerProduct, FundManagerProductBean, String> {
	/**
	 * 根据产品ID获取基金经理列表
	 * @param mp
	 * @return 基金经理列表
	 */
	List<FundManagerResBean> getfundManagerResBeanList(FundManagerProduct mp);
}