package com.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import com.classes.Aluno;
import com.classes.Aula;
import com.classes.Curso;

public class TestandoCursosComAlunos {
	
	public static void main(String[] args) {
		
		Aula aula1 = new Aula("Revisitando as ArrayLists", 21);
		Aula aula2 = new Aula("Listas de objetos", 20);
		Aula aula3 = new Aula("Relacionamento de listas e objetos", 15);
		Aula aula4 = new Aula("Relacionamento de coleções", 23);

		Curso cursoCollections = new Curso("Explorando Collections em Java", "Paulo Silveira");
		
		cursoCollections.adiciona(aula1);
		cursoCollections.adiciona(aula2);
		cursoCollections.adiciona(aula3);
		cursoCollections.adiciona(aula4);
		
		Aluno aluno1 = new Aluno("Willy", 12345);
		Aluno aluno2 = new Aluno("Wally", 23456);
		Aluno aluno3 = new Aluno("Gatão", 34567);
		Aluno aluno4 = new Aluno("Batatinha", 45678);
		Aluno aluno5 = new Aluno("Batatinha", 45678);
		
		
		cursoCollections.matricula(aluno1);
		cursoCollections.matricula(aluno2);
		cursoCollections.matricula(aluno3);
		cursoCollections.matricula(aluno4);
		
		Collection<Aluno> alunos = cursoCollections.getAlunos();
		
		alunos.forEach(a -> System.out.println(a));	
		
		System.out.println(cursoCollections.estaMatriculado(aluno5));
		
		//forma de iterar no java 8
		alunos.forEach(a -> System.out.println(a));	
		
		//forma de iterar no java 5, java 6 e java 7
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
		
		//forma de iterar antes do java 5
		Iterator<Aluno> iteradorDeAlunos = alunos.iterator();
		
		while (iteradorDeAlunos.hasNext()) {
			System.out.println(iteradorDeAlunos.next());
		}
		
		cursoCollections.buscaMatriculado(12345);
		
	}

}
