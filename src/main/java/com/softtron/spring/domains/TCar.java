package com.softtron.spring.domains;

public class TCar {
	
	private String carName;
	private TFrame frame;
	
	public TFrame getFrame() {
		return frame;
	}

	public void setFrame(TFrame frame) {
		this.frame = frame;
	}

	public TCar(String carName, TFrame frame) {
		super();
		this.carName = carName;
		this.frame = frame;
	}

	public String getCarName() {
		return carName;
	}
	
	public TCar() {
		super();
	}
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
}
