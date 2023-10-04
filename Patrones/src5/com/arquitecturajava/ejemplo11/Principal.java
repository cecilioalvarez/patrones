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
		
		// listado es un listado parcial ya que 
		// no tenemos un acceso completo a toda la jerarquia
		recorrerDirectorios(d1);
		
		
		
		
	}

	private static void recorrerDirectorios(Directorio d1) {
		
		for (Fichero f : d1.getLista()) {
			
			System.out.println(f.getNombre());
			if (f.esDirectorio()) {
				// cuando se llama a si misma
				recorrerDirectorios((Directorio)f);
			}
		}
	}

}
