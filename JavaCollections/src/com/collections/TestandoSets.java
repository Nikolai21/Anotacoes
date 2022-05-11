package com.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class TestandoSets {
	
	public static void main(String[] args) {
		
		/* Sets e Listas s�o subinterfaces da superinterface Collection. Por�m, elas possuem funcionamento interno diferente.
		 * -> Sets n�o possuem ordem de listagem, ou seja, n�o h� um indice 
		 * -> Sets n�o aceitam objetos repetidos
		 * -> Sets s�o muito mais r�pidos para realizar opera��es, pois fazem o armazenamento das informa��es de acordo com um a 
		 * estrutura de dados de tabela de espalhamento (no caso, HashSets)
		 * 
		 * Sets possuem 3 implementa��es:
		 * -> HashSet: Armazena os elementos em uma tabela hash. 
		 * 			   - N�o garante ordena��o
		 * 			   - N�o possui indice
		 * -> TreeSet: Armazena os elementos em uma arvore red-black
		 * 			   - Garante a ordena��o conforme o m�todo compareTo implementado na classe 
		 * -> LinkedHashSet: Armazena os elementos em uma tabela hash com uma lista ligada que itera sobre os elementos
		 * 			   - N�o garante a ordena��o
		 * 			   - Possui �ndice conforme a ordem de inser��o
		 * 
		 * A interface Set implementa apenas m�todos herdados da interface Collection.
		 * � fortemente recomendado que o Set seja declarado como tipo Collection, para flexibilizar a implementa��o
		 * 
		 * Quando comparamos dois itens de um HashSet ou LinkedHashSet para saber se s�o iguais, n�o basta reescrevermos o m�todo equals, 
		 * mas tamb�m � necess�rio reescrever o m�todo hashCode, pois essas estruturas de dados utilizam uma tabela hash para armazenar dados.
		 * Dessa forma, a compara��o � feita n�o s� apenas utilizando o equals, mas tamb�m comparando o hash code dos dados comparados. Se o 
		 * hash for igual, a compara��o retornar� true. Caso contr�rio, retornar� false.
		 * 
		 * Nota 1: Na pr�pria documenta��o do m�todo equals � informado que, quando este m�todo for sobreescrito, � geralmente necess�rio 
		 * sobreescrever tamb�m o m�todo hashCode para manter o contrato do hashCode, que diz que objetos que s�o iguais possuem o mesmo hash code.
		 * https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-
		 * 
		 * 
		 */
		
		Collection<String> alunos = new HashSet<>(); //HashSet � uma subinterface de Set
		alunos.add("Willy");
		alunos.add("Wally");
		alunos.add("Gat�o");
		alunos.add("Batatinha");
		alunos.add("Tuvico");
		alunos.add("Thel");
		alunos.add("Frederico");		
		
		Consumer<String> listaDeAlunos = (String aluno) -> System.out.println(aluno); //cria��o de um consumidor utilizando lambdas
		
		alunos.forEach(listaDeAlunos); //precisamos de um Consumer para utilizar o m�todo forEach
		
//		for (String aluno : alunos) {
//			System.out.println(aluno);
//		}
		
		Set<String> nomes = Collections.emptySet();
		nomes.add("oI");
		
	}

}
