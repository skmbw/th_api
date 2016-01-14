package com.cfu666.cs.product.bean;

import java.util.Date;

public class ProductInvestResBean {
	private String orderId;
	private String productId;
	private String thumbnail;
	private String productBriefName;
	private String productName;
	private Double investAmount;
	private Date subTime;
	private String investorName;
	private Date expiringDate;
	private Integer orderState;// 订单状态 :1已支付2未支付3已赎回4部分支付5已取消6已完成 7即将到期 8待兑付。

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
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

	public Double getInvestAmount() {
		return investAmount;
	}

	public void setInvestAmount(Double investAmount) {
		this.investAmount = investAmount;
	}

	public Date getSubTime() {
		return subTime;
	}

	public void setSubTime(Date subTime) {
		this.subTime = subTime;
	}

	public String getInvestorName() {
		return investorName;
	}

	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}

	public Date getExpiringDate() {
		return expiringDate;
	}

	public void setExpiringDate(Date expiringDate) {
		this.expiringDate = expiringDate;
	}

	public Integer getOrderState() {
		return orderState;
	}

	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}

}
