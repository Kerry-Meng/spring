package com.softtron.spring.domains.自定义作用域;

public class TCar {
	
	private TFrame frame;
	
	public TCar() {
		super();
	}
	
	public TCar(TFrame frame) {
		super();
		this.frame = frame;
	}
	
	public TFrame getFrame() {
		return frame;
	}
	
	public void setFrame(TFrame frame) {
		this.frame = frame;
	}
	
}
