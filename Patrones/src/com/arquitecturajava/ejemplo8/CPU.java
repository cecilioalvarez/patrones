package com.arquitecturajava.ejemplo8;

public class CPU {

	private DiscoDuro disco;
	private PlacaBase placa;
	
	
	public boolean isLeer() {
		return disco.isLeer();
	}
	public int getTemperatura() {
		return placa.getTemperatura();
	}
	public CPU(DiscoDuro disco, PlacaBase placa) {
		super();
		this.disco = disco;
		this.placa = placa;
	}
	
	
}
