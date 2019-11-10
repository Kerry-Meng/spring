package com.softtron.spring.domains.pc标签的使用;

public class Teacher {
	
	private String teacherName;
	private Clacs clacs;
	
	public Teacher() {
		super();
	}
	
	public Teacher(Clacs clacs) {
		super();
		this.clacs = clacs;
	}
	
	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Clacs getClacs() {
		return clacs;
	}
	
	public void setClacs(Clacs clacs) {
		this.clacs = clacs;
	}
	
}
