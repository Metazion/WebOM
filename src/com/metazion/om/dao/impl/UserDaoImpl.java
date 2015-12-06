package com.metazion.om.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.metazion.om.dao.IUserDao;
import com.metazion.om.pojo.po.User;

@Repository
public class UserDaoImpl implements IUserDao {

	@Resource
	private SessionFactory sessionFactory;

	@Override
	@SuppressWarnings("unchecked")
	public List<User> findAll() {
		return (List<User>) sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	@Override
	public User get(int id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}

	@Override
	public int add(User user) {
		return (Integer) sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public void update(User user) {
		sessionFactory.getCurrentSession().update(user);
	}
}