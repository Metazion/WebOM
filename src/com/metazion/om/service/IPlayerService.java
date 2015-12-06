package com.metazion.om.service;

import java.util.List;

import com.metazion.om.pojo.po.Player;

public interface IPlayerService {

	List<Player> findAll();
	
	Player get(int id);

	int add(Player player);

	void update(Player player);
}