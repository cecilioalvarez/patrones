package com.arquitecturajava.ejemplo13;

import com.arquitecturajava.ejemplo13.legacy.ServicioViejo;
import com.arquitecturajava.ejemplo13.servicios.GastosTotales;
import com.arquitecturajava.ejemplo13.servicios.ServicioA;
import com.arquitecturajava.ejemplo13.servicios.ServicioB;
import com.arquitecturajava.ejemplo13.servicios.ServicioFachadaFacturas;
import com.arquitecturajava.ejemplo13.servicios.adaptadores.ServicioViejoAdapter;

public class Principal {

	public static void main(String[] args) {
		
		
		ServicioFachadaFacturas sf= new ServicioFachadaFacturas(new ServicioA(),new ServicioB(), new ServicioViejoAdapter(new ServicioViejo()));
		GastosTotales gastos=sf.obtenerTodos();
		System.out.println(gastos.getFecha());
		

	}

}
