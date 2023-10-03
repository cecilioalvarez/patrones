package com.arquitecturajava.ejemplo2;

public class TelefonoImpl implements Telefono {

	private int numero;

	@Override
	public int getNumero() {
		return numero;
	}

	@Override
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public TelefonoImpl(int numero) {
		super();
		this.numero = numero;
	}

	@Override
	public void llamar() {
		
		System.out.println("llamo con "+ numero);
	}
}
