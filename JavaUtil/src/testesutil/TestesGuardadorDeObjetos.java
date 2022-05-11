package testesutil;
import java.util.ArrayList;

public class TestesGuardadorDeObjetos {
	
	public static void main (String[] args) {
		
		GuardadorDeObjetos gaveta = new GuardadorDeObjetos(7);
		GuardadorDeObjetos gavetaVazia = new GuardadorDeObjetos(0);
		
		Nomes nome1 = new Nomes("Alice");
		Nomes nome2 = new Nomes("Bob");
		Sobrenome sobrenome1 = new Sobrenome(nome1.getNome(), "Merton");
		Sobrenome sobrenome2 = new Sobrenome(nome2.getNome(), "Dylan");
		String nomeCompleto1 = sobrenome1.getNomeCompleto();
		String nomeCompleto2 = sobrenome2.getNomeCompleto();
		
		gaveta.setObjeto(gavetaVazia);
		gaveta.setObjeto(nome1);
		gaveta.setObjeto(nome2);
		gaveta.setObjeto(sobrenome1);
		gaveta.setObjeto(sobrenome2);
		gaveta.setObjeto(nomeCompleto1);
		gaveta.setObjeto(nomeCompleto2);
		
		for (int i = 0; i < gaveta.getTamanhoGuardador(); i++) {
			System.out.println(gaveta.getObjeto(i));
		}
		
	}

}
