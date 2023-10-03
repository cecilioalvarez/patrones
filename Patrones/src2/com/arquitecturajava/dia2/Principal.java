package com.arquitecturajava.dia2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		Path ruta = Paths.get("documentoA.txt");

		LectorFichero lector= new LectorFichero(ruta);
		
		try {
			List<Factura> facturas=lector.leerFacturas();
			
			for (Factura f: facturas) {
				
				System.out.println(f.getNumero());
				System.out.println(f.getImporte());
				System.out.println(f.getConcepto());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
