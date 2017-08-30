package com.zongdw.socket.transportCompressedObject;

import java.io.Serializable;

public class User implements Serializable {
	
	/** serialVersionUID: TODO */ 
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String password;
	public User() {
	}
	public User(String name,String password) {
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
