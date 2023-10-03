package com.arquitecturajava.basico.ejemplo1;

public class Principal {

	public static void main(String[] args) {

		Persona p= new Persona();
		p.setNombre("pepito");
		p.setEdad(20);
		p.setCalle("calle1");
		p.setNumero(1);
		
		System.out.println(p.getNombre());
		System.out.println(p.getEdad());
		System.out.println(p.getCalle());
		System.out.println(p.getNumero());

	}

}
