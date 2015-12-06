package com.metazion.om.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.metazion.om.dao.IPlayerDao;
import com.metazion.om.pojo.po.Player;

@Repository
public class PlayerDaoImpl implements IPlayerDao {

	@Resource
	private SessionFactory sessionFactory;

	@Override
	@SuppressWarnings("unchecked")
	public List<Player> findAll() {
		return (List<Player>) sessionFactory.getCurrentSession().createQuery("from Player").list();
	}

	@Override
	public Player get(int id) {
		return (Player) sessionFactory.getCurrentSession().get(Player.class, id);
	}

	@Override
	public int add(Player player) {
		return (Integer) sessionFactory.getCurrentSession().save(player);
	}

	@Override
	public void update(Player player) {
		sessionFactory.getCurrentSession().update(player);
	}
}