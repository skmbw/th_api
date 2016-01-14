package com.cfu666.test;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
	public static final Logger LOGGER = LogManager.getLogger(Test.class);
	
	public static void main(String[] args) {
		LOGGER.info("test");
		Integer integer = null;
		System.out.println(StringUtils.isAnyEmpty(integer + ""));
	}

}
