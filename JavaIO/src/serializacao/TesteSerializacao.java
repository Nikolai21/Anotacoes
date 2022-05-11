package serializacao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
	
	/* Serialização é o processo de conversão de um objeto em um 
	 * fluxo de bytes. Dessa forma, a serialização permite que o 
	 * objeto persista (salva o estado do objeto no momento da se
	 * rialização em um arquivo bin ou ser). 
	 * 
	 * 1 - Subclasses de superclasses que implementam a interface Serializable
	 * 	   implementam a interface por herança
	 * 
	 * 2 - Campos estáticos não são serializáveis
	 * 
	 * 3 - Campos declarados como "transient" são ignorados no processo de 
	 * 	   serialização
	 * 
	 * 4 - serialVersionUID é um identificador unúco para uma classe que implementa
	 * 	   a interface Serializable. Verifica se o sender e o receiver de um projeto
	 * 	   serializavel estão trabalhando com objetos que são compatíveis (que possuem
	 * 	   o mesmo ID), caso contrário será lançada uma InvalidClassException.
	 * 	   O SerialVersionUID é calculado com base nas propriedades, membros, etc, de uma
	 * 	   classe. Uma classe serializavel pode declarar o ID de forma explícita, o que é
	 * 	   recomendado.
	 * 
	 */

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String nome = "Nikolai";
		
		//Serialização -> Transformação de um objeto em um fluxo de bits
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("nome.ser"));
		oos.writeObject(nome);
		oos.close();
		
		//Desserialização -> Transformação de um fluxo de bits em um objeto

		Cachorro willy = new Cachorro("Willy", 16);
		
		ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("animal.ser"));
		oos2.writeObject(willy); //-> A serialização não funciona a não ser que a classe implemente a interface Serializable
		oos2.close();
		

		
		
	}

}
