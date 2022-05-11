package com.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class TestandoSets {
	
	public static void main(String[] args) {
		
		/* Sets e Listas são subinterfaces da superinterface Collection. Porém, elas possuem funcionamento interno diferente.
		 * -> Sets não possuem ordem de listagem, ou seja, não há um indice 
		 * -> Sets não aceitam objetos repetidos
		 * -> Sets são muito mais rápidos para realizar operações, pois fazem o armazenamento das informações de acordo com um a 
		 * estrutura de dados de tabela de espalhamento (no caso, HashSets)
		 * 
		 * Sets possuem 3 implementações:
		 * -> HashSet: Armazena os elementos em uma tabela hash. 
		 * 			   - Não garante ordenação
		 * 			   - Não possui indice
		 * -> TreeSet: Armazena os elementos em uma arvore red-black
		 * 			   - Garante a ordenação conforme o método compareTo implementado na classe 
		 * -> LinkedHashSet: Armazena os elementos em uma tabela hash com uma lista ligada que itera sobre os elementos
		 * 			   - Não garante a ordenação
		 * 			   - Possui índice conforme a ordem de inserção
		 * 
		 * A interface Set implementa apenas métodos herdados da interface Collection.
		 * É fortemente recomendado que o Set seja declarado como tipo Collection, para flexibilizar a implementação
		 * 
		 * Quando comparamos dois itens de um HashSet ou LinkedHashSet para saber se são iguais, não basta reescrevermos o método equals, 
		 * mas também é necessário reescrever o método hashCode, pois essas estruturas de dados utilizam uma tabela hash para armazenar dados.
		 * Dessa forma, a comparação é feita não só apenas utilizando o equals, mas também comparando o hash code dos dados comparados. Se o 
		 * hash for igual, a comparação retornará true. Caso contrário, retornará false.
		 * 
		 * Nota 1: Na própria documentação do método equals é informado que, quando este método for sobreescrito, é geralmente necessário 
		 * sobreescrever também o método hashCode para manter o contrato do hashCode, que diz que objetos que são iguais possuem o mesmo hash code.
		 * https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-
		 * 
		 * 
		 */
		
		Collection<String> alunos = new HashSet<>(); //HashSet é uma subinterface de Set
		alunos.add("Willy");
		alunos.add("Wally");
		alunos.add("Gatão");
		alunos.add("Batatinha");
		alunos.add("Tuvico");
		alunos.add("Thel");
		alunos.add("Frederico");		
		
		Consumer<String> listaDeAlunos = (String aluno) -> System.out.println(aluno); //criação de um consumidor utilizando lambdas
		
		alunos.forEach(listaDeAlunos); //precisamos de um Consumer para utilizar o método forEach
		
//		for (String aluno : alunos) {
//			System.out.println(aluno);
//		}
		
		Set<String> nomes = Collections.emptySet();
		nomes.add("oI");
		
	}

}
