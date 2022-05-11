package com.classes;

public class Recibo {
	
	private Integer numero;
	private Double valor;
	
	public Recibo (Integer numero, Double valor) {
		this.numero = numero;
		this.valor = valor;
	}

	public Integer getNumero() {
		return numero;
	}

	public Double getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return "[Recibo: " + this.numero + ", Valor: " + this.valor + "]";
	}
	
}
