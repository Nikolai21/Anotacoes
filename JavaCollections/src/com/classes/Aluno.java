package com.classes;

public class Aluno {
	
	private String nome;
	private Integer matricula;
	
	public Aluno (String nome, Integer matricula) {
		if (nome == null) {
			throw new NullPointerException();
		}
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Integer getMatricula() {
		return this.matricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		if (outro.nome != this.nome && outro.matricula != this.matricula) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode() + this.matricula.hashCode();
	}
	
	@Override
	public String toString() {
		return "[Nome: " + this.nome + ", Matricula: " + this.matricula + "]";
	}

}
