package com.arquitecturajava.ejemplo6;

public class CarpetaCompartida {

	private String ruta;
	private static CarpetaCompartida instancia;

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	// constructor privado se puede invocar desde la misma clase
	private CarpetaCompartida(String ruta) {
		super();
		this.ruta = ruta;
	}

	public static CarpetaCompartida getInstancia(String ruta) {
		//ya evito la instanciacion multiple
		if (instancia == null)
			instancia = new CarpetaCompartida(ruta);
		return instancia;
	}

}
