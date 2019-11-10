package com.softtron.spring.domains.自动装配;

public class TCar {
	
	private String carName;
	private TFrame frame;
	
	public TCar() {
		super();
	}
	
	public TCar(String carName, TFrame frame) {
		super();
		this.carName = carName;
		this.frame = frame;
	}
	
	public String getCarName() {
		return carName;
	}
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public TFrame getFrame() {
		return frame;
	}
	
	public void setFrame(TFrame frame) {
		this.frame = frame;
	}
	
}
