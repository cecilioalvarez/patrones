package com.arquitecturajava.dia2.formateadores;

import com.arquitecturajava.dia2.Factura;

class FormateadorInvertido extends Formateador{

	@Override
	public void format(Factura factura) {
		System.out.println(factura.getConcepto());
		System.out.println(factura.getImporte());
		System.out.println(factura.getNumero());

		
		
	}

}
