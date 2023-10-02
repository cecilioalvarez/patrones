package com.arquitecturajava.ejemplo8;

public class DiscoDuro {

	
	private  boolean leer;
	
	public boolean isLeer() {
		return leer;
	}

	public void setLeer(boolean leer) {
		this.leer = leer;
	}


	public void escribir() {
		
		System.out.println("escribiendo en el disco");
	}
}
