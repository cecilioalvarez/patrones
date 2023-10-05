package com.arquitecturajava.ejemplo15;

public class Principal {

	public static void main(String[] args) {
		
		Factura f= new Factura(1,"ordenador",-100,1,"normal");
		
		ValidadorFactura validador= 
				new ValidadorFacturaNumero(
						new ValidadorFacturaConcepto(
								new ValidadorFacturaImporte()));
	
	ValidadorFacturaError valido=validador.validar(f);
	System.out.println(valido.getMensaje());
	System.out.println(valido.isEstado());
	

}}
