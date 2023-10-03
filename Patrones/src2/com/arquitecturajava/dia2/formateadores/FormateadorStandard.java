package com.arquitecturajava.dia2.formateadores;

import com.arquitecturajava.dia2.Factura;

class FormateadorStandard extends Formateador {

	@Override
	public void format(Factura factura) {
		
		
		System.out.print(factura.getNumero());
		System.out.print(",");
		System.out.print(factura.getImporte());
		System.out.print(",");
		System.out.print(factura.getConcepto());
		
	}

	
}
