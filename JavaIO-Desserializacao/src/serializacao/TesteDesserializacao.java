package serializacao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDesserializacao {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Cachorro willy = null;
		String nomeStream = null;
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\nfiat\\Desktop\\programacao\\Curso_Java\\JavaIO\\nome.ser"));
		nomeStream = (String) ois.readObject();
		ois.close();
		
		System.out.println(nomeStream);
		
		FileInputStream fis2 = new FileInputStream("C:\\Users\\nfiat\\Desktop\\programacao\\Curso_Java\\JavaIO\\animal.ser");
		//no caso de desserializar um objeto de uma classe de outro projeto, a classe no projeto destino precisa estar em um 
		//package que contém exatamente o mesmo nome do package que a classe origem está contida, caso contrário será lançado 
		//um ClassNotFoundException
		ObjectInputStream ois2 = new ObjectInputStream(fis2);
		willy = (Cachorro) ois2.readObject();
		ois2.close();
		
		System.out.println(willy.getNome());
		willy.latir();
		
	}

}
