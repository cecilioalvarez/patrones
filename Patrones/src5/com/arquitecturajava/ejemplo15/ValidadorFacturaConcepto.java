package com.arquitecturajava.ejemplo15;

public class ValidadorFacturaConcepto extends ValidadorFactura {

	
	
	public ValidadorFacturaConcepto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ValidadorFacturaConcepto(ValidadorFactura siguiente) {
		super(siguiente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ValidadorFacturaError validar(Factura factura) {
		
		if (factura.getConcepto().equals("") || factura.getConcepto().equals("null")) {

			return new ValidadorFacturaError("el concepto no es valido", true);
		}
		return  siguiente.validar(factura);
		
	}

}
