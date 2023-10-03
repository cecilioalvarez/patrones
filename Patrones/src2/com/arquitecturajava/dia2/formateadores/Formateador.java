package com.arquitecturajava.dia2.formateadores;

import com.arquitecturajava.dia2.Factura;

public abstract class Formateador {

	public abstract void format(Factura f);

	public static Formateador getInstance(FormateadorTipo tipo) {

		// Object objeto = null;

		if (tipo == FormateadorTipo.Standard) {

			return new FormateadorStandard();
		} else if (tipo == FormateadorTipo.Detalle) {
			return new FormateadorDetalle();
		} else {
			return new FormateadorOrdenado();
		}
	}
}
