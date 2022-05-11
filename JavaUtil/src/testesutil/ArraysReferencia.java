package testesutil;

public class ArraysReferencia {
	
	public static void main(String[] args) {
		
//		array de refer�ncias
		
		Nomes nome1 = new Nomes("Nikolai");
		Nomes nome2 = new Nomes("Priscila");
		Nomes nome3 = new Nomes("Willy");
		
//		cria um arrays de refer�ncias para a classe ClasseTeste
		Nomes[] arrayNomes = new Nomes[6]; 
		
//		popula cada locus do array com uma refer�ncia criada
		arrayNomes[0] = nome1; 
		arrayNomes[1] = nome2;
		arrayNomes[2] = nome3;
				
//		imprime todas as refer�ncias do array
//		como apenas as primeiras 3 foram inicializadas, todas as outras possuem
//		o valor padr�o null
//		for (Nomes i : arrayNomes) {
//			System.out.println(i.getNome());
//		}
		
//		podemos acessar os m�todos de uma classe atrav�s de sua refer�ncia no array	
		System.out.println(arrayNomes[2].getNome());
		
		Sobrenome sobrenome1 = new Sobrenome(nome1.getNome(), "Fiathoski");
		Sobrenome sobrenome2 = new Sobrenome(nome2.getNome(), "Bernardo Bresciani");
		Sobrenome sobrenome3 = new Sobrenome(nome3.getNome(), "Wonka Fiathoski");
		
		arrayNomes[3] = sobrenome1;
		arrayNomes[4] = sobrenome2;
		arrayNomes[5] = sobrenome3;
		
/*		o array 'arrayNomes' foi criado como tipo 'Nomes', ou seja, todas as refer�ncias do
 * 		array s�o do tipo 'Nomes' e necessariamente precisam ser dessa classe ou herdar essa clase.
 * 		Para que eu possa criar uma nova refer�ncia para um objeto do tipo 'Sobrenome' (que herda a 
 * 		classe 'Nome') que esteja dentro do array, tenho que fazer um Cast, ou seja, preciso for�ar o
 * 		compilador a converter aquela refer�ncia do tipo 'Nome' para o tipo 'Sobrenome', pois de acordo
 * 		com a hierarquia, a classe 'Sobrenome' � uma subclasse de 'Nome'. 
 * 		Para fazer o cast, precisamos colocar o tipo da refer�ncia entre a inicializa��o e a declara��o, 
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
