package com.arquitecturajava.ejemplo11;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Fichero {

	
	private List<Fichero> lista= new ArrayList<Fichero>();
	
	public Directorio(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	public void addFichero (Fichero f) {
		
		lista.add(f);
	}

	public List<Fichero> getLista() {
		return lista;
	}

	public void setLista(List<Fichero> lista) {
		this.lista = lista;
	}
	
	

}
