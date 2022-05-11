package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;

public class TestandoMapas {
	
	/* Um map � basicamente um conjunto de chave, valor, no qual uma chave � associada a um valor espec�fico.
	 * Tecnicamente falando, � um objeto que mapeia chaves para valores. Um map n�o pode conter valores
	 * duplicados, ou seja, uma chave corresponde a um valor.
	 * 
	 * Map � a interface, as implementa��es dessa interface s�o:
	 * 		-> HashMap: Armazena os elementos em uma tabela hash. 
	 * 			   - N�o garante ordena��o
	 * 			   - N�o possui indice
	 * 		-> TreeMap: Armazena os elementos em uma arvore red-black
	 * 			   - Garante a ordena��o conforme o m�todo compareTo implementado na classe 
	 * 		-> LinkedHashMap: Armazena os elementos em uma tabela hash com uma lista ligada que itera sobre os elementos
	 * 			   - N�o garante a ordena��o
	 * 			   - Possui �ndice conforme a ordem de inser��o
	 * 
	 * Refer�ncia: https://docs.oracle.com/javase/tutorial/collections/interfaces/map.html
	 * 
	 * Nota 1: Na pr�pria documenta��o do m�todo equals � informado que, quando este m�todo for sobreescrito, � geralmente necess�rio 
	 * sobreescrever tamb�m o m�todo hashCode para manter o contrato do hashCode, que diz que objetos que s�o iguais possuem o mesmo hash code.
	 * https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-
	 */
	
	public static void main(String[] args) {
		
		Map<Integer, String> pessoas = new HashMap<>();
		
		pessoas.put(60, "Jarbas");
		pessoas.put(59, "Jorbas");
		pessoas.put(23, "Adevaldo");
		pessoas.put(999, "Johnson");
		
		//Primeiro m�todo para iterar sobre o par chave-valor de um map (n�o suporta adicionar elementos)
		BiConsumer<Integer, String> pessoasConsumer = (Integer idade, String nome) -> System.out.println(nome + " tem " + idade + " anos.");
		pessoas.forEach(pessoasConsumer);
		
		System.out.println("-------------------------------------------------------------------");

		//Segundo m�todo para iterar sobre o par chave-valor de um map (n�o suporta adicionar elementos)
		for (Map.Entry<Integer, String> e : pessoas.entrySet() ) {
			System.out.println("Idade: " + e.getKey() + ", Nome: " + e.getValue());
		}
		
		System.out.println("-------------------------------------------------------------------");

		//Para iterar sobre as chaves de um map para retornar o valor (n�o suporta adicionar elementos)
		for (Integer idade : pessoas.keySet()) {
			System.out.println(pessoas.get(idade));
		}
		
		System.out.println("-------------------------------------------------------------------");
		
		//Para iterar apenas sobre as chaves de um map (n�o suporta adicionar elementos)
		for (Iterator<Integer> it = pessoas.keySet().iterator(); it.hasNext(); ) {
			System.out.println(it.next());
		}
		
		System.out.println("-------------------------------------------------------------------");
		
		//Para iterar apenas sobre os valores de um map (n�o suporta adicionar elementos)
		pessoas.values().forEach(n -> System.out.println(n));
		System.out.println("-------------------------------------------------------------------");
		
		
				
	}

}
