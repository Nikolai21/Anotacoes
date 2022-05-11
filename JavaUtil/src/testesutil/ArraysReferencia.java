package testesutil;

public class ArraysReferencia {
	
	public static void main(String[] args) {
		
//		array de referências
		
		Nomes nome1 = new Nomes("Nikolai");
		Nomes nome2 = new Nomes("Priscila");
		Nomes nome3 = new Nomes("Willy");
		
//		cria um arrays de referências para a classe ClasseTeste
		Nomes[] arrayNomes = new Nomes[6]; 
		
//		popula cada locus do array com uma referência criada
		arrayNomes[0] = nome1; 
		arrayNomes[1] = nome2;
		arrayNomes[2] = nome3;
				
//		imprime todas as referências do array
//		como apenas as primeiras 3 foram inicializadas, todas as outras possuem
//		o valor padrão null
//		for (Nomes i : arrayNomes) {
//			System.out.println(i.getNome());
//		}
		
//		podemos acessar os métodos de uma classe através de sua referência no array	
		System.out.println(arrayNomes[2].getNome());
		
		Sobrenome sobrenome1 = new Sobrenome(nome1.getNome(), "Fiathoski");
		Sobrenome sobrenome2 = new Sobrenome(nome2.getNome(), "Bernardo Bresciani");
		Sobrenome sobrenome3 = new Sobrenome(nome3.getNome(), "Wonka Fiathoski");
		
		arrayNomes[3] = sobrenome1;
		arrayNomes[4] = sobrenome2;
		arrayNomes[5] = sobrenome3;
		
/*		o array 'arrayNomes' foi criado como tipo 'Nomes', ou seja, todas as referências do
 * 		array são do tipo 'Nomes' e necessariamente precisam ser dessa classe ou herdar essa clase.
 * 		Para que eu possa criar uma nova referência para um objeto do tipo 'Sobrenome' (que herda a 
 * 		classe 'Nome') que esteja dentro do array, tenho que fazer um Cast, ou seja, preciso forçar o
 * 		compilador a converter aquela referência do tipo 'Nome' para o tipo 'Sobrenome', pois de acordo
 * 		com a hierarquia, a classe 'Sobrenome' é uma subclasse de 'Nome'. 
 * 		Para fazer o cast, precisamos colocar o tipo da referência entre a inicialização e a declaração, 
 * 		entre parenteses, conforme abaixo:
 */
		Sobrenome testeCast1 = (Sobrenome) arrayNomes[3];
		Sobrenome testeCast2 = (Sobrenome) arrayNomes[4];
		Sobrenome testeCast3 = (Sobrenome) arrayNomes[5];
		
		System.out.println(testeCast3.getNomeCompleto());
		
		Object[] arrayReferencias = {nome1, nome2, nome3, testeCast1, testeCast2, testeCast3};
		
		for (Object i : arrayReferencias) {
			System.out.print(i.getClass() + " ");
		}
	
	}
	
}
