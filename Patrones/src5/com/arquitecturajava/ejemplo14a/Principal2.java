package com.arquitecturajava.ejemplo14a;

import com.arquitecturajava.ejemplo14a.comandos.Comando;
import com.arquitecturajava.ejemplo14a.comandos.GestorComandos;
import com.arquitecturajava.ejemplo14a.miscomandos.ComandoCorreo;

public class Principal2 {

	public static void main(String[] args) {

		GestorComandos gestor = GestorComandos.getInstance();
		gestor.registrar("correo", new ComandoCorreo());
		
		Comando c=gestor.getComando("correo");
		c.ejecutar();
		
		/*
		String[] listaComandos= {"altasocio","pagocuota","tarjetaacceso"};
		gestor.registrarCompuesto("altatotal", listaComandos);
		
		gestor.registrar("correo", );
		Comando c=gestor.getComando("altatotal");
		c.ejecutar();
	*/
	}

}
