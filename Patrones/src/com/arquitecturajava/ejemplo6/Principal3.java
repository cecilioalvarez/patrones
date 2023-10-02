package com.arquitecturajava.ejemplo6;

public class Principal3 {

	public static void main(String[] args) {
		
		/*Configurador c= new Configurador();
		c.cargar();
		System.out.println(c.getUsuario());*/
		hacerOtraCosa();

	}
	// es otra zona del programa
	public static void hacerOtraCosa() {
		Configurador c= Configurador.getInstancia();
	
		System.out.println(c.getClave());
		Configurador c2= Configurador.getInstancia();
		
		System.out.println(c2.getClave());
		
	}

}
