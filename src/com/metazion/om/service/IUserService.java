package com.metazion.om.service;

import java.util.List;

import com.metazion.om.pojo.po.User;

public interface IUserService {

	List<User> findAll();
	
	User get(int id);

	int add(User user);

	void update(User user);
}