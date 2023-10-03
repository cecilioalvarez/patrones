package com.arquitecturajava;

public class Deportista extends Persona{

	private String deporte;
	
	
	public String getDeporte() {
		return deporte;
	}


	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}


	public Deportista(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}
	
	public void correr() {
		
		System.out.println("el deportista corre a 10 km hora");
	}

}
