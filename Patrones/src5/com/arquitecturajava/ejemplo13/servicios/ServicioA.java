package com.arquitecturajava.ejemplo13.servicios;

import java.util.List;

public class ServicioA {

	public List<Factura> obtenerFacturas() {
		
		
		return List.of(new Factura("ordenador",200),new Factura("tele",500));
	}
}
