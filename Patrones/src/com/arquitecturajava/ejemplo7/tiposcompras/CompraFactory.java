package com.arquitecturajava.ejemplo7.tiposcompras;

public class CompraFactory {


	// patron factory lo que hace es encapsular una jerarquia

	public static Compra getCompra(double valor) {
		return new CompraStandard(valor);
	}

	public static Compra getCompra(double valor, CompraTipo tipo) {

		if (tipo==CompraTipo.STANDARD) {
			return new CompraStandard(valor);
		} else {

			return new CompraVIP(valor, 20);
		}
	}

}
