package testesutil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteArrayListGenerics {
	
	public static void main(String[] args) {
		
		/* Utilizando a sintaxe abaixo, chamada de Generics (utiliza��o do < >), definimos
		 * o tipo de objeto que pode ser inserido no ArrayList. Dessa forma, evitamos mistura
		 * de dados. 
		 * Caso tentemos colocar outro tipo de objeto al�o do definido atrav�s do generics, 
		 * o compilador lan�ar� um erro. 
		 * Lembrando que a classe ArrayList possui um construtor que utiliza sobrecarga.
		 */
		ArrayList<String> estante1 = new ArrayList<String>(); 
		ArrayList<String> estante2 = new ArrayList<String>();
		
		String livro1 = "Admir�vel Mundo Novo";
		String livro2 = "1984";
		String livro3 = "Crime e Castigo";
		String livro4 = "Guerra e Paz";
		String livro5 = "Irm�os Karam�zov";
		String livro6 = "Enchiridion";
		String livro7 = "Farenheit 451";
		String livro8 = "N�s";
		String livro9 = "Gente Pobre";
		String livro10 = "Noites Brancas";
		String livro11 = "Em Busca do Tempo Perdido";
		String livro12 = "Sobre a Brevidade Da Vida";
		Nomes nome1 = new Nomes("Nikolai");

		
		estante1.add(livro1);
		estante1.add(livro2);
		estante1.add(livro3);
		estante1.add(livro4);
		estante1.add(livro5);
		estante1.add(livro6);
/*	    a linha abaixo n�o compila, pois foi definido no momento da instancia��o do ArrayList que o �nico tipo de
 * 		objeto que seria aceito dentro da ArrayList estante seria String e a refer�ncia nome1 aponta para um objeto
 * 		de tipo Nomes.
 */
//		estante.add(nome1); 
		estante2.add(livro7);
		estante2.add(livro8);
		estante2.add(livro9);
		estante2.add(livro10);
		estante2.add(livro11);
		estante2.add(livro12);
		
		estante1.remove(5);
		
		//a linha de c�digo abaixo cria um novo ArrayList a partir de uma outra j� existente (estante2)
		ArrayList<String> estante3 = new ArrayList<String>(estante1); 
		
		//utilizando o m�todo .addAll, pode-se adicionar um ArrayList completo j� existente dentro de outro ArrayList
		estante3.addAll(estante2);
		
//		System.out.println(estante1.get(4));
//		System.out.println(estante1);
//		System.out.println(estante2);
		System.out.println(estante3);
		
		//testes de ordena��o
		
		Comparator<String> tamanhoString = (String l1, String l2) -> l1.length() - l2.length();

		estante3.sort(tamanhoString);
		System.out.println(estante3);
		
		Comparator<String> ordemAlfabetica = (String o1, String o2) -> o1.compareTo(o2);
		
		estante3.sort(ordemAlfabetica);
		System.out.println(estante3);

		Collections.sort(estante3);
		System.out.println(estante3);

	}
}