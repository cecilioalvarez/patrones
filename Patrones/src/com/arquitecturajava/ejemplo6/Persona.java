package com.arquitecturajava.ejemplo6;

public class Persona {

	//instancia pertenece a cada objeto
	private String nombre;
	//pertenece a la clase
	private static int contador=0;
	

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		contador=contador+1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
