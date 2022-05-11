package testesutil;
import java.util.ArrayList;

public class Wrappers {
	
	/*
	 * Autoboxing: tipo primitivo -------> Wrapper
	 * Unboxing: Wrapper -------> tipo primitivo
	 * 
	 * (Tamanho) Primitivo		     Wrappers
	 * 4 bytes     int     ------->	  Integer		|
	 * 8 bytes    double   ------->    Double		|
	 * 4 bytes    float    ------->    Float		|-----------> Subclasse da classe Number  	 |
	 * 1 byte     byte     ------->    Byte			|									     	 |
	 * 2 bytes    short    ------->    Short		|									     	 |
	 * 8 bytes     long     ------->    Long		|									     	 |-----> Subclasses da superclasse Objects
	 * 2 bytes     char     ------->    Character		|-----------> Classe Character		     |
	 *            boolean   ------->   Boolean			|-----------> Classe Boolean		     |
	 * 
	 * 	As classes wrappers transformam um tipo primitivo em uma refer�ncia para que possam ser utilizados
	 * 	em conjunto com outras funcionalidades orientadas a objeto. Uma classe wrapper faz um autoboxing com
	 * 	o tipo primitivo passado, ou seja, transforma de primitivo para objeto. Quando precisamos, podemos 
	 * 	realizar o unboxing, ou seja, "transformar" o objeto em tipo primitivo novamente. 
	 * 
	 * 	Os wrappers possuem diversas funcionalidades, sendo uma delas transformar argumentos passados no m�todo main
	 * 	nos tipos primitivos necess�rios. Essa funcionalidade chama-se parsing (do ingl�s parse, analisar). 
	 * 	
	 */
	
	public static void main(String[] args) {
		
		/*
		 * arraylist que cont�m todos os objetos instanciados
		 * se tentarmos incluir um tipo primitivo, o construtor do arraylist 
		 * realizar� o autoboxing do dado informado e o transformar� em uma 
		 * inst�ncia do wrapper correspondente ao tipo passado como argumento
		 */
		ArrayList<Object> listaDeWrappers = new ArrayList<>(); 
		
		Integer i = Integer.valueOf(25); //autoboxing
		int numero = i.intValue(); //unboxing, numero � um primitivo
		listaDeWrappers.add(i);	
		
		Double d = Double.valueOf(25.00); //autoboxing
		double numero2 = d.doubleValue(); //unboxing, numero2 � um primitivo
		listaDeWrappers.add(d);
		
		Float f = Float.valueOf(20); //autoboxing
		float numero3 = f.floatValue(); //unboxing, numero3 � um primitivo
		listaDeWrappers.add(f);
		
		Byte by = Byte.valueOf((byte) 2); //autoboxing
		byte numero4 = by.byteValue(); //unboxing
		listaDeWrappers.add(by);
		
		Short s = Short.valueOf((short) 25); //autoboxing
		short numero5 = s.shortValue(); //unboxing
		listaDeWrappers.add(s);
		
		Long l = Long.valueOf(20000l); //autoboxing
		long numero6 = l.longValue(); //unboxing
		listaDeWrappers.add(l);
		
		Character c = Character.valueOf('c'); //autoboxing
		char caracter = c.charValue(); //unboxing
		listaDeWrappers.add(c);
 
		Boolean b = Boolean.TRUE; //autoboxing (booleanos possuem duas constantes: TRUE e FALSE)
		boolean booleano = b.booleanValue(); //unboxing
		listaDeWrappers.add(b);
		
		System.out.println(listaDeWrappers);
		
		//o �nico wrapper que n�o possui a capacidade de parsing � Character
		
		Integer numero7 = Integer.parseInt(args[0]);
		Double numero8 = Double.parseDouble(args[1]);
		Float numero9 = Float.parseFloat(args[2]);
		Long numero10 = Long.parseLong(args[3]);
		Short numero11 = Short.parseShort(args[4]);
		Byte numero12 = Byte.parseByte(args[5]);
		Boolean booleano2 = Boolean.parseBoolean(args[6]);
		
		System.out.println(numero7);
		System.out.println(numero8);	
		System.out.println(numero9);
		System.out.println(numero10);
		System.out.println(numero11);
		System.out.println(numero12);
		System.out.println(booleano2);
		
	}
	
	
	
}
