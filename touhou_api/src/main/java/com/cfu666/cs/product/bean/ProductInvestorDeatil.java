package com.cfu666.cs.product.bean;

import java.util.Date;
import java.util.List;

import com.cfu666.cs.product.model.InvestReport;
import com.cfu666.cs.product.model.Product;

public class ProductInvestorDeatil {
	private String orderId;
	private Product product;
	private EmployeeInfo employeeInfo;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public EmployeeInfo getEmployeeInfo() {
		return employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
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
