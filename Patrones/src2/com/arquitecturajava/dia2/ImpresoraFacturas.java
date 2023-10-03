package com.arquitecturajava.dia2;

import java.util.List;

public class ImpresoraFacturas {

	private Formateador formateador;

	public Formateador getFormateador() {
		return formateador;
	}

	public void setFormateador(Formateador formateador) {
		this.formateador = formateador;
	}

	public ImpresoraFacturas(Formateador formateador) {
		super();
		this.formateador = formateador;
	}

	private void separadorLinea() {
		System.out.println();
		System.out.println("---------------");
	}

	public void imprimir(List<Factura> facturas) {

		for (Factura f : facturas) {

			formateador.format(f);
			separadorLinea();
		}

	}
}
