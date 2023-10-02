package com.arquitecturajava.ejemplo5;

public class Principal {

	public static void main(String[] args) {
		Motor m= new Motor(100);
		m.arrancar();
		Pantalla p= new Pantalla(14);
		p.encender();
	}

}
