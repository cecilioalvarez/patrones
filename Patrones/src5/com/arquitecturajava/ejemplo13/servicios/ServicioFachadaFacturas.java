package com.arquitecturajava.ejemplo13.servicios;

import java.time.LocalDate;

import com.arquitecturajava.ejemplo13.servicios.adaptadores.ServicioViejoAdapter;

public class ServicioFachadaFacturas {

	private ServicioA servicioA;
	private ServicioB servicioB;
	private ServicioViejoAdapter servicioC;

	
	
	
	public ServicioFachadaFacturas(ServicioA servicioA, ServicioB servicioB, ServicioViejoAdapter servicioC) {
		super();
		this.servicioA = servicioA;
		this.servicioB = servicioB;
		this.servicioC = servicioC;
	}




	public GastosTotales obtenerTodos() {

		GastosTotales gastos = new GastosTotales();
		double total = 0;
		for (Factura f : servicioA.obtenerFacturas()) {

			total += f.getImporte();
		}

		for (Factura f : servicioB.obtenerFacturas()) {

			total += f.getImporte();
		}

		for (Factura f : servicioC.obtenerFacturas()) {

			total += f.getImporte();
		}
		gastos.setFecha(LocalDate.now());
		gastos.setImporte(total);
		return gastos;
	}

}
