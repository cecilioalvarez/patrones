package com.arquitecturajava.ejemplo7.tiposcompras;

public abstract class Compra {

	
	
	
	private double importe;

	public double getImporte() {
		return importe;
	}

	public Compra(double importe) {
		super();
		this.importe = importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public abstract double getImporteFinal();

}
