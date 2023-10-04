package com.arquitecturajava.ejemplo13.legacy;

import java.util.List;

public class ServicioViejo {

	public List<Cliente> obtenerClientes() {
		
		
		return List.of(new Cliente("pepe",400),new Cliente("juan",750));
	}
}
