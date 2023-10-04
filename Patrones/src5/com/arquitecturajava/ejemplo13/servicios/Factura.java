package com.arquitecturajava.ejemplo13.servicios;

public class Factura {

	private String concepto;
	private double importe;
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public Factura(String concepto, double importe) {
		super();
		this.concepto = concepto;
		this.importe = importe;
	}
	
	
}
