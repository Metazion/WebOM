package com.metazion.om.core;

public class DatabaseContextHolder {

	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

	public static void setCustomerType(String customType) {
		contextHolder.set(customType);
	}

	public static String getCustomType() {
		return contextHolder.get();
	}

	public static void clearCustomerType() {
		contextHolder.remove();
	}
}