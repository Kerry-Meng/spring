package com.softtron.spring.domains.beanfactorypostprocessor;

public class TUser {
	
	private String username;
	
	public TUser() {
		System.out.println("user constructor");
	}
	
	public void init() {
		System.out.println("init");
	}
	
	public void destory() {
		System.out.println("destory");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "TUser [username=" + username + "]";
	}
	
	
}
