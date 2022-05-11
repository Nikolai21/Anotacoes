package com.classes;

public class Funcionario implements Comparable<Funcionario> {
	
	private String nome;
	private Integer idade;
	
	public Funcionario (String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Integer getIdade() {
		return this.idade;
	}
	
	@Override
	public String toString() {
		return "[Nome: " + this.nome + ", Idade: " + this.idade + "]";
	}

	@Override
	public int compareTo(Funcionario funcionario) {
		Integer idade = funcionario.getIdade();
		return this.getIdade() - idade;
	}
	
	
	
}
