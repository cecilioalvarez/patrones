package com.arquitecturajava.ejemplo2;

public class Principal {

	public static void main(String[] args) {
		
		
		Empresa e= new Empresa();
		
		Persona p= new Persona("jorge",e.getTelefono());
		p.llamar();

	}

}
