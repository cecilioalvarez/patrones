package com.arquitecturajava.ejemplo16;

public class ServicioInformacion2 {

	InformacionObservable observable;
	
	public ServicioInformacion2(InformacionObservable observable) {
		super();
		this.observable = observable;
	}

	public void recibir(Informacion informacion) {
		
		observable.actualizarInformacion(informacion);
	}
}
