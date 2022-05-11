package strings;

public class StringBuilders {
	
	public static void main(String[] args) {
		
		/*a classe string builder � mais male�vel para lidar com strings, uma vez que os objetos instanciados
		 * n�o s�o imut�veis. Ap�s a defini��o da string, o m�todo .toString() pode ser chamado para converter 
		 * a string de StringBuilder para String.
		 */
		StringBuilder teste = new StringBuilder ("Eawe meu amigo ");
		System.out.println(teste);
		teste.append("bichinha");
		System.out.println(teste);
		
		String testeString = teste.toString(); //converte a sequencia de caracteres de StringBuilder para String
		
		System.out.println(teste.getClass());
		System.out.println(testeString);
		System.out.println(testeString.getClass());
		
		/* a interface CharSequence conecta as classes String e StringBuilder, por isso ambas compartilham alguns
		 * m�todos:
		 * 	- charAt
		 * 	- chars
		 * 	- codePoints
		 * 	- compare
		 * 	- isEmpty
		 * 	- length
		 * 	- subSequence
		 * 	- toString
		 */
		
		
	}

}
