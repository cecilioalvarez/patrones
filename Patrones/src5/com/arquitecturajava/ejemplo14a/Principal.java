package com.arquitecturajava.ejemplo14a;

public class Principal {

	public static void main(String[] args) {

	
		GestorComandos gestor = inicializarGestor();
		/////////
		gestor.getComando("altafinal").ejecutar();
	
		System.out.println("... tiempo ....");
		
		gestor.getComando("renovarfinal").ejecutar();
		
		System.out.println("... tiempo ....");

		gestor.getComando("altafinal").ejecutar();
	}

	private static GestorComandos inicializarGestor() {
		ComandoCompuesto cc= new ComandoCompuesto("altafinal");
		cc.addComando(new ComandoAltaSocio());
		//cc.addComando(new ComandoPagoCuota());
		cc.addComando(new ComandoTarjetaAcceso());
		
		
		ComandoCompuesto cc2= new ComandoCompuesto("renovarfinal");
		cc2.addComando(new ComandoRenovar());
		cc2.addComando(new ComandoPagoCuota());
		cc2.addComando(new ComandoTarjetaAcceso());
		
		
		GestorComandos gestor= new GestorComandos();
		
		gestor.registrar(cc.getNombre(), cc);
		gestor.registrar(cc2.getNombre(), cc2);
		return gestor;
	}

}
