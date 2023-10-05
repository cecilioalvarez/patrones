package com.arquitecturajava.ejemplo16;

public class ServicioA implements Observador {

	public void procesar(Informacion i) {
		
		System.out.println("<<<"+i.getMensaje()+">>");
		System.out.println("<<<"+i.getReceptor()+">>");
		System.out.println("<<<"+i.getNivel()+">>");
	}
}
