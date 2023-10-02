package com.arquitecturajava.ejemplo7.tiposcompras;

 class CompraVIP extends CompraStandard {

	private int descuento;
	
	public CompraVIP(double importe , int descuento) {
		super(importe);
		this.descuento=descuento;
		// TODO Auto-generated constructor stub
	}


	
	
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}


	@Override
	public double getImporteFinal() {
		// TODO Auto-generated method stub
		return super.getImporteFinal()-descuento;
	}

	
	
}
