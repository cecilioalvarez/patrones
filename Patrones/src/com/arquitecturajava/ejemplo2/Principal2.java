package com.arquitecturajava.ejemplo2;

public class Principal2 {

	public static void main(String[] args) {

		Empresa e= new Empresa();
		e.setCif("1A");
		Direccion d= new Direccion();
		d.setCalle("calle1");
		d.setNumero(1);
		e.setDireccion(d);
		
		System.out.println(e.getCif());
		System.out.println(e.getDireccion().getCalle());
		System.out.println(e.getDireccion().getNumero());

	}

}
