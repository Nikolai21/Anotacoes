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
	 * 	As classes wrappers transformam um tipo primitivo em uma referência para que possam ser utilizados
	 * 	em conjunto com outras funcionalidades orientadas a objeto. Uma classe wrapper faz um autoboxing com
	 * 	o tipo primitivo passado, ou seja, transforma de primitivo para objeto. Quando precisamos, podemos 
	 * 	realizar o unboxing, ou seja, "transformar" o objeto em tipo primitivo novamente. 
	 * 
	 * 	Os wrappers possuem diversas funcionalidades, sendo uma delas transformar argumentos passados no método main
	 * 	nos tipos primitivos necessários. Essa funcionalidade chama-se parsing (do inglês parse, analisar). 
	 * 	
	 */
	
	public static void main(String[] args) {
		
		/*
		 * arraylist que contém todos os objetos instanciados
		 * se tentarmos incluir um tipo primitivo, o construtor do arraylist 
		 * realizará o autoboxing do dado informado e o transformará em uma 
		 * instância do wrapper correspondente ao tipo passado como argumento
		 */
		ArrayList<Object> listaDeWrappers = new ArrayList<>(); 
		
		Integer i = Integer.valueOf(25); //autoboxing
		int numero = i.intValue(); //unboxing, numero é um primitivo
		listaDeWrappers.add(i);	
		
		Double d = Double.valueOf(25.00); //autoboxing
		double numero2 = d.doubleValue(); //unboxing, numero2 é um primitivo
		listaDeWrappers.add(d);
		
		Float f = Float.valueOf(20); //autoboxing
		float numero3 = f.floatValue(); //unboxing, numero3 é um primitivo
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
		
		//o único wrapper que não possui a capacidade de parsing é Character
		
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
