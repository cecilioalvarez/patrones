package com.arquitecturajava.ejemplo16;

public class Informacion {

	
	
	
	public Informacion(String mensaje, String receptor, String nivel) {
		super();
		this.mensaje = mensaje;
		this.receptor = receptor;
		this.nivel = nivel;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getReceptor() {
		return receptor;
	}
	public void setReceptor(String receptor) {
		this.receptor = receptor;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	private String mensaje;
	private String receptor;
	private String nivel;
}
