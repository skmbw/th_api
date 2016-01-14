package com.cfu666.cs.product.bean;

import java.util.Date;
import java.util.List;

import com.cfu666.cs.product.model.InvestReport;

public class ProductInvestDetailResBean {
	private String orderId;
	private String productId;
	private String employeeId;
	private String employeeName;
	private String employeePhone;
	private String employeeAvatar;
	private String orgBriefName;
	private Double investAmount;
	private Date subTime;
	private String contactFile;
	private Integer orderState;
	private List<InvestReport> investReportList;

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

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}

	public String getEmployeeAvatar() {
		return employeeAvatar;
	}

	public void setEmployeeAvatar(String employeeAvatar) {
		this.employeeAvatar = employeeAvatar;
	}

	public String getOrgBriefName() {
		return orgBriefName;
	}

	public void setOrgBriefName(String orgBriefName) {
		this.orgBriefName = orgBriefName;
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

	public String getContactFile() {
		return contactFile;
	}

	public void setContactFile(String contactFile) {
		this.contactFile = contactFile;
	}

	public Integer getOrderState() {
		return orderState;
	}

	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}

	public List<InvestReport> getInvestReportList() {
		return investReportList;
	}

	public void setInvestReportList(List<InvestReport> investReportList) {
		this.investReportList = investReportList;
	}

}
