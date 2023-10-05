package com.arquitecturajava.ejemplo14a.comandos;

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
		
		comandos.put("altasocio", new ComandoAltaSocio());
		comandos.put("pagocuota", new ComandoPagoCuota());
		comandos.put("renovar", new ComandoRenovar());
		comandos.put("tarjetaacceso", new ComandoTarjetaAcceso());
		
		
		
		
	}
	public void registrarCompuesto(String nombre, String [] listaComandos) {
		
		ComandoCompuesto cc= new ComandoCompuesto(nombre);
		
		for (String comando: listaComandos) {
			
			cc.addComando(comandos.get(comando));
		}
		
		registrar(nombre, cc);
		
		
	}
	public void registrar(String nombre,Comando comando) {
		
		comandos.put(nombre, comando);
	}
	
	public Comando getComando(String nombre) {
		
		if (nombre.equals("altasocio")) {
			
			System.out.println("enviame un correo");
		}
		return comandos.get(nombre);
	}
	
}
