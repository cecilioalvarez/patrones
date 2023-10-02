package com.arquitecturajava.ejemplo5;

public class Coche {

	private Pantalla pantalla;
	private Motor motor;
	
	
	public Coche(Pantalla pantalla, Motor motor) {
		super();
		this.pantalla = pantalla;
		this.motor = motor;
	}
	public Pantalla getPantalla() {
		return pantalla;
	}
	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public void arrancar() {
		
		motor.arrancar();
		pantalla.encender();
		
	}
}
