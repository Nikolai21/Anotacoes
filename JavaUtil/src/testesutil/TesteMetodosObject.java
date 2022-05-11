package testesutil;
import java.util.ArrayList;

public class TesteMetodosObject {
	
	public static void main(String[] args) {
		
		Nomes nome1 = new Nomes("Alice");
		Nomes nome2 = new Nomes("Bob");
		Nomes nome3 = new Nomes("Johnson");
		Nomes nome4 = new Nomes("Johnson");
		Nomes nome5 = new Nomes("Nikolai");
		
		ArrayList<Nomes> listaDeNomes = new ArrayList<>();
		
		listaDeNomes.add(nome1);
		listaDeNomes.add(nome2);
		listaDeNomes.add(nome3);
		
		/*o método contains utiliza o método equals internamente
		* porém, como o método equals foi reescrito na classe Nomes
		* e como as referências são desta classe, então contains 
		* utiliza o método sobreescritos
		*/
		boolean eIgual1 = listaDeNomes.contains(nome4);	
		boolean eIgual2 = listaDeNomes.contains(nome5);	
		
		System.out.println("O nome " + nome4.toString() + " já está na lista? " + eIgual1);
		System.out.println("O nome " + nome5.toString() + " já está na lista? " + eIgual2);

		
		
	}

}
