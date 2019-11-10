package com.softtron.spring.domains.实例化工厂方式;

public class Clacs {
	
	private String clacsName;
	private static Clacs clacs = new Clacs("六班");
	
	public Clacs getInstance() {
		return clacs;
	}
	
	public Clacs() {
		super();
	}
	
	public Clacs(String clacsName) {
		super();
		this.clacsName = clacsName;
	}
	
	public String getClacsName() {
		return clacsName;
	}
	
	public void setClacsName(String clacsName) {
		this.clacsName = clacsName;
	}
	
}
