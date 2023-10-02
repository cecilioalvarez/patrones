package com.arquitecturajava.ejemplo6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configurador {

	//variable de instancia
	private String usuario;
	private String clave;
	private String url;
	// solo existe una instancia para la clase
	private static Configurador instancia;  //null
	
	public static Configurador getInstancia() {
		
		if (instancia==null) {
			//fase de construccion solo se pasa una vez
			System.out.println("paso una vez");
			instancia= new Configurador();
			instancia.cargar();
		}
		return instancia;
	}
	
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	//debe ser un metodo publico de acceso
	//desde cualquier lugar
	private void cargar() {
		//metodo carga los datos del objeto
		// y lo deja preparado 
		Properties propiedades= new Properties();
		System.out.println("carga los datos");
		try {
			propiedades.load( new FileInputStream(new File("database.properties")));
			instancia.setUsuario(propiedades.getProperty("usuario"));
			instancia.setClave(propiedades.getProperty("clave"));
			instancia.setUrl(propiedades.getProperty("url"));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
