package com.arquitecturajava.ejemplo1;

import java.util.ArrayList;
import java.util.List;

public class GestorTarea {
	//cache a nuestra disposicion
	private List<Tarea> tareas= new ArrayList<Tarea>();
	
	public Tarea getTarea(String nombre, int dificultad) {
		
		for (Tarea t : tareas) {
			
			if (t.getNombre().equals(nombre) && t.getDificultad()==dificultad) {
				
					return  t.clone();
			}
		}
		Tarea t= new Tarea(nombre,dificultad);
		tareas.add(t);
		return t;
		
	}
}
