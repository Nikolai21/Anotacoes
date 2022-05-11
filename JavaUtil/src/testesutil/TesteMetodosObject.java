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
		
		/*o m�todo contains utiliza o m�todo equals internamente
		* por�m, como o m�todo equals foi reescrito na classe Nomes
		* e como as refer�ncias s�o desta classe, ent�o contains 
		* utiliza o m�todo sobreescritos
		*/
		boolean eIgual1 = listaDeNomes.contains(nome4);	
		boolean eIgual2 = listaDeNomes.contains(nome5);	
		
		System.out.println("O nome " + nome4.toString() + " j� est� na lista? " + eIgual1);
		System.out.println("O nome " + nome5.toString() + " j� est� na lista? " + eIgual2);

		
		
	}

}
