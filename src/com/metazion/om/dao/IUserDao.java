package com.metazion.om.dao;

import java.util.List;

import com.metazion.om.pojo.po.User;

public interface IUserDao {

	List<User> findAll();
	
	User get(int id);

	int add(User user);

	void update(User user);
}