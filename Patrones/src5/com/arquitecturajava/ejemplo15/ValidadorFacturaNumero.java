package com.arquitecturajava.ejemplo15;

public class ValidadorFacturaNumero extends ValidadorFactura {

	
	
	public ValidadorFacturaNumero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ValidadorFacturaNumero(ValidadorFactura siguiente) {
		super(siguiente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ValidadorFacturaError validar(Factura factura) {
		
		if (factura.getNumero() <= 0 || factura.getNumero()>100000) {

			return  new ValidadorFacturaError("el numero no es valido", true);
		}else {
			//no es lo adecuado
			return siguiente.validar(factura);
		}
		
	}

}
