package com.cfu666.cs.favorite.model;

import java.util.Date;

public class Favorite {
    /**
     * order by 排序语句
     * 对应数据库表字段 favorite
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 favorite
     */
    private Integer page;

    /**
     * 分页大小
     * 对应数据库表字段 favorite
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 favorite
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 favorite.id
     */
    private String id;

    /**
     * 对应数据库表字段 favorite.customer_id
     */
    private String customerId;

    /**
     * 对应数据库表字段 favorite.product_id
     */
    private String productId;

    /**
     * 对应数据库表字段 favorite.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 favorite.create_time
     */
    private Date createTime;

    /**
     * 设置 order by 排序语句
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * 获得 order by 排序语句
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * 设置 start，分页开始记录
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 获得 start，分页开始记录
     */
    public Integer getPage() {
        return page;
    }

    /**
     * 设置 pageSize，分页大小
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获得 pageSize，分页大小
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 设置 distinct，是否去重
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 获得 distinct，是否去重
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获得字段 favorite.id 的值
     *
     * @return the value of favorite.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 favorite.id 的值
     *
     * @param id the value for favorite.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 favorite.customer_id 的值
     *
     * @return the value of favorite.customer_id
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置字段 favorite.customer_id 的值
     *
     * @param customerId the value for favorite.customer_id
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * 获得字段 favorite.product_id 的值
     *
     * @return the value of favorite.product_id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置字段 favorite.product_id 的值
     *
     * @param productId the value for favorite.product_id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获得字段 favorite.org_id 的值
     *
     * @return the value of favorite.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 favorite.org_id 的值
     *
     * @param orgId the value for favorite.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 favorite.create_time 的值
     *
     * @return the value of favorite.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置字段 favorite.create_time 的值
     *
     * @param createTime the value for favorite.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}