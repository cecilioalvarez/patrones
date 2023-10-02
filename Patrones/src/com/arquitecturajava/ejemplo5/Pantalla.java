package com.arquitecturajava.ejemplo5;

public class Pantalla {

	
	private int pulgadas;

	public Pantalla(int pulgadas) {
		super();
		this.pulgadas = pulgadas;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}
	
	public void encender() {
		System.out.println("la pantalla de " + pulgadas+"se enciende");
	}
}
