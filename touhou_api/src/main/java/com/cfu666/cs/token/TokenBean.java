package com.cfu666.cs.token;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

/**
 * token对象Bean。不使用也是可以的，为了以后扩展方便，还是使用吧
 * 
 * @author yinlei
 * @date 2015年7月4日 下午2:14:27
 */
public class TokenBean implements Serializable {
	private static final long serialVersionUID = -7607582158899968817L;
	private String customerId;
	private long timestamp;

	public TokenBean() {
	}

	public TokenBean(String token) {
		String[] tokens = StringUtils.split(token, "&");
		this.customerId = tokens[0];
		this.timestamp = Long.parseLong(tokens[1]);
	}

	public TokenBean(String customerId, long timestamp) {
		super();
		this.customerId = customerId;
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return customerId + "&" + timestamp;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

}
