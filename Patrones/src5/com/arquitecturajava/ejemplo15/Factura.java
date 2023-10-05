package com.arquitecturajava.ejemplo15;

public class Factura {

	
	private int numero;
	private String concepto;
	private double importe;
	private int importancia;
	private String cliente;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public int getImportancia() {
		return importancia;
	}
	public void setImportancia(int importancia) {
		this.importancia = importancia;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public Factura(int numero, String concepto, double importe, int importancia, String cliente) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
		this.importancia = importancia;
		this.cliente = cliente;
	}
	
	
}
