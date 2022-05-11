package strings;

public class Strings {
	
	public static void main (String[] args) {
		
/*  Métodos mais utilizados da classe String: 
 * 
 * 	replace -> substitui um caracter ou uma sequencia de caracteres
 * 			   dentro de uma string
 *	upperCase -> retorna a string em caracteres maiusculos (caixa alta)
 *	lowerCase -> retorna a string em caracteres minusculos (caixa baixa)
 *	indexOf -> retorna um int do index dentro de uma string do caracter 
 *			   informado como parametro
 *	charAt -> retorna o caractér no index informado como parâmetro
 *	length -> retorna o tamanho da string 
 *	isEmpty -> retorna um boolean, verifica se a string está vazia
 *	isBlank -> retorna um boolean, verifica se a string está vazia ou se só contém espaços em branco
 *	contain -> retorna um boolean, verifica se uma string contém um
 *			   caracter ou uma sequencia de caracteres
 *	trim -> retira os espaços do início e do fim de uma string
 *	substring -> retorna uma string que está contida dentro de outra string maior
 *				 este método possui sobrecarga, ou seja, há duas formas de incluir os parâmetros:
 *				 substring(index anterior do inicio da substring);			
 *				 substring(index de inicio, index do final);
 *
 *	Importante notar que os métodos que retornam uma nova string não
 *	alteram a string inicial, pois string são objetos imutáveis. 
 *	Para utilizar o retorno de um método, um novo objeto String 
 *	deverá ser instanciado.
 */
		
//		String novaString = new String("Olá mundo"); -> string podem ser inicializadas dessa forma, mas é considerado má prática
		String teste = "OLARMUNDO";	//Object literal
		String teste2 = "   OlarMundo   ";
		String testeVoid = " ";
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Retorn de objeto 'String'\n");
		
		String lowerTeste = teste.toLowerCase(); //coloca todas as letras da string em caixa baixa
		System.out.println("Retorno do método toLowerCase(): " + lowerTeste);
		
		String upperTeste = lowerTeste.toUpperCase(); //coloca todas as letras da string em caixa alta
		System.out.println("Retorno do método toUpperCase(): " + upperTeste);
		
		String replaceTeste = teste.replace("LARMUNDO", "HLONGJOHNSON"); //substitui um caracter ou uma sequência de caracteres
		System.out.println("Retorno do método .replace(): " + replaceTeste);
		
		String replaceTeste2 = replaceTeste.replace('J', 'N');
		System.out.println("Retorno do método .replace(): " + replaceTeste2);
		
		System.out.println("Variável sem retirar o espaço: " + teste2);
		String testeTrim = teste2.trim();	//retira todos os espaços em branco da string
		System.out.println("Retorno do método .trim(): " + testeTrim);
		
		String substringTeste1 = replaceTeste.substring(6); 
		System.out.println("Retorno 1 do método .substring(): " + substringTeste1);
		
		String substringTeste2 = replaceTeste.substring(0,6);
		System.out.println("Retorno 2 do método .substring(): " + substringTeste2);
		
//		String splitTeste = replaceTeste.split(substringTeste2); -> precisa de uma regex para funcionar
		
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Retorn de tipo primitivo 'int'\n");
		
		int indexOfTeste = replaceTeste.indexOf("H"); //retorna o index do caracter
		System.out.println("Retorno do método .indexOf(): " + indexOfTeste);
		
		int charAtTeste = replaceTeste.charAt(indexOfTeste); //retorna o código Unicode do caracter se a variável for definida como int
		System.out.println("Retorno do método .charAt() no código Unicode: " + charAtTeste);
		
		char charAtTeste2 = replaceTeste.charAt(indexOfTeste); //retorna ocaracter se a variável for definida como char
		System.out.println("Retorno do método .charAt() como tipo 'char': " + charAtTeste2);
		
		int lengthTeste = replaceTeste.length(); //retorna a quantidade de caracteres, começa pelo 1
		System.out.println("Retorno do método .length(): " + lengthTeste);
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Retorn de tipo primitivo 'boolean'\n");
		
		boolean testeVazio = testeVoid.isEmpty(); //verifica se a string está vazia (espaços em branco contam como preenchimento)
		System.out.println("Retorno do método .isEmpty(): " + testeVazio);
		
		boolean testeVazio2 = testeVoid.isBlank(); //verifica se a string está vazia ou possui espaços em branco
		System.out.println("Retorno do método .isBlank(): " + testeVazio2);
		
		boolean testeContain = teste2.contains("JOHN"); //verifica se a string contém uma sequencia de caracteres
		System.out.println("Retorno do método .contains(): " + testeContain);
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Teste com strings e loops\n");
		
		String teste3 = "STRING";
		
		for (int i = 0; i < teste3.length(); i++) {
			char caracter = teste3.charAt(i);
			System.out.println(caracter);
		}
		
	}
}
