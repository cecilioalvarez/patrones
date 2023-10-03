package com.arquitecturajava.ejemplo1;

public class Principal2 {

	public static void main(String[] args) {
		
		GestorTarea gestor= new GestorTarea();
		long t1=System.currentTimeMillis();
		
		for (int i=0;i<10;i++) {
			
			Tarea t=gestor.getTarea("trabajoA", 2);
			t.proceder();
		}
		
		long t2= System.currentTimeMillis();
		
		System.out.println(t2-t1);

	}

}
