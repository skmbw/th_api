package com.cfu666.cs.my.bean;

public class EmployeeResBean {
	/**
	 * id
	 */
	private String employeeId;
	/**
	 * 姓名
	 */
	private String employeeName;
	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 性别
	 */
	private Integer gender;
	/**
	 * 头像
	 */
	private String avatar;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 机构简称
	 */
	private String orgBriefName;
	/**
	 * 机构全称
	 */
	private String orgName;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOrgBriefName() {
		return orgBriefName;
	}

	public void setOrgBriefName(String orgBriefName) {
		this.orgBriefName = orgBriefName;
	}
}
