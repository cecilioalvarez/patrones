//package com.arquitecturajava.ejemplo14a;
//
//import com.arquitecturajava.ejemplo14a.comandos.ComandoAltaSocio;
//import com.arquitecturajava.ejemplo14a.comandos.ComandoCompuesto;
//import com.arquitecturajava.ejemplo14a.comandos.ComandoPagoCuota;
//import com.arquitecturajava.ejemplo14a.comandos.ComandoRenovar;
//import com.arquitecturajava.ejemplo14a.comandos.ComandoTarjetaAcceso;
//import com.arquitecturajava.ejemplo14a.comandos.GestorComandos;
//
//public class Principal {
//
//	public static void main(String[] args) {
//
//	
//		GestorComandos gestor = inicializarGestor();
//		/////////
//		gestor.getComando("altarenovarfinal").ejecutar();
//	
//		
//	}
//
//	private static GestorComandos inicializarGestor() {
//		ComandoCompuesto cc= new ComandoCompuesto("altafinal");
//		cc.addComando(new ComandoAltaSocio());
//		//cc.addComando(new ComandoPagoCuota());
//		cc.addComando(new ComandoTarjetaAcceso());
//		
//		
//		ComandoCompuesto cc2= new ComandoCompuesto("renovarfinal");
//		cc2.addComando(new ComandoRenovar());
//		cc2.addComando(new ComandoPagoCuota());
//		cc2.addComando(new ComandoTarjetaAcceso());
//		
//		
//		GestorComandos gestor=GestorComandos.getInstance();
//		
//		
//		//comando es un comando compuesto de comandos compuestos
//		ComandoCompuesto cc3= new ComandoCompuesto("altarenovarfinal");
//		cc3.addComando(cc);
//		cc3.addComando(cc2);
//		
//		gestor.registrar(cc3.getNombre(), cc3);
//		
//		//gestor.registrar(cc.getNombre(), cc);
//		//gestor.registrar(cc2.getNombre(), cc2);
//		return gestor;
//	}
//
//}
