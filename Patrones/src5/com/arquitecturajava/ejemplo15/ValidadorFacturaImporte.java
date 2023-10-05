package com.arquitecturajava.ejemplo15;

public class ValidadorFacturaImporte extends ValidadorFactura {

	@Override
	public ValidadorFacturaError validar(Factura factura) {
		if (factura.getImporte() > 5000 || factura.getImporte()<0) {

			return new ValidadorFacturaError("el importe no es valido", true);
		}
		return new ValidadorFacturaError("todook",false);
		
	}

	public ValidadorFacturaImporte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ValidadorFacturaImporte(ValidadorFactura siguiente) {
		super(siguiente);
		// TODO Auto-generated constructor stub
	}

}
