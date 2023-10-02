//package com.arquitecturajava.ejemplo7;
//
//import com.arquitecturajava.ejemplo7.tiposcompras.Compra;
//import com.arquitecturajava.ejemplo7.tiposcompras.CompraStandard;
//import com.arquitecturajava.ejemplo7.tiposcompras.CompraVIP;
//
//public class Principal {
//
//	public static void main(String[] args) {
//		// apunto con la clase padre a una clase hija
//		// es Compra c un objeto Compra
//
//		// con el concepto de compra
//		Compra c = getCompra(100, "standard");
//		System.out.println(c.getImporteFinal());
//
//		c = getCompra(100, "VIP");
//		System.out.println(c.getImporteFinal());
//	}
//
//	
//	
//	
//	
//	
//	
//	public static Compra getCompra(double valor, String tipo) {
//
//		if (tipo.equals("standard")) {
//			return new CompraStandard(valor);
//		} else {
//
//			return new CompraVIP(valor, 20);
//		}
//	}
//
//}
