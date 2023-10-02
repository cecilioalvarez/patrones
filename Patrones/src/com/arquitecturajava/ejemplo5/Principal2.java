package com.arquitecturajava.ejemplo5;

public class Principal2 {

	public static void main(String[] args) {
		Coche c= new Coche(new Pantalla(20),new Motor(200));
		
		c.arrancar();
	}

}
