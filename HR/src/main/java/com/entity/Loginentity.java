package com.entity;

import javax.persistence.Entity;

@Entity
public class Loginentity {

	private int id;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Loginentity(int id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public Loginentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
