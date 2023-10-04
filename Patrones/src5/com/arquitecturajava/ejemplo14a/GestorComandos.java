package com.arquitecturajava.ejemplo14a;

import java.util.HashMap;
import java.util.Map;
// una pequeña cache
public class GestorComandos {

	public Map<String,Comando> comandos= new HashMap<String,Comando>();
	
	
	public static GestorComandos gestor;
	
	public static GestorComandos getInstance() {
		
		if (gestor==null) {
			gestor= new GestorComandos();
		}
		return gestor;
	}
	
	private GestorComandos() {
		
		
	}
	public void registrar(String nombre,Comando comando) {
		
		comandos.put(nombre, comando);
	}
	
	public Comando getComando(String nombre) {
		
		return comandos.get(nombre);
	}
	
}
