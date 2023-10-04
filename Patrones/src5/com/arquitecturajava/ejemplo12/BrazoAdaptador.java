package com.arquitecturajava.ejemplo12;

public class BrazoAdaptador extends BrazoRobot{

	private BrazoCalendador brazoCalentador;
	
	
	
	public BrazoAdaptador(BrazoCalendador brazoCalentador) {
		super();
		this.brazoCalentador = brazoCalentador;
	}



	@Override
	public void girar() {
		brazoCalentador.calentar();
		
	}

}
