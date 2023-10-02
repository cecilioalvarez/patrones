package com.arquitecturajava.ejemplo2;

public class Principal {

	public static void main(String[] args) {

		Persona p= new Persona();
		p.setNombre("pepito");
		p.setEdad(20);
		Direccion d= new Direccion();
		d.setCalle("calle1");
		d.setNumero(1);
		p.setDireccion(d);
		
		System.out.println(p.getNombre());
		System.out.println(p.getEdad());
		System.out.println(p.getDireccion().getCalle());
		System.out.println(p.getDireccion().getNumero());

	}

}
