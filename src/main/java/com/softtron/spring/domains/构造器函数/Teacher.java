package com.softtron.spring.domains.构造器函数;

public class Teacher {
	
	private String teacherName;
	private Clacs clazz;
	
	
	public Teacher(Clacs clazz) {
		this.clazz = clazz;
	}
	
	public Clacs getClazz() {
		return clazz;
	}
	
	public void setClazz(Clacs clazz) {
		this.clazz = clazz;
	}
	
}
