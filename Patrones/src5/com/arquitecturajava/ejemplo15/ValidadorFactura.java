package com.arquitecturajava.ejemplo15;

public abstract class ValidadorFactura {

	protected ValidadorFactura siguiente;
	
	public ValidadorFactura(ValidadorFactura siguiente) {
		super();
		this.siguiente = siguiente;
	}

	public ValidadorFactura() {
		super();
	}

	public abstract ValidadorFacturaError validar(Factura factura);
	

}
