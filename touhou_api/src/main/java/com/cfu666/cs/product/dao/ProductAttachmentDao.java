package com.cfu666.cs.product.dao;

import com.cfu666.cs.product.model.ProductAttachment;
import com.cfu666.cs.product.model.ProductAttachmentBean;
import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 表product_attachment的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-11-11 17:12:00
 */
@DaoMapper
public interface ProductAttachmentDao extends BaseDao<ProductAttachment, ProductAttachmentBean, String> {
}