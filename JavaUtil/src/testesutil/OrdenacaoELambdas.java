package testesutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenacaoELambdas {
	
	public static void main(String[] args) {
		
		Integer n1 = 12;
		Integer n2 = 67;
		Integer n3 = 26;
		Integer n4 = 2;
		Integer n5 = 1;
		Integer n6 = 15;
		Integer n7 = 98;
		Integer n8 = 54;
		Integer n9 = 34;
		Integer n10 = 9;
		Integer n11 = 4;
		Integer n12 = 3;
		Integer n13 = 69;
		
		ArrayList<Integer> listaDeNumeros = new ArrayList<>();
		
		listaDeNumeros.add(n1);
		listaDeNumeros.add(n2);
		listaDeNumeros.add(n3);
		listaDeNumeros.add(n4);
		listaDeNumeros.add(n5);
		listaDeNumeros.add(n6);
		listaDeNumeros.add(n7);
		listaDeNumeros.add(n8);
		listaDeNumeros.add(n9);
		listaDeNumeros.add(n10);
		listaDeNumeros.add(n11);
		listaDeNumeros.add(n12);
		listaDeNumeros.add(n13);
		
		System.out.println(listaDeNumeros);
				
		/* 
		 * O método sort é um método sobreescrito da classe ArrayList e é utilizado para realizar a ordenação da lista. 
		 * Porém, ele necessita de um parâmetro que implemente a interface Comparator. Este parâmetro é uma 
		 * classe que faz a implementação dessa interface e sobreescreve o método compare da interface. Nesse 
		 * método é que será definido a regra da ordenação da lista. 
		 * Não é necessário criar uma nova referência para a classe, mas apenas instanciá-la como parâmetro 
		 * do método sort.
		 * Também, em casos nos quais a classe criada será utilizada apenas uma vez, podemos criar uma referência
		 * do tipo da interface e criar uma nova classe, declarando o tipo, construtor e o método. Essa forma é chamada de 
		 * classe anônima, uma vez que é criada uma classe, mas não é necessário declara-la formalmente.
		 * 
		 *		Comparator<Integer> comparador = new Comparator<Integer>() {
		 *
		 *   		@Override
		 *			public int compare(Integer n1, Integer n2) {
		 *				return Integer.compare(n1, n2);
		 *			}
		 *		
		 *		};
		 *
		 * Podemos também declarar a classe anônima diretamente como parâmetro da função.
		 * 	 	
		 *		listaDeNumeros.sort(new Comparator<Integer>() {
		 *
		 *			@Override
		 *			public int compare(Integer n1, Integer n2) {
		 *				return Integer.compare(n1, n2);
		 *				}
		 *			}
		 *		);
		 *
		 * Quando utilizamos classes anônimas, podemos implementá-las também utilizando expressões lambda. Porém, 
		 * é importante notar que expressões lambdas não contém estado, ou seja, caso seja necessário armazenar 
		 * alguma informação resultante da operação, a melhor solução é a implementação de uma classe anônima
		 * (Mais sobre expresões lambda abaixo).
		 * 
		 * *A interface Comparator utiliza os generics para que seja definido qual tipo de objeto que será utilizado
		 * na sua implementação.
		 */
		
		Comparator<Integer> comparadorReverso = new Comparator<Integer>() {

			@Override
			public int compare(Integer n1, Integer n2) {
				return Integer.compare(n2, n1);
			}
		};
		
		listaDeNumeros.sort((Integer numero1, Integer numero2) -> Integer.compare(numero1, numero2));
		
		/*
		 * Expressões lambdas são atalhos para implementar interfaces funcionais** de forma mais clara e sucinta:
		 * 
		 * (Integer numero1, Integer numero2) -> Integer.compare(numero1, numero2)*
		 * * Implementação do método abstrato compare da interface Comparator
		 * 
		 * Em comparação com a classe anônima, nota-se que a expressão lambda: 
		 *  - Não precisa instanciar um novo objeto;
		 *  - Não precisa definir o método de forma explícita;
		 *  - Caso possua apenas uma linha, não necessita da expressão "return", 
		 *  pois o compilador entende que o retorno da expressão lambda já é o que
		 *  está sendo informado após a seta.
		 * 
		 * Uma expressão lambda também pode ser utilizada com um objeto:
		 * 
		 * Comparator comparador = (Integer numero1, Integer numero2) -> Integer.compare(numero1, numero2);
		 * 
		 * Nesse caso, se invocarmos o objeto comparador, a função lambda será chamada.
		 * 
		 * Para implementarmos uma função lambda com uma interface devemos nos perguntar:
		 *  - A interface possui apenas um método abstrato?
		 *  - Os parâmetros da expressão lambda são os mesmos do método sendo implementado?
		 *  - O tipo de retorno da expressão lambda é o mesmo do método sendo implementado?
		 *  Se sim, então a expressão lambda está sendo implementada corretamente.
		 * 
		 * *Nota-se que funções lambda não possuem estado.
		 * **Interfaces funcionais são interfaces que possuem apenas um método abstrato para ser implementado. Uma
		 * interface funcional pode possuir outros métodos implementados, mas apenas um método abstrato.
		 */
		
		System.out.println(listaDeNumeros);
		
		/* A classe Collections é uma classe de métodos estáticos utilitários que podem ser utilizados. É uma 
		 * subclasse da superclasse Object: https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html
		 */
		
		//O método shuffle embaralha a lista. 
		Collections.shuffle(listaDeNumeros);
		System.out.println(listaDeNumeros);
		
		//O método reverse inverte a ordem da lista
		Collections.reverse(listaDeNumeros);
		System.out.println(listaDeNumeros);
		
		/* O método sort da classe collections utiliza a regra de ordem natural para fazer a ordenação da lista.
		 * Por exemplo, para listas de ints, a ordem natural é a ordem de valor. Para strings, a ordem alfabética.
		 * 
		 * Em casos de referências de instâncias de classes armazenadas em listas, para utilizar o método estático 
		 * sort da classe collections, é necessário implementar a interface Comparable e sobreescrever o método
		 * compareTo. Dessa forma, podemos definir qual será a regra de ordem natural para a classe e, quando o
		 * método sort for chamado para ordenar conforme a ordenação natural, o método compareTo sobreescrito na
		 * classe será chamado. 
		 */
		Collections.sort(listaDeNumeros);
		System.out.println(listaDeNumeros);
		
	}
	
}

/* Criação da classe que implementa a inferface comparator */
class IntegerComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer n1, Integer n2) {
		return n2 - n1;
	}
	
}
