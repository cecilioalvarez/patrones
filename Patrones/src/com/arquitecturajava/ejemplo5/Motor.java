package com.arquitecturajava.ejemplo5;

public class Motor {

	
	private int potencia;

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public void arrancar() {
		
		System.out.println("el motor arranca con" + potencia+"caballos");
	}

	public Motor(int potencia) {
		super();
		this.potencia = potencia;
	}
	
	
}
