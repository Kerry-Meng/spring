package com.softtron.spring.domains.方法注入;

public class Police2 {
	
	private Xiaotou tou;
	
	public Police2() {
		super();
	}
	
	public Police2(Xiaotou tou) {
		super();
		this.tou = tou;
	}
	
	public Xiaotou getTou() {
		Xiaotou tou = new Xiaotou();
		tou.setName("123");
		return tou;
	}
	
	public void setTou(Xiaotou tou) {
		this.tou = tou;
	}
	
	public Xiaotou getXiaotou() {
		return tou;
	}
	
	@Override
	public String toString() {
		return "Police [tou=" + tou + "]";
	}
	
}
