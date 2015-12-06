package com.metazion.om.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.metazion.om.dao.IPlayerDao;
import com.metazion.om.pojo.po.Player;
import com.metazion.om.service.IPlayerService;

@Service
public class PlayerServiceImpl implements IPlayerService {

	@Resource
	private IPlayerDao playerDao;

	@Override
	public List<Player> findAll() {
		return playerDao.findAll();
	}

	@Override
	public Player get(int id) {
		return playerDao.get(id);
	}

	@Override
	public int add(Player player) {
		return playerDao.add(player);
	}

	@Override
	public void update(Player player) {
		playerDao.update(player);
	}
}