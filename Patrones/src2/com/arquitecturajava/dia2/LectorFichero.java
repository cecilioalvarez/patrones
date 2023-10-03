package com.arquitecturajava.dia2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LectorFichero {

	private Path ruta;

	public Path getRuta() {
		return ruta;
	}

	public void setRuta(Path ruta) {
		this.ruta = ruta;
	}

	public LectorFichero(Path ruta) {
		super();
		this.ruta = ruta;
	}

	public List<String> leerLineas() throws IOException {

		return Files.readAllLines(ruta, StandardCharsets.UTF_8);

	}

	public List<Factura> leerFacturas() throws IOException {

		List<Factura> lista = new ArrayList<Factura>();
		for (String linea : leerLineas()) {
			Factura factura = TransformadorLineaToFactura.transformar(linea);
			lista.add(factura);
		}

	return lista;

	}

	public void imprimirLineas() {

		try {
			for (String linea : leerLineas()) {

				System.out.println(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
