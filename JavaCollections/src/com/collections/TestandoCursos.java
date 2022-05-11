package com.collections;

import java.util.List;

import com.classes.Aula;
import com.classes.Curso;

public class TestandoCursos {
	
	public static void main(String[] args) {
		
		Aula aula1 = new Aula("Revisitando as ArrayLists", 21);
		Aula aula2 = new Aula("Listas de objetos", 20);
		Aula aula3 = new Aula("Relacionamento de listas e objetos", 15);
		Aula aula4 = new Aula("Relacionamento de coleções", 23);

		
		Curso collections = new Curso("Explorando Collections em Java", "Paulo Silveira");
		
		collections.adiciona(aula1);
		collections.adiciona(aula2);
		collections.adiciona(aula3);
		collections.adiciona(aula4);
		
		List<Aula> aulas = collections.getAula();
		
		System.out.println(aulas);
		
	}

}
