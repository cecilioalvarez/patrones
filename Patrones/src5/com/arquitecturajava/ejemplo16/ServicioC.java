package com.arquitecturajava.ejemplo16;

public class ServicioC implements Observador {

	public void procesar(Informacion i) {
		
		System.out.println("!"+i.getMensaje()+"!");
		System.out.println("!"+i.getReceptor()+"!");
		System.out.println("!!"+i.getNivel()+"!");
	}
}
