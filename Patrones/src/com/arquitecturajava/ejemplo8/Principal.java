package com.arquitecturajava.ejemplo8;

public class Principal {

	public static void main(String[] args) {
		CPU c= new CPU(new DiscoDuro(), new PlacaBase(100,50) );
		System.out.println(c.getTemperatura());
		System.out.println(c.isLeer());
	}

}
