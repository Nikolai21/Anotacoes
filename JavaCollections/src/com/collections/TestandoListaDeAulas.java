package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.classes.Aula;

public class TestandoListaDeAulas {
	
	public static void main(String[] args) {
		
		Aula aula1 = new Aula("Revisitando as ArrayLists", 21);
		Aula aula2 = new Aula("Listas de objetos", 20);
		Aula aula3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
				
		Comparator<Aula> sortAulas = (Aula a1, Aula a2) -> a1.compareTo(a2);
		aulas.sort(sortAulas);
		System.out.println(aulas);

		Collections.shuffle(aulas);
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);

	}

}
