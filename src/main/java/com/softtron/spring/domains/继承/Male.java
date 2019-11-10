package com.softtron.spring.domains.继承;

public class Male extends Person {
	
	private int age;

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Male [age=" + age + ", getName()=" + getName() + ", getSex()=" + getSex() + "]";
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
