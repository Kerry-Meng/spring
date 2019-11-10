package com.softtron.spring.domains.后处理器BeanPostProcessor;

public class User {
	
	public User() {
		System.out.println("实例化!");
	}
	
	public void init() {
		System.out.println("初始化bean!");
	}
	
	public void destroy() {
		System.out.println("销毁bean!");
	}
	
}
