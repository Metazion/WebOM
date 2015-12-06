package com.metazion.om.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.metazion.om.dao.IUserDao;
import com.metazion.om.pojo.po.User;
import com.metazion.om.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public User get(int id) {
		return userDao.get(id);
	}

	@Override
	public int add(User user) {
		return userDao.add(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}
}