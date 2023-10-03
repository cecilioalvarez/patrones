package com.arquitecturajava.dia2;

public class FormateadorDetalle extends Formateador {

	@Override
	public void format(Factura factura) {
		
		
		System.out.println(factura.getNumero());
		System.out.println(factura.getImporte());
		System.out.println(factura.getConcepto());
		
	}

	
}
