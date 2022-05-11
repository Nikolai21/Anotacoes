package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.classes.Aula;
import com.classes.Curso;

public class TestandoCursos2 {
	
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
		
		//O construtor de ArrayList ou LinkedList aceita uma lista imutável como parâmetro para criar um clone da lista
		List<Aula> aulas = new ArrayList<>(cursoCollections.getAula());
		
		//Faz o sort de acordo com o tempo de aula (do menor para o maior)
		Comparator<Aula> comparaTempo = (Aula a1, Aula a2) -> (a1.getTempo().compareTo(a2.getTempo()));
		aulas.sort(comparaTempo);
		System.out.println(aulas);

		//faz o sort conforme definido pelo método compareTo da classe Aula
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(cursoCollections.getTempoTotal());
		
		System.out.println(cursoCollections);
		
	}
}
