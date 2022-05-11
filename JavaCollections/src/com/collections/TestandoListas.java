package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListas {
	
	public static void main(String[] args) {
		
		ArrayList<String> cursos = new ArrayList<>();
		
		String curso1 = "Reflections";
		String curso2 = "Orientação a objetos";
		String curso3 = "Springboot"; 
		String curso4 = "Java Threads 2";
		
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println(cursos);
		
		Comparator<String> ordemAlfabetica = ((String s1, String s2) -> s1.compareTo(s2));
		cursos.sort(ordemAlfabetica); //-> Sort utilizando comparator e lambdas ^
		System.out.println(cursos);
		
		Collections.shuffle(cursos); //-> Misturando itens da lista com o método estático shuffle da classe utilitária Collections
		System.out.println(cursos);

		Collections.sort(cursos); //-> Reordenando os itens com o método estático sort da classe utilitária Collections
		System.out.println(cursos);
		
	}

}
