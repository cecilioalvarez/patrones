package com.arquitecturajava.dia2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		Path ruta = Paths.get("documentoB.txt");

		LectorFichero lector= new LectorFichero(ruta);
		try {
			List<Factura> facturas= lector.leerFacturas();
			ImpresoraFacturas impresora= new ImpresoraFacturas();
			impresora.imprimir(facturas);
			impresora.imprimirEnLinea(facturas);
			impresora.imprimirOrdenadas(facturas);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	}

}
