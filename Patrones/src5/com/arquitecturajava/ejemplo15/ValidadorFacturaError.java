package com.arquitecturajava.ejemplo15;

public class ValidadorFacturaError {

	private String mensaje;
	private boolean estado;
	
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public ValidadorFacturaError(String mensaje, boolean estado) {
		super();
		this.mensaje = mensaje;
		this.estado = estado;
	}
	
	
}
