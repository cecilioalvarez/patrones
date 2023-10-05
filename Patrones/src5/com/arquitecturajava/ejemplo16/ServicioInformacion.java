package com.arquitecturajava.ejemplo16;

public class ServicioInformacion {

	
	
	
	
	public void recibir(Informacion informacion) {
		
		ServicioA a= new ServicioA();
		a.procesar(informacion);
		ServicioB b= new ServicioB();
		b.procesar(informacion);
		ServicioC c= new ServicioC();
		c.procesar(informacion);
	}
}
