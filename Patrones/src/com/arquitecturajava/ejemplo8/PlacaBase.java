package com.arquitecturajava.ejemplo8;

public class PlacaBase {

	private int velocidad;
	private int temperatura;
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	public PlacaBase(int velocidad, int temperatura) {
		super();
		this.velocidad = velocidad;
		this.temperatura = temperatura;
	}
	
	
	
	
}
