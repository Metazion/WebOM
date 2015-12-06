package com.metazion.om.dao;

import java.util.List;

import com.metazion.om.pojo.po.Player;

public interface IPlayerDao {

	List<Player> findAll();
	
	Player get(int id);

	int add(Player player);

	void update(Player player);
}