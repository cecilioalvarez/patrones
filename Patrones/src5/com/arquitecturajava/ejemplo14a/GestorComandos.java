package com.arquitecturajava.ejemplo14a;

import java.util.HashMap;
import java.util.Map;

public class GestorComandos {

	public Map<String,Comando> comandos= new HashMap<String,Comando>();
	
	
	public void registrar(String nombre,Comando comando) {
		
		comandos.put(nombre, comando);
	}
	
	public Comando getComando(String nombre) {
		
		return comandos.get(nombre);
	}
	
}
