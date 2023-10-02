package com.arquitecturajava;

public class Principal {

	public static void main(String[] args) {

		Persona p= new Persona();
		p.setNombre("pepito");
		p.setEdad(20);
		
		System.out.println(p.getNombre());
		System.out.println(p.getEdad());

	}

}
