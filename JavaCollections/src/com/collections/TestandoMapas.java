package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;

public class TestandoMapas {
	
	/* Um map é basicamente um conjunto de chave, valor, no qual uma chave é associada a um valor específico.
	 * Tecnicamente falando, é um objeto que mapeia chaves para valores. Um map não pode conter valores
	 * duplicados, ou seja, uma chave corresponde a um valor.
	 * 
	 * Map é a interface, as implementações dessa interface são:
	 * 		-> HashMap: Armazena os elementos em uma tabela hash. 
	 * 			   - Não garante ordenação
	 * 			   - Não possui indice
	 * 		-> TreeMap: Armazena os elementos em uma arvore red-black
	 * 			   - Garante a ordenação conforme o método compareTo implementado na classe 
	 * 		-> LinkedHashMap: Armazena os elementos em uma tabela hash com uma lista ligada que itera sobre os elementos
	 * 			   - Não garante a ordenação
	 * 			   - Possui índice conforme a ordem de inserção
	 * 
	 * Referência: https://docs.oracle.com/javase/tutorial/collections/interfaces/map.html
	 * 
	 * Nota 1: Na própria documentação do método equals é informado que, quando este método for sobreescrito, é geralmente necessário 
	 * sobreescrever também o método hashCode para manter o contrato do hashCode, que diz que objetos que são iguais possuem o mesmo hash code.
	 * https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-
	 */
	
	public static void main(String[] args) {
		
		Map<Integer, String> pessoas = new HashMap<>();
		
		pessoas.put(60, "Jarbas");
		pessoas.put(59, "Jorbas");
		pessoas.put(23, "Adevaldo");
		pessoas.put(999, "Johnson");
		
		//Primeiro método para iterar sobre o par chave-valor de um map (não suporta adicionar elementos)
		BiConsumer<Integer, String> pessoasConsumer = (Integer idade, String nome) -> System.out.println(nome + " tem " + idade + " anos.");
		pessoas.forEach(pessoasConsumer);
		
		System.out.println("-------------------------------------------------------------------");

		//Segundo método para iterar sobre o par chave-valor de um map (não suporta adicionar elementos)
		for (Map.Entry<Integer, String> e : pessoas.entrySet() ) {
			System.out.println("Idade: " + e.getKey() + ", Nome: " + e.getValue());
		}
		
		System.out.println("-------------------------------------------------------------------");

		//Para iterar sobre as chaves de um map para retornar o valor (não suporta adicionar elementos)
		for (Integer idade : pessoas.keySet()) {
			System.out.println(pessoas.get(idade));
		}
		
		System.out.println("-------------------------------------------------------------------");
		
		//Para iterar apenas sobre as chaves de um map (não suporta adicionar elementos)
		for (Iterator<Integer> it = pessoas.keySet().iterator(); it.hasNext(); ) {
			System.out.println(it.next());
		}
		
		System.out.println("-------------------------------------------------------------------");
		
		//Para iterar apenas sobre os valores de um map (não suporta adicionar elementos)
		pessoas.values().forEach(n -> System.out.println(n));
		System.out.println("-------------------------------------------------------------------");
		
		
				
	}

}
