package com.cfu666.cs.product.model;

import java.util.Date;

public class InvestReport {
	/**
	 * order by 排序语句 对应数据库表字段 invest_report
	 */
	private String orderBy;

	/**
	 * 分页开始记录 对应数据库表字段 invest_report
	 */
	private Integer start;

	/**
	 * 分页大小 对应数据库表字段 invest_report
	 */
	private int pageSize = 10;

	/**
	 * 是否去重 对应数据库表字段 invest_report
	 */
	private boolean distinct;

	/**
	 * 对应数据库表字段 invest_report.id
	 */
	private String id;

	/**
	 * 对应数据库表字段 invest_report.file_name
	 */
	private String fileName;

	/**
	 * 对应数据库表字段 invest_report.upload_time
	 */
	private Date uploadTime;

	/**
	 * 对应数据库表字段 invest_report.org_id
	 */
	private String orgId;

	/**
	 * 对应数据库表字段 invest_report.file_path
	 */
	private String filePath;

	/**
	 * 对应数据库表字段 invest_report.product_id
	 */
	private String productId;

	private Long size;

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
	 * 获得字段 invest_report.id 的值
	 *
	 * @return the value of invest_report.id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置字段 invest_report.id 的值
	 *
	 * @param id
	 *            the value for invest_report.id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获得字段 invest_report.file_name 的值
	 *
	 * @return the value of invest_report.file_name
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * 设置字段 invest_report.file_name 的值
	 *
	 * @param fileName
	 *            the value for invest_report.file_name
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * 获得字段 invest_report.upload_time 的值
	 *
	 * @return the value of invest_report.upload_time
	 */
	public Date getUploadTime() {
		return uploadTime;
	}

	/**
	 * 设置字段 invest_report.upload_time 的值
	 *
	 * @param uploadTime
	 *            the value for invest_report.upload_time
	 */
	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	/**
	 * 获得字段 invest_report.org_id 的值
	 *
	 * @return the value of invest_report.org_id
	 */
	public String getOrgId() {
		return orgId;
	}

	/**
	 * 设置字段 invest_report.org_id 的值
	 *
	 * @param orgId
	 *            the value for invest_report.org_id
	 */
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	/**
	 * 获得字段 invest_report.file_path 的值
	 *
	 * @return the value of invest_report.file_path
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * 设置字段 invest_report.file_path 的值
	 *
	 * @param filePath
	 *            the value for invest_report.file_path
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * 获得字段 invest_report.product_id 的值
	 *
	 * @return the value of invest_report.product_id
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * 设置字段 invest_report.product_id 的值
	 *
	 * @param productId
	 *            the value for invest_report.product_id
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

}