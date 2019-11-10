package com.softtron.spring.domains.自动装配;

public class TFrame {
	
	private String frameName;
	
	public TFrame() {
		super();
	}
	
	public TFrame(String frameName) {
		super();
		this.frameName = frameName;
	}
	
	public String getFrameName() {
		return frameName;
	}
	
	public void setFrameName(String frameName) {
		this.frameName = frameName;
	}
	
}
