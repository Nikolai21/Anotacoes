package com.collections;

import java.util.Set;
import java.util.TreeSet;

import com.classes.Recibo;

public class TestandoTreeSet {
	
	public static void main(String[] args) {
		
		Recibo r1 = new Recibo (111, 20.00);
		Recibo r2 = new Recibo (112, 21.00);
		Recibo r3 = new Recibo (113, 18.00);
		
		//Uma TreeSet necessita que a classe tipada implemente a interface Comparable. Caso não seja possível
		//implementar a interface, podemos lançar um comparator no construtor da TreeSet
		Set<Recibo> recibos = new TreeSet<>(((recibo1, recibo2) -> recibo1.getValor().compareTo(recibo2.getValor())));
		
		recibos.add(r1);
		recibos.add(r2);
		recibos.add(r3);
		
		System.out.println(recibos);
		
	}

}
