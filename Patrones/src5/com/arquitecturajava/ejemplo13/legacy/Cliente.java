package com.arquitecturajava.ejemplo13.legacy;

public class Cliente {

	private String nombre;
	private double importe;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public Cliente(String nombre, double importe) {
		super();
		this.nombre = nombre;
		this.importe = importe;
	}
	
	
}
