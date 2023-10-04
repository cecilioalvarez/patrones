package com.arquitecturajava.ejemplo12;

public class RobotCocina {

	private BrazoRobot brazo;
	
	
	
	public BrazoRobot getBrazo() {
		return brazo;
	}



	public void setBrazo(BrazoRobot brazo) {
		this.brazo = brazo;
	}



	public RobotCocina(BrazoRobot brazo) {
		super();
		this.brazo = brazo;
	}



	public void cocinar() {
		
		brazo.girar();
		
	}
	
}
