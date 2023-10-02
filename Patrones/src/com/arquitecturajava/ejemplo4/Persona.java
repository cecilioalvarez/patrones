package com.arquitecturajava.ejemplo4;

public class Persona {

	private String nombre;
	private int edad;
	//pero no es una propiedad elemental
	private Direccion direccion;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getCalle() {
		
		return direccion.getCalle();
	}
	
	public int getNumero() {
		
		return direccion.getNumero();
	}
	public Persona(String nombre, int edad, String calle, int numero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = new Direccion(calle, numero);
	}
	
	
}
