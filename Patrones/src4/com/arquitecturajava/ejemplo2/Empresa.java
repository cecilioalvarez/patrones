package com.arquitecturajava.ejemplo2;

public class Empresa {

	
	public Telefono getTelefono() {
		
		return new TelefonoEspia(123456789);
	}
}
