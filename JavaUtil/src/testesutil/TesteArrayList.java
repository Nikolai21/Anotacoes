package testesutil;
import java.util.ArrayList;

public class TesteArrayList {
	
	public static void main(String[] args) {
		
		GuardadorDeObjetos gavetaVazia = new GuardadorDeObjetos(0);
		/*Forma de instanciar uma nova ArrayList
		 * ArrayLists tem tamanho ilimitado, dependendo apenas da memória disponível na JVMs.
		 * ArrayList cria um array e vai manipulando o array inicial para realizar as alterações
		 * requisitadas pelos métodos disponíveis
		 */
		ArrayList gaveta = new ArrayList(); 
		
		Nomes nome1 = new Nomes("Alice");
		Nomes nome2 = new Nomes("Bob");
		Sobrenome sobrenome1 = new Sobrenome(nome1.getNome(), "Merton");
		Sobrenome sobrenome2 = new Sobrenome(nome2.getNome(), "Dylan");
		String nomeCompleto1 = sobrenome1.getNomeCompleto();
		String nomeCompleto2 = sobrenome2.getNomeCompleto();
		
		Object[] gavetinha = {nome1, nome2, sobrenome1, sobrenome2, nomeCompleto1, nomeCompleto2, gavetaVazia};

		for(Object i : gavetinha) { //enhanced for -> para trabalhar com Arrays, ArrayLists, etc
			gaveta.add(i); //o método .add adiciona um elemento Object na lista
		}
		
		for(Object i : gaveta) {
			System.out.println(i);
			System.out.println("--------------------");
		}
		
		Object nomeDaGaveta = gaveta.get(2); //O método .get retorna o elemento requisitado do ArrayList
		
		System.out.println(nomeDaGaveta);
		
		gaveta.remove(0); //O método .remove remove o elemento requisitado do ArrayList
		
		int tamanho = gaveta.size(); //O método .size retorna o tamanho atual da lista
		
		System.out.println(gaveta);
		System.out.println(tamanho);
		
	}

}
