package testeIO;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class TesteUnicodeEncodingCharset {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		System.out.println("Digite uma letra:");
		Scanner string = new Scanner(System.in);
		String s = string.next() ;
		
		
		
		/* Codepoint é o código correspondente do caractere na tabela de encoding Unicode
		 * Encoding é uma tabela que possui uma correspondência pré definida entre caracteres
		 * e sequência de bytes. Cada caracter possui um codepoint que corresponde à posição 
		 * na tabela de encoding. O encoding faz a conversão do caractere em um stream de bits.
		 * Caso o encoding não suporte o caractere, será apresentado algum caractere que corresponde
		 * a um caratere desconhecido para aquela tabela.
		 */
		System.out.println("Codepoint(Unicode): " + s.codePointAt(0));
		
		//A classe Charset define métodos para trabalhar com diferentes tipos de encodings
		Charset charset = Charset.defaultCharset(); //o método defaultCharset retorna o encoding padrão da JVM utilizada
		System.out.println("Encoding: " + charset.displayName()); //o método displayName retorna o nome do encoding utilizado
		
		System.out.println("----------------------------------------");
		
		//faz o encoding da string em um fluxo de bytes conforme a tabela de encoding definida no argumento
		byte[] bytes = s.getBytes("windows-1252"); 
		System.out.println("Tamanho em bytes - Encoding: " + bytes.length + " - windows-1252");
		//transforma o fluxo de bytes em string novamente
		String sWindows = new String(bytes); 
		System.out.println("Caracter " + s + " no encoding windows-1252: " + sWindows);
		
		System.out.println("----------------------------------------");
		
		byte[] bytes2 = s.getBytes("UTF-16");
		System.out.println("Tamanho em bytes - Encoding: " + bytes2.length + " - UTF-16");
		String sUTF16 = new String(bytes2);
		System.out.println("Caracter " + s + " no encoding UTF-16: " + sUTF16);
		
		System.out.println("----------------------------------------");

		byte[] bytes3 = s.getBytes("ASCII");
		System.out.println("Tamanho em bytes - Encoding: " + bytes3.length + " - ASCII");
		String sASCII = new String(bytes3);
		System.out.println("Caracter " + s + " no encoding ASCII: " + sASCII);
		
	}

}
