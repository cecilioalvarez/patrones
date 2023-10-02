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
	// delegacion que 
	//funcionaliad tiene este metodo
	
	public Persona(String nombre, int edad, String calle, int numero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = new Direccion(calle, numero);
	}
	public String getCalle() {
		return direccion.getCalle();
	}
	public void setCalle(String calle) {
		direccion.setCalle(calle);
	}
	public int getNumero() {
		return direccion.getNumero();
	}
	public void setNumero(int numero) {
		direccion.setNumero(numero);
	}
	
	
}
