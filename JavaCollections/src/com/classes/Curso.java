package com.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private Integer tempoTotal;
	private List<Aula> aulas = new ArrayList<>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getCurso() {
		return this.nome;
	}

	public String getInstrutor() {
		return this.instrutor;
	}

	public Integer getTempoTotal() {
		this.tempoTotal = 0;
		for (Aula aula : aulas) {
			this.tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}

	public List<Aula> getAula() {
		/*
		 * é considerado boa prática não retornarmos o objeto diretamente, mas sim uma
		 * cópia dele, pois caso o objeto seja diretamente retornado, ele poderá ser
		 * modificado. A classe collections possui um método para retornar uma lista não
		 * modificável, dessa forma retornaremos uma cópia de apenas leitura
		 */
		return Collections.unmodifiableList(this.aulas);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(this.alunos);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		return alunos.contains(aluno);
	}


	@Override
	public String toString() {
		return "[Curso: " + this.nome + ", Duração: " + this.getTempoTotal() + " min]\n" + 
				"[Aulas detes curso: " + this.getAula() + "]";
	}
	
	public void buscaMatriculado(Integer matricula) {
		
		if (!this.matriculaParaAluno.containsKey(matricula)) {
			throw new NoSuchElementException();
		}
		Aluno aluno = this.matriculaParaAluno.get(matricula);
		System.out.println(aluno);
	}

}
