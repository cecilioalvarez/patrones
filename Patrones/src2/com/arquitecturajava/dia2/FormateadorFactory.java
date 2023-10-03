package com.arquitecturajava.dia2;

public class FormateadorFactory {

	public static Formateador getInstance(String tipo) {
		
		
		if (tipo.equals("Standard")) {
			
			return new FormateadorStandard();
		}else if (tipo.equals("Detalle")) {
			return new FormateadorDetalle();
		}else {
			return new FormateadorOrdenado();
		}
	}
	
}
