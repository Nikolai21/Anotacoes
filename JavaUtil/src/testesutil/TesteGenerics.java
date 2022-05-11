package testesutil;

public class TesteGenerics <T> { 
		
	public void print (T var) {
		System.out.println(var);
	}

/* Generics tamb�m podem ser utilizados em classes.
 * Para tal, definimos o generics depois do nome da classe com os caracteres '<>' e,
 * por conven��o, colocamos um 'T' entre os caracteres para definir um objeto gen�rico
 * que ser� definido na instancia��o da classe.
 * Caso necess�rio, o atributo da classe poder� ser do objeto gen�rico T, sendo escrito 
 * dessa forma: T [nomeDaVariavel]
 * M�todos tamb�m podem utilizar o objeto definido na instancia��o, conforme c�digo abaixo.
 * 
 *	 public class Printer <T> { 
 *			
 *		public void print (T var) {
 *			System.out.println(var);
 *		}
 *	
 *	}
 * 
 * O c�digo abaixo cria um printer de algum objeto espec�fico que ser� definido na instancia��o
 * da classe conforme a sintaxe abaixo:
 * 
 * Printer<[Objeto]> printerObjeto = new Printer<>();
 * 
 * A partir da instancia��o, o objeto printerObjeto s� poder� executar o m�todo print com um
 * par�metro que � uma inst�ncia do objeto definido
 */
	
	public static void main(String[] args) {
		
		TesteGenerics<Integer> printerInteiros = new TesteGenerics<>();
		TesteGenerics<String> printerStrings = new TesteGenerics<>();
		
		String stringTeste = "Ol� mundo";
		Integer numero = 21051997;
		
		printerInteiros.print(numero);
		printerStrings.print(stringTeste);
		
	}
}
