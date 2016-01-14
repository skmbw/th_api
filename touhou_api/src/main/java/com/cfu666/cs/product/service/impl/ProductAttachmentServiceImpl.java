package com.cfu666.cs.product.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.cfu666.cs.product.dao.ProductAttachmentDao;
import com.cfu666.cs.product.model.ProductAttachment;
import com.cfu666.cs.product.model.ProductAttachmentBean;
import com.cfu666.cs.product.service.spi.ProductAttachmentService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 相关文件相关的service业务实现。
 * @author yinlei
 * @date 2015-11-11 17:11:59
 */
@Named
public class ProductAttachmentServiceImpl extends MyBatisServiceImpl<ProductAttachment, ProductAttachmentBean, String> implements ProductAttachmentService {
	// 添加了方法后，记得改为private
	protected ProductAttachmentDao productAttachmentDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<ProductAttachment, ProductAttachmentBean, String> productAttachmentDao) {
		this.baseDao = productAttachmentDao;
		this.productAttachmentDao = (ProductAttachmentDao) productAttachmentDao;
	}
}
