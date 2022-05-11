package com.classes;

public class Aula implements Comparable<Aula> {
	
	private String nome;
	private Integer tempo;
	
	public Aula(String nome, Integer tempo) {
		this.nome = nome;
		this.tempo = tempo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Integer getTempo() {
		return this.tempo;
	}
	
	@Override
	public String toString() {
		return "[Aula: " + this.nome + ", Duração: " + this.tempo + " min]";
	}

	@Override
	public int compareTo(Aula aula) {
		return this.nome.compareTo(aula.nome);
	}

}
