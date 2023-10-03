package com.arquitecturajava.ejemplo3;

public class Telefono  implements TelefonoSmart, TelefonoBasico{

	@Override
	public void on() {
		System.out.println("enciendo");
		
	}

	@Override
	public void off() {
		System.out.println("apago");
		
	}

	@Override
	public void llamar(int numero) {
		System.out.println("llamo"+numero);
		
	}

	@Override
	public void foto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gps() {
		// TODO Auto-generated method stub
		
	}

}
