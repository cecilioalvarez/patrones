package com.arquitecturajava.dia2.formateadores;

import com.arquitecturajava.dia2.Factura;

class FormateadorDetalle extends Formateador {

	@Override
	public void format(Factura factura) {
		
		
		System.out.println(factura.getNumero());
		System.out.println(factura.getImporte());
		System.out.println(factura.getConcepto());
		
	}

	
}
