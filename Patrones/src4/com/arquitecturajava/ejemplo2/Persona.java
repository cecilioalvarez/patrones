package com.arquitecturajava.ejemplo2;

public class Persona {

	private String nombre;
	private Telefono telefono;

	public Persona(String nombre, Telefono telefono) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void llamar() {
		
		telefono.llamar();
	}
}
