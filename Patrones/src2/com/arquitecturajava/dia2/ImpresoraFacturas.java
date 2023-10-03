package com.arquitecturajava.dia2;

import java.util.List;

public class ImpresoraFacturas {

	
	public void imprimir(List<Factura> facturas) {

		for (Factura f : facturas) {

			System.out.println(f.getNumero());
			System.out.println(f.getImporte());
			System.out.println(f.getConcepto());
			System.out.println("---------------");
		}

	}

	public void imprimirEnLinea(List<Factura> facturas) {

		for (Factura f : facturas) {

			System.out.print(f.getNumero());
			System.out.print(",");
			System.out.print(f.getImporte());
			System.out.print(",");
			System.out.print(f.getConcepto());
			System.out.println();
			System.out.println("---------------");
		}

	}

	public void imprimirOrdenadas(List<Factura> facturas) {

		for (Factura f : facturas) {

			System.out.print(f.getNumero());
			System.out.print(",");
			System.out.print(f.getConcepto());
			System.out.print(",");
			System.out.print(f.getImporte());
			System.out.println();
			System.out.println("---------------");
		}

	}

}
