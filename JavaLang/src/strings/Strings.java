package strings;

public class Strings {
	
	public static void main (String[] args) {
		
/*  M�todos mais utilizados da classe String: 
 * 
 * 	replace -> substitui um caracter ou uma sequencia de caracteres
 * 			   dentro de uma string
 *	upperCase -> retorna a string em caracteres maiusculos (caixa alta)
 *	lowerCase -> retorna a string em caracteres minusculos (caixa baixa)
 *	indexOf -> retorna um int do index dentro de uma string do caracter 
 *			   informado como parametro
 *	charAt -> retorna o caract�r no index informado como par�metro
 *	length -> retorna o tamanho da string 
 *	isEmpty -> retorna um boolean, verifica se a string est� vazia
 *	isBlank -> retorna um boolean, verifica se a string est� vazia ou se s� cont�m espa�os em branco
 *	contain -> retorna um boolean, verifica se uma string cont�m um
 *			   caracter ou uma sequencia de caracteres
 *	trim -> retira os espa�os do in�cio e do fim de uma string
 *	substring -> retorna uma string que est� contida dentro de outra string maior
 *				 este m�todo possui sobrecarga, ou seja, h� duas formas de incluir os par�metros:
 *				 substring(index anterior do inicio da substring);			
 *				 substring(index de inicio, index do final);
 *
 *	Importante notar que os m�todos que retornam uma nova string n�o
 *	alteram a string inicial, pois string s�o objetos imut�veis. 
 *	Para utilizar o retorno de um m�todo, um novo objeto String 
 *	dever� ser instanciado.
 */
		
//		String novaString = new String("Ol� mundo"); -> string podem ser inicializadas dessa forma, mas � considerado m� pr�tica
		String teste = "OLARMUNDO";	//Object literal
		String teste2 = "   OlarMundo   ";
		String testeVoid = " ";
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Retorn de objeto 'String'\n");
		
		String lowerTeste = teste.toLowerCase(); //coloca todas as letras da string em caixa baixa
		System.out.println("Retorno do m�todo toLowerCase(): " + lowerTeste);
		
		String upperTeste = lowerTeste.toUpperCase(); //coloca todas as letras da string em caixa alta
		System.out.println("Retorno do m�todo toUpperCase(): " + upperTeste);
		
		String replaceTeste = teste.replace("LARMUNDO", "HLONGJOHNSON"); //substitui um caracter ou uma sequ�ncia de caracteres
		System.out.println("Retorno do m�todo .replace(): " + replaceTeste);
		
		String replaceTeste2 = replaceTeste.replace('J', 'N');
		System.out.println("Retorno do m�todo .replace(): " + replaceTeste2);
		
		System.out.println("Vari�vel sem retirar o espa�o: " + teste2);
		String testeTrim = teste2.trim();	//retira todos os espa�os em branco da string
		System.out.println("Retorno do m�todo .trim(): " + testeTrim);
		
		String substringTeste1 = replaceTeste.substring(6); 
		System.out.println("Retorno 1 do m�todo .substring(): " + substringTeste1);
		
		String substringTeste2 = replaceTeste.substring(0,6);
		System.out.println("Retorno 2 do m�todo .substring(): " + substringTeste2);
		
//		String splitTeste = replaceTeste.split(substringTeste2); -> precisa de uma regex para funcionar
		
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Retorn de tipo primitivo 'int'\n");
		
		int indexOfTeste = replaceTeste.indexOf("H"); //retorna o index do caracter
		System.out.println("Retorno do m�todo .indexOf(): " + indexOfTeste);
		
		int charAtTeste = replaceTeste.charAt(indexOfTeste); //retorna o c�digo Unicode do caracter se a vari�vel for definida como int
		System.out.println("Retorno do m�todo .charAt() no c�digo Unicode: " + charAtTeste);
		
		char charAtTeste2 = replaceTeste.charAt(indexOfTeste); //retorna ocaracter se a vari�vel for definida como char
		System.out.println("Retorno do m�todo .charAt() como tipo 'char': " + charAtTeste2);
		
		int lengthTeste = replaceTeste.length(); //retorna a quantidade de caracteres, come�a pelo 1
		System.out.println("Retorno do m�todo .length(): " + lengthTeste);
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Retorn de tipo primitivo 'boolean'\n");
		
		boolean testeVazio = testeVoid.isEmpty(); //verifica se a string est� vazia (espa�os em branco contam como preenchimento)
		System.out.println("Retorno do m�todo .isEmpty(): " + testeVazio);
		
		boolean testeVazio2 = testeVoid.isBlank(); //verifica se a string est� vazia ou possui espa�os em branco
		System.out.println("Retorno do m�todo .isBlank(): " + testeVazio2);
		
		boolean testeContain = teste2.contains("JOHN"); //verifica se a string cont�m uma sequencia de caracteres
		System.out.println("Retorno do m�todo .contains(): " + testeContain);
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Teste com strings e loops\n");
		
		String teste3 = "STRING";
		
		for (int i = 0; i < teste3.length(); i++) {
			char caracter = teste3.charAt(i);
			System.out.println(caracter);
		}
		
	}
}
