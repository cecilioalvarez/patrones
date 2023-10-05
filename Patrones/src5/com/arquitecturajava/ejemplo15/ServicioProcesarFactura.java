package com.arquitecturajava.ejemplo15;

public class ServicioProcesarFactura {

	//SRP verlo que como que son 5
	public void procesar(Factura factura) {

		if (factura.getNumero() <= 0 || factura.getNumero()>100000) {

			System.out.println("la factura no tiene un numero valido");
		}
		if (factura.getConcepto().equals("") || factura.getConcepto().equals("null")) {

			System.out.println("la factura no tiene un concepto valido");
		}
		if (factura.getImporte() > 5000 || factura.getImporte()<0) {

			System.out.println("la factura es un importe extraño");
		}
		
		if (factura.getCliente().contains("vip")) {

			System.out.println("envio un correo");
		}
		
		if (factura.getImportancia()>3) {

			System.out.println("envio una notificacion");
		}

	}
}
