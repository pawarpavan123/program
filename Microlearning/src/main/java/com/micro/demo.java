package com.micro;

public class demo {
	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "demo [name=" + name + ", id=" + id + "]";
	}

}
