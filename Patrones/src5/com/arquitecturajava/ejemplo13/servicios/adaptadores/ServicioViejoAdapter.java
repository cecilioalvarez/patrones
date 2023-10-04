package com.arquitecturajava.ejemplo13.servicios.adaptadores;

import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.ejemplo13.legacy.Cliente;
import com.arquitecturajava.ejemplo13.legacy.ServicioViejo;
import com.arquitecturajava.ejemplo13.servicios.Factura;

public class ServicioViejoAdapter {

	private ServicioViejo servicioViejo;

	public ServicioViejoAdapter(ServicioViejo servicioViejo) {
		super();
		this.servicioViejo = servicioViejo;
	}
	
	public List<Factura> obtenerFacturas() {
		
		List<Factura> facturas= new ArrayList<Factura>();
		
		List<Cliente> lista=servicioViejo.obtenerClientes();
		
		for (Cliente c: lista) {
			
			Factura f= new Factura("compra standard",c.getImporte());
			
		}
		return facturas;
	
	}
	
	
	
	
}
