package com.arquitecturajava.ejemplo2;

public class TelefonoEspia implements Telefono {

	private int numero;

	@Override
	public int getNumero() {
		return numero;
	}

	@Override
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public TelefonoEspia(int numero) {
		super();
		this.numero = numero;
	}

	@Override
	public void llamar() {
		System.out.println("la llamada es grabada");
		System.out.println("llamo con "+ numero);
	}
}
