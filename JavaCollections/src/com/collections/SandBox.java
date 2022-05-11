package com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.classes.Funcionario;

public class SandBox {

	public static void main(String[] args) {
		
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");

		Iterator<String> iteradorDeLetras = letras.iterator();
		
		while (iteradorDeLetras.hasNext()) {
			System.out.println(iteradorDeLetras.next());
		}
		
		Funcionario func1 = new Funcionario ("Jarbas", 50);
		Funcionario func2 = new Funcionario ("Jorbas", 68);
		Funcionario func3 = new Funcionario ("Aldevaldo", 23);
		
		Set<Funcionario> listaDeFuncionarios = new TreeSet<>();
		
		listaDeFuncionarios.add(func1);
		listaDeFuncionarios.add(func2);
		listaDeFuncionarios.add(func3);
		
		Iterator<Funcionario> iteradorDeFuncs = listaDeFuncionarios.iterator();
		
		while (iteradorDeFuncs.hasNext()) {
			System.out.println(iteradorDeFuncs.next());
		}
		
	}

}
