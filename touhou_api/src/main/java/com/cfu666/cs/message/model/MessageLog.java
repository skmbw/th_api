package com.cfu666.cs.message.model;

import java.util.Date;

public class MessageLog {
    /**
     * order by 排序语句
     * 对应数据库表字段 message_log
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 message_log
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 message_log
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 message_log
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 message_log.id
     */
    private String id;

    /**
     * 对应数据库表字段 message_log.message
     */
    private String message;

    /**
     * 对应数据库表字段 message_log.sender
     */
    private String sender;

    /**
     * 对应数据库表字段 message_log.employee_id
     */
    private String employeeId;

    /**
     * 对应数据库表字段 message_log.state
     */
    private Integer state;

    /**
     * 对应数据库表字段 message_log.type
     */
    private Integer type;

    /**
     * 对应数据库表字段 message_log.source
     */
    private String source;

    /**
     * 对应数据库表字段 message_log.create_time
     */
    private Date createTime;

    /**
     * 对应数据库表字段 message_log.send_time
     */
    private Date sendTime;

    /**
     * 对应数据库表字段 message_log.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 message_log.skip_type
     */
    private Integer skipType;

    /**
     * 对应数据库表字段 message_log.skip_key
     */
    private String skipKey;

    /**
     * 对应数据库表字段 message_log.business_type
     */
    private Integer businessType;

    /**
     * 对应数据库表字段 message_log.customer_id
     */
    private String customerId;

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
     * 获得字段 message_log.id 的值
     *
     * @return the value of message_log.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 message_log.id 的值
     *
     * @param id the value for message_log.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 message_log.message 的值
     *
     * @return the value of message_log.message
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置字段 message_log.message 的值
     *
     * @param message the value for message_log.message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 获得字段 message_log.sender 的值
     *
     * @return the value of message_log.sender
     */
    public String getSender() {
        return sender;
    }

    /**
     * 设置字段 message_log.sender 的值
     *
     * @param sender the value for message_log.sender
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * 获得字段 message_log.employee_id 的值
     *
     * @return the value of message_log.employee_id
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置字段 message_log.employee_id 的值
     *
     * @param employeeId the value for message_log.employee_id
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 获得字段 message_log.state 的值
     *
     * @return the value of message_log.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置字段 message_log.state 的值
     *
     * @param state the value for message_log.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获得字段 message_log.type 的值
     *
     * @return the value of message_log.type
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置字段 message_log.type 的值
     *
     * @param type the value for message_log.type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获得字段 message_log.source 的值
     *
     * @return the value of message_log.source
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置字段 message_log.source 的值
     *
     * @param source the value for message_log.source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获得字段 message_log.create_time 的值
     *
     * @return the value of message_log.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置字段 message_log.create_time 的值
     *
     * @param createTime the value for message_log.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获得字段 message_log.send_time 的值
     *
     * @return the value of message_log.send_time
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 设置字段 message_log.send_time 的值
     *
     * @param sendTime the value for message_log.send_time
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 获得字段 message_log.org_id 的值
     *
     * @return the value of message_log.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 message_log.org_id 的值
     *
     * @param orgId the value for message_log.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 message_log.skip_type 的值
     *
     * @return the value of message_log.skip_type
     */
    public Integer getSkipType() {
        return skipType;
    }

    /**
     * 设置字段 message_log.skip_type 的值
     *
     * @param skipType the value for message_log.skip_type
     */
    public void setSkipType(Integer skipType) {
        this.skipType = skipType;
    }

    /**
     * 获得字段 message_log.skip_key 的值
     *
     * @return the value of message_log.skip_key
     */
    public String getSkipKey() {
        return skipKey;
    }

    /**
     * 设置字段 message_log.skip_key 的值
     *
     * @param skipKey the value for message_log.skip_key
     */
    public void setSkipKey(String skipKey) {
        this.skipKey = skipKey;
    }

    /**
     * 获得字段 message_log.business_type 的值
     *
     * @return the value of message_log.business_type
     */
    public Integer getBusinessType() {
        return businessType;
    }

    /**
     * 设置字段 message_log.business_type 的值
     *
     * @param businessType the value for message_log.business_type
     */
    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    /**
     * 获得字段 message_log.customer_id 的值
     *
     * @return the value of message_log.customer_id
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置字段 message_log.customer_id 的值
     *
     * @param customerId the value for message_log.customer_id
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}