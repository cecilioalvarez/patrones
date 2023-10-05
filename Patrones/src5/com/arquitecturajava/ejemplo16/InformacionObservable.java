package com.arquitecturajava.ejemplo16;

import java.util.ArrayList;
import java.util.List;

public class InformacionObservable {

	private Informacion informacion;
	
	private List<Observador> observadores= new ArrayList<Observador>();
	
	public void registrarObservador(Observador o) {
		observadores.add(o);
	}
	
	public void actualizarInformacion(Informacion informacion) {
		
		this.informacion=informacion;
		for (Observador o: observadores) {
			
			o.procesar(informacion);
		}

	}
	
	
	
}
