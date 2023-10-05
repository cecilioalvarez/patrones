package com.arquitecturajava.ejemplo15;

public class Principal2 {

	public static void main(String[] args) {
		
		Factura f= new Factura(-1,"null",-100,1,"normal");
		
		ServicioProcesarFactura sp= new ServicioProcesarFactura();
		sp.procesar(f);
		//System.out.println("todo ok");
		
	}
}
