package com.arquitecturajava.basico.ejemplo3;

public class Principal {

	public static void main(String[] args) {

		
		Persona p= new Persona("pepito",20,"calle1",1);
	
		
		System.out.println(p.getNombre());
		System.out.println(p.getEdad());
		System.out.println(p.getDireccion().getCalle());
		System.out.println(p.getDireccion().getNumero());

	}

}
