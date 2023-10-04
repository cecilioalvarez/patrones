package com.arquitecturajava.ejemplo14;

public class Principal {

	public static void main(String[] args) {

		ServicioA s1 = new ServicioA();
		s1.tareaA();
		s1.tareaAB();
		s1.tareaAC();

		System.out.println("...");
		s1.tareaAD();
		s1.tareaAB();
		s1.tareaAC();

	}

}
