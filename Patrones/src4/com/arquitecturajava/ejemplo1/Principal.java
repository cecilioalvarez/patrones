package com.arquitecturajava.ejemplo1;

public class Principal {

	public static void main(String[] args) {
		
		long t1=System.currentTimeMillis();
		
		for (int i=0;i<10;i++) {
			
			Tarea t = new Tarea("trabajoA",2);
			t.proceder();
		}
		
	
		
		long t2= System.currentTimeMillis();
		
		System.out.println(t2-t1);

	}

}
