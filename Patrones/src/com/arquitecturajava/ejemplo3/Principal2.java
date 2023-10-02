package com.arquitecturajava.ejemplo3;

public class Principal2 {

	public static void main(String[] args) {

		Empresa e= new Empresa();
		e.setCif("1A");
		Direccion d= new Direccion("calle1",1);
		//asigno la direccion
		e.setDireccion(d);
		
		Persona p= new Persona("pedro",20,"calle1",2);
		p.setNombre("pedro");
		p.setEdad(20);
		p.setDireccion(d);
		
		
		
		System.out.println(e.getCif());
		System.out.println(e.getDireccion().getCalle());
		System.out.println(e.getDireccion().getNumero());

		System.out.println(p.getNombre());
		System.out.println(p.getDireccion().getCalle());
		System.out.println(p.getDireccion().getNumero());

	}

}
