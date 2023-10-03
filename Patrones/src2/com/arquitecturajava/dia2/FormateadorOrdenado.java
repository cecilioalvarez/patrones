package com.arquitecturajava.dia2;

public class FormateadorOrdenado extends Formateador {

	@Override
	public void format(Factura factura) {
		
		
		System.out.print(factura.getNumero());
		System.out.print(",");
		System.out.print(factura.getConcepto());
		System.out.print(",");
		System.out.print(factura.getImporte());
		
	}

	
}
