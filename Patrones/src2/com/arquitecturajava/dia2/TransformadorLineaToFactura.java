package com.arquitecturajava.dia2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TransformadorLineaToFactura {

	public  Factura transformar(String linea) {
		String[] datos = null;
		if (linea.contains(",")) {
			datos = linea.split(",");
		} else {
			datos = linea.split("\\|");
		}
		return new Factura(Integer.parseInt(datos[0]), datos[1], Double.parseDouble(datos[2]));

	}

	public  List<Factura> transformarLista(List<String> lineas) throws IOException {

		List<Factura> lista = new ArrayList<Factura>();
		for (String linea : lineas) {
			Factura factura = transformar(linea);
			lista.add(factura);
		}

		return lista;

	}

}
