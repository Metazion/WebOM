package com.metazion.om.pojo.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_player")
public class Player {

	private int id;
	private int account;
	private int type;
	public String nickname;

	@Id
	@Column(name = "player_id", unique = true, nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "account", nullable = false)
	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	@Column(name = "type", nullable = false)
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Column(name = "nickname", nullable = false, length = 32)
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
}