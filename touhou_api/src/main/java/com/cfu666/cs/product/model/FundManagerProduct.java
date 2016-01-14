package com.cfu666.cs.product.model;

public class FundManagerProduct {
    /**
     * order by 排序语句
     * 对应数据库表字段 fund_manager_product
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 fund_manager_product
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 fund_manager_product
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 fund_manager_product
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 fund_manager_product.id
     */
    private String id;

    /**
     * 对应数据库表字段 fund_manager_product.fund_manager_id
     */
    private String fundManagerId;

    /**
     * 对应数据库表字段 fund_manager_product.product_id
     */
    private String productId;

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
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * 获得 start，分页开始记录
     */
    public Integer getStart() {
        return start;
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
     * 获得字段 fund_manager_product.id 的值
     *
     * @return the value of fund_manager_product.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 fund_manager_product.id 的值
     *
     * @param id the value for fund_manager_product.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 fund_manager_product.fund_manager_id 的值
     *
     * @return the value of fund_manager_product.fund_manager_id
     */
    public String getFundManagerId() {
        return fundManagerId;
    }

    /**
     * 设置字段 fund_manager_product.fund_manager_id 的值
     *
     * @param fundManagerId the value for fund_manager_product.fund_manager_id
     */
    public void setFundManagerId(String fundManagerId) {
        this.fundManagerId = fundManagerId;
    }

    /**
     * 获得字段 fund_manager_product.product_id 的值
     *
     * @return the value of fund_manager_product.product_id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置字段 fund_manager_product.product_id 的值
     *
     * @param productId the value for fund_manager_product.product_id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
}