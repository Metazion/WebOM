package com.metazion.om.core;

import org.aspectj.lang.JoinPoint;

public class DataSourceInterceptor {

	public void setDataSourceAccount(JoinPoint jp) {
		DatabaseContextHolder.setCustomerType("dataSourceAccount");
	}
	
	public void setDataSourceGame(JoinPoint jp) {
		DatabaseContextHolder.setCustomerType("dataSourceGame");
	}

	public void setDataSourceJournal(JoinPoint jp) {
		DatabaseContextHolder.setCustomerType("dataSourceJournal");
	}
}