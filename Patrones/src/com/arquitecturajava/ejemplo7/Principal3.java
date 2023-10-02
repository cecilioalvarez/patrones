package com.arquitecturajava.ejemplo7;

import com.arquitecturajava.ejemplo7.tiposcompras.Compra;
import com.arquitecturajava.ejemplo7.tiposcompras.CompraFactory;
import com.arquitecturajava.ejemplo7.tiposcompras.CompraTipo;

public class Principal3 {

	public static void main(String[] args) {
		
		//obtengo una compra normal
		
		Compra c = CompraFactory.getCompra(100);
		System.out.println(c.getImporteFinal());
		//una compra vip
		c = CompraFactory.getCompra(100, CompraTipo.VIP);
		System.out.println(c.getImporteFinal());
	}
	


}
