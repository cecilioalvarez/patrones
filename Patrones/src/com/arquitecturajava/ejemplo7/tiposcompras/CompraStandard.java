package com.arquitecturajava.ejemplo7.tiposcompras;

 class CompraStandard extends Compra{

	public CompraStandard(double importe) {
		super(importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getImporteFinal() {
		// TODO Auto-generated method stub
		return getImporte()*1.21;
	}

}
