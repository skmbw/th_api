package com.cfu666.cs.product.bean;

public class ProductResBean {
	private String id;
	private String productBriefName;
	private String productName;
	private String level;
	private Integer duration;
	private Double subStart;
	private String prospectiveEarnings;
	private String thumbnail;
	private Integer state;
	private String operationMode;
	private Double increaseAmount;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductBriefName() {
		return productBriefName;
	}

	public void setProductBriefName(String productBriefName) {
		this.productBriefName = productBriefName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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

	public Double getSubStart() {
		return subStart;
	}

	public void setSubStart(Double subStart) {
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

	public Double getIncreaseAmount() {
		return increaseAmount;
	}

	public void setIncreaseAmount(Double increaseAmount) {
		this.increaseAmount = increaseAmount;
	}

}
