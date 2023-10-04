package com.arquitecturajava.ejemplo11;

public class Principal {

	public static void main(String[] args) {
		
		//no estan relacionados
		
		Directorio d1= new Directorio("carpeta");
	
		Directorio subcarpeta= new Directorio("subcarpeta");
		
		d1.addFichero(new FicheroSimple("hola.txt"));
		d1.addFichero(new FicheroSimple("hola2.txt"));
		d1.addFichero(new FicheroSimple("hola3.txt"));
		d1.addFichero(new FicheroSimple("hola4.txt"));
		
		
		subcarpeta.addFichero(new FicheroSimple("adios.txt"));
		subcarpeta.addFichero(new FicheroSimple("adios2.txt"));
		
		
		// relacionalos
		d1.addFichero(subcarpeta);
		
		
		
		
	}

}
