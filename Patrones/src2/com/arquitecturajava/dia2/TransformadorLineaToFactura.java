package com.arquitecturajava.dia2;

public class TransformadorLineaToFactura {

	public static Factura transformar(String linea) {
		String[] datos = null;
		if (linea.contains(",")) {
			datos = linea.split(",");
		} else {
			datos = linea.split("\\|");
		}
		return new Factura(Integer.parseInt(datos[0]), datos[1], Double.parseDouble(datos[2]));

	}

}
