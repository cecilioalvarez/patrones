package com.arquitecturajava.ejemplo10;

public class Principal {

	public static void main(String[] args) {

		mensajesN2(10);

	}

	public static void mensajesN(int numero) {

		for (int i = numero; i > 0; i--) {
			System.out.println(i);
			System.out.println("iteracion" +i);
		}
	}

	// numero=9
	public static void mensajesN2(int numero) {

		System.out.println("iteracion" +numero);
		if (numero > 0) {
			System.out.println(numero);
			//8
			mensajesN2(numero - 1);
		} else {
			System.out.println(numero);
		}
		

	}

}
