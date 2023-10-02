package com.arquitecturajava.ejemplo6;

public class Principal4 {

	public static void main(String[] args) {
		
	
		CarpetaCompartida c= CarpetaCompartida.getInstancia("f:/Carpeta");
		System.out.println(c.getRuta());
//		CarpetaCompartida c2= new CarpetaCompartida("f:/carpeta");
//		CarpetaCompartida c3= new CarpetaCompartida("f:/carpeta");
		
		
		CarpetaCompartida c2= CarpetaCompartida.getInstancia("h:/Carpeta");
		System.out.println(c2.getRuta());
	}
	

}
