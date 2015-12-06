package com.metazion.om.pojo.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {

	private int id;
	private String username;
	private String password;

	@Id
	@Column(name = "user_id", unique = true, nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "username", nullable = false, length = 64)
	public String getUsername() {
		return username;
	}

	public void setUsername(String name) {
		this.username = name;
	}

	@Column(name = "password", nullable = false, length = 32)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}