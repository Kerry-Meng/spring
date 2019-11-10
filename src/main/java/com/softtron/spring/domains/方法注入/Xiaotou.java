package com.softtron.spring.domains.方法注入;

import java.util.UUID;

public class Xiaotou {
	
	private String name;

	public Xiaotou() {
		this.name = UUID.randomUUID().toString();
	}

	public Xiaotou(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Xiaotou [name=" + name + "]";
	}
	
	
	
}
