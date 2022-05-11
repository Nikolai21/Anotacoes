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
		 * O m�todo sort � um m�todo sobreescrito da classe ArrayList e � utilizado para realizar a ordena��o da lista. 
		 * Por�m, ele necessita de um par�metro que implemente a interface Comparator. Este par�metro � uma 
		 * classe que faz a implementa��o dessa interface e sobreescreve o m�todo compare da interface. Nesse 
		 * m�todo � que ser� definido a regra da ordena��o da lista. 
		 * N�o � necess�rio criar uma nova refer�ncia para a classe, mas apenas instanci�-la como par�metro 
		 * do m�todo sort.
		 * Tamb�m, em casos nos quais a classe criada ser� utilizada apenas uma vez, podemos criar uma refer�ncia
		 * do tipo da interface e criar uma nova classe, declarando o tipo, construtor e o m�todo. Essa forma � chamada de 
		 * classe an�nima, uma vez que � criada uma classe, mas n�o � necess�rio declara-la formalmente.
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
		 * Podemos tamb�m declarar a classe an�nima diretamente como par�metro da fun��o.
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
		 * Quando utilizamos classes an�nimas, podemos implement�-las tamb�m utilizando express�es lambda. Por�m, 
		 * � importante notar que express�es lambdas n�o cont�m estado, ou seja, caso seja necess�rio armazenar 
		 * alguma informa��o resultante da opera��o, a melhor solu��o � a implementa��o de uma classe an�nima
		 * (Mais sobre expres�es lambda abaixo).
		 * 
		 * *A interface Comparator utiliza os generics para que seja definido qual tipo de objeto que ser� utilizado
		 * na sua implementa��o.
		 */
		
		Comparator<Integer> comparadorReverso = new Comparator<Integer>() {

			@Override
			public int compare(Integer n1, Integer n2) {
				return Integer.compare(n2, n1);
			}
		};
		
		listaDeNumeros.sort((Integer numero1, Integer numero2) -> Integer.compare(numero1, numero2));
		
		/*
		 * Express�es lambdas s�o atalhos para implementar interfaces funcionais** de forma mais clara e sucinta:
		 * 
		 * (Integer numero1, Integer numero2) -> Integer.compare(numero1, numero2)*
		 * * Implementa��o do m�todo abstrato compare da interface Comparator
		 * 
		 * Em compara��o com a classe an�nima, nota-se que a express�o lambda: 
		 *  - N�o precisa instanciar um novo objeto;
		 *  - N�o precisa definir o m�todo de forma expl�cita;
		 *  - Caso possua apenas uma linha, n�o necessita da express�o "return", 
		 *  pois o compilador entende que o retorno da express�o lambda j� � o que
		 *  est� sendo informado ap�s a seta.
		 * 
		 * Uma express�o lambda tamb�m pode ser utilizada com um objeto:
		 * 
		 * Comparator comparador = (Integer numero1, Integer numero2) -> Integer.compare(numero1, numero2);
		 * 
		 * Nesse caso, se invocarmos o objeto comparador, a fun��o lambda ser� chamada.
		 * 
		 * Para implementarmos uma fun��o lambda com uma interface devemos nos perguntar:
		 *  - A interface possui apenas um m�todo abstrato?
		 *  - Os par�metros da express�o lambda s�o os mesmos do m�todo sendo implementado?
		 *  - O tipo de retorno da express�o lambda � o mesmo do m�todo sendo implementado?
		 *  Se sim, ent�o a express�o lambda est� sendo implementada corretamente.
		 * 
		 * *Nota-se que fun��es lambda n�o possuem estado.
		 * **Interfaces funcionais s�o interfaces que possuem apenas um m�todo abstrato para ser implementado. Uma
		 * interface funcional pode possuir outros m�todos implementados, mas apenas um m�todo abstrato.
		 */
		
		System.out.println(listaDeNumeros);
		
		/* A classe Collections � uma classe de m�todos est�ticos utilit�rios que podem ser utilizados. � uma 
		 * subclasse da superclasse Object: https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html
		 */
		
		//O m�todo shuffle embaralha a lista. 
		Collections.shuffle(listaDeNumeros);
		System.out.println(listaDeNumeros);
		
		//O m�todo reverse inverte a ordem da lista
		Collections.reverse(listaDeNumeros);
		System.out.println(listaDeNumeros);
		
		/* O m�todo sort da classe collections utiliza a regra de ordem natural para fazer a ordena��o da lista.
		 * Por exemplo, para listas de ints, a ordem natural � a ordem de valor. Para strings, a ordem alfab�tica.
		 * 
		 * Em casos de refer�ncias de inst�ncias de classes armazenadas em listas, para utilizar o m�todo est�tico 
		 * sort da classe collections, � necess�rio implementar a interface Comparable e sobreescrever o m�todo
		 * compareTo. Dessa forma, podemos definir qual ser� a regra de ordem natural para a classe e, quando o
		 * m�todo sort for chamado para ordenar conforme a ordena��o natural, o m�todo compareTo sobreescrito na
		 * classe ser� chamado. 
		 */
		Collections.sort(listaDeNumeros);
		System.out.println(listaDeNumeros);
		
	}
	
}

/* Cria��o da classe que implementa a inferface comparator */
class IntegerComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer n1, Integer n2) {
		return n2 - n1;
	}
	
}
