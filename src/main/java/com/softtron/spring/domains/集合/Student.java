package com.softtron.spring.domains.集合;


import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	private Map hobby;
	private Set eat;
	private List foot;
	private Properties properties;
	
	public Map getHobby() {
		return hobby;
	}
	
	public Student() {
		super();
	}
	
	public void setHobby(Map hobby) {
		this.hobby = hobby;
	}
	
	public Set getEat() {
		return eat;
	}
	
	public void setEat(Set eat) {
		this.eat = eat;
	}
	
	public List getFoot() {
		return foot;
	}
	
	public void setFoot(List foot) {
		this.foot = foot;
	}
	
	public Properties getProperties() {
		return properties;
	}
	
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
}
