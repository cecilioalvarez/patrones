package com.arquitecturajava.ejemplo11;

public abstract class Fichero {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Fichero(String nombre) {
		super();
		this.nombre = nombre;
	}

	public boolean esDirectorio() {
		return this.getClass().getName().contains("Directorio");
	}

}
