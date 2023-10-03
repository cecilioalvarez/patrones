package com.arquitecturajava.ejemplo1;

public class Tarea implements Cloneable {

	private String nombre;
	private int dificultad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDificultad() {
		return dificultad;
	}
	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}
	// que la tarea es pesada de ejecutar
	
	public Tarea(String nombre, int dificultad) {
		super();
		this.nombre = nombre;
		this.dificultad = dificultad;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private Tarea() {
		
	}
	
	
	
	public void proceder() {
		
		System.out.println("la tarea se procesa  " + nombre+ ","+ dificultad);
	}
	
	public Tarea clone() {
		
		Tarea tareaCopia= new Tarea();
		tareaCopia.setNombre(nombre);
		tareaCopia.setDificultad(dificultad);
		return tareaCopia;
	}
}
