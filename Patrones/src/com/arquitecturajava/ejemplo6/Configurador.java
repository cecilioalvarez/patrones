package com.arquitecturajava.ejemplo6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configurador {

	private String usuario;
	private String clave;
	private String url;
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
	
	
	public void cargar() {
		
		Properties propiedades= new Properties();
		System.out.println("carga los datos");
		try {
			propiedades.load( new FileInputStream(new File("database.properties")));
			usuario=propiedades.getProperty("usuario");
			clave= propiedades.getProperty("clave");
			url= propiedades.getProperty("url");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
