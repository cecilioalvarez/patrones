package com.arquitecturajava.ejemplo13.servicios;

import java.time.LocalDate;

public class GastosTotales {

	private LocalDate fecha;
	private double importe;
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public GastosTotales(LocalDate fecha, double importe) {
		super();
		this.fecha = fecha;
		this.importe = importe;
	}
	public GastosTotales() {
		super();
	}
	
	
}
