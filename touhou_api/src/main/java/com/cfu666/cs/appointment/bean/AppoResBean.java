package com.cfu666.cs.appointment.bean;

import java.math.BigDecimal;
import java.util.Date;

public class AppoResBean {

	private String id;

	private String productId;

	private String productName;

	private String briefName;

	private String level;

	private Integer duration;

	private BigDecimal subStart;

	private String prospectiveEarnings;

	private String thumbnail;

	private Integer state;

	private String operationMode;

	private BigDecimal increaseAmount;

	private Date appointTime;

	private BigDecimal orderAmount;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBriefName() {
		return briefName;
	}

	public void setBriefName(String briefName) {
		this.briefName = briefName;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public BigDecimal getSubStart() {
		return subStart;
	}

	public void setSubStart(BigDecimal subStart) {
		this.subStart = subStart;
	}

	public String getProspectiveEarnings() {
		return prospectiveEarnings;
	}

	public void setProspectiveEarnings(String prospectiveEarnings) {
		this.prospectiveEarnings = prospectiveEarnings;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getOperationMode() {
		return operationMode;
	}

	public void setOperationMode(String operationMode) {
		this.operationMode = operationMode;
	}

	public BigDecimal getIncreaseAmount() {
		return increaseAmount;
	}

	public void setIncreaseAmount(BigDecimal increaseAmount) {
		this.increaseAmount = increaseAmount;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Date getAppointTime() {
		return appointTime;
	}

	public void setAppointTime(Date appointTime) {
		this.appointTime = appointTime;
	}

	
}
