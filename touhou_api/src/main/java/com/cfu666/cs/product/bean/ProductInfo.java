package com.cfu666.cs.product.bean;

import com.cfu666.cs.product.model.Product;

public class ProductInfo {
	private Product productBase;
	private Boolean haveIncomeDivide;
	private Boolean haveProductAttachment;
	private Boolean haveFundManager;
	private Boolean haveProductNet;
	private String consultPhone;
	private Boolean haveFavorite;

	public Product getProductBase() {
		return productBase;
	}

	public void setProductBase(Product productBase) {
		this.productBase = productBase;
	}

	public Boolean getHaveIncomeDivide() {
		return haveIncomeDivide;
	}

	public void setHaveIncomeDivide(Boolean haveIncomeDivide) {
		this.haveIncomeDivide = haveIncomeDivide;
	}

	public Boolean getHaveProductAttachment() {
		return haveProductAttachment;
	}

	public void setHaveProductAttachment(Boolean haveProductAttachment) {
		this.haveProductAttachment = haveProductAttachment;
	}

	public Boolean getHaveFundManager() {
		return haveFundManager;
	}

	public void setHaveFundManager(Boolean haveFundManager) {
		this.haveFundManager = haveFundManager;
	}

	public Boolean getHaveProductNet() {
		return haveProductNet;
	}

	public void setHaveProductNet(Boolean haveProductNet) {
		this.haveProductNet = haveProductNet;
	}

	public String getConsultPhone() {
		return consultPhone;
	}

	public void setConsultPhone(String consultPhone) {
		this.consultPhone = consultPhone;
	}

	public Boolean getHaveFavorite() {
		return haveFavorite;
	}

	public void setHaveFavorite(Boolean haveFavorite) {
		this.haveFavorite = haveFavorite;
	}

}
