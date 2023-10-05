package com.arquitecturajava.ejemplo16;

public class Principal {

	public static void main(String[] args) {
		
		Informacion i= new Informacion("hola1","yo","nivel1");
		
		InformacionObservable observable= new InformacionObservable();
		
		observable.registrarObservador(new ServicioA());
		//observable.registrarObservador(new ServicioB());
		//observable.registrarObservador(new ServicioC());
		
		ServicioInformacion2 si= new ServicioInformacion2(observable);
		
		si.recibir(i);
				

	}

}
