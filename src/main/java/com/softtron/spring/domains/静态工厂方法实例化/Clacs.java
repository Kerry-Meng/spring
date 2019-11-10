package com.softtron.spring.domains.静态工厂方法实例化;

public class Clacs {
	
	private String clacsName;
	private static Clacs clacs = new Clacs("二班");
	
	public static Clacs getInstance() {
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
