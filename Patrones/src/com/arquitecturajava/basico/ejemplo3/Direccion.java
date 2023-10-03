package com.arquitecturajava.basico.ejemplo3;

public class Direccion {

	//propiedades
	// dadas de alta como privadas
	private String calle;
	private int numero;
	
	
	//lectura
	public String getCalle() {
		return calle;
	}
	//escritura o modificadcion
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//funcion que se encarga de que
	// de inicilizar el objeto de forma sencilla
	public Direccion(String calle, int numero) {
		super();
		this.calle = calle;
		this.numero = numero;
	}
	
	
	
}
