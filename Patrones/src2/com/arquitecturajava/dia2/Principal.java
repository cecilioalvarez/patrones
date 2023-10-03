package com.arquitecturajava.dia2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.arquitecturajava.dia2.formateadores.Formateador;
import com.arquitecturajava.dia2.formateadores.FormateadorTipo;

public class Principal {

	// principio SRP y vamos a ver el principio OCP

	// Open Closed Principle

	public static void main(String[] args) {

		Path ruta = Paths.get("documentoB.txt");
		TransformadorLineaToFactura transformador = new TransformadorLineaToFactura();

		LectorFichero lector = new LectorFichero(ruta);

		try {
			List<String> lineas = lector.leerLineas();

			List<Factura> facturas = transformador.transformarLista(lineas);

			Formateador formateador = Formateador.getInstance(FormateadorTipo.Standard);
			ImpresoraFacturas impresora = new ImpresoraFacturas(formateador);
			impresora.imprimir(facturas);
			
			formateador = Formateador.getInstance(FormateadorTipo.Ordenado);
			impresora.setFormateador(formateador);
			impresora.imprimir(facturas);
			
			formateador = Formateador.getInstance(FormateadorTipo.Detalle);
			impresora.setFormateador(formateador);
			impresora.imprimir(facturas);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
