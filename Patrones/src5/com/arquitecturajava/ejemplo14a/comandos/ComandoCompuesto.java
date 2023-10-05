package com.arquitecturajava.ejemplo14a.comandos;

import java.util.ArrayList;
import java.util.List;

class ComandoCompuesto extends Comando {

	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public ComandoCompuesto(String nombre) {
		super();
		this.nombre = nombre;
	}


	private List<Comando> comandos = new ArrayList<Comando>();

	@Override
	public void ejecutar() {

		for (Comando c : comandos) {

			c.ejecutar();
		}

	}

	public void addComando(Comando comando) {

		comandos.add(comando);
	}

}
