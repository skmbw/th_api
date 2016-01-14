package com.cfu666.cs.product.service.spi;

import java.util.List;

import com.cfu666.cs.my.bean.FundManagerResBean;
import com.cfu666.cs.product.model.FundManagerProduct;
import com.cfu666.cs.product.model.FundManagerProductBean;
import com.vteba.service.generic.MyBatisService;

/**
 * 基金经理产品关系表相关的业务service接口。
 * @author yinlei
 * @date 2015-11-11 17:30:44
 */
public interface FundManagerProductService extends MyBatisService<FundManagerProduct, FundManagerProductBean, String> {

	/**
	 * 根据产品ID获取基金经理列表
	 * @param mp
	 * @return 基金经理列表
	 */
	List<FundManagerResBean> getfundManagerResBeanList(FundManagerProduct mp);

}
