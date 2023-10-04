package com.arquitecturajava.ejemplo13.servicios;

import java.util.List;

public class ServicioB {

	public List<Factura> obtenerFacturas() {
		
		
		return List.of(new Factura("ordenador",250),new Factura("tele",700));
	}
}
