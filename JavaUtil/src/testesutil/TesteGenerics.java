package testesutil;

public class TesteGenerics <T> { 
		
	public void print (T var) {
		System.out.println(var);
	}

/* Generics também podem ser utilizados em classes.
 * Para tal, definimos o generics depois do nome da classe com os caracteres '<>' e,
 * por convenção, colocamos um 'T' entre os caracteres para definir um objeto genérico
 * que será definido na instanciação da classe.
 * Caso necessário, o atributo da classe poderá ser do objeto genérico T, sendo escrito 
 * dessa forma: T [nomeDaVariavel]
 * Métodos também podem utilizar o objeto definido na instanciação, conforme código abaixo.
 * 
 *	 public class Printer <T> { 
 *			
 *		public void print (T var) {
 *			System.out.println(var);
 *		}
 *	
 *	}
 * 
 * O código abaixo cria um printer de algum objeto específico que será definido na instanciação
 * da classe conforme a sintaxe abaixo:
 * 
 * Printer<[Objeto]> printerObjeto = new Printer<>();
 * 
 * A partir da instanciação, o objeto printerObjeto só poderá executar o método print com um
 * parâmetro que é uma instância do objeto definido
 */
	
	public static void main(String[] args) {
		
		TesteGenerics<Integer> printerInteiros = new TesteGenerics<>();
		TesteGenerics<String> printerStrings = new TesteGenerics<>();
		
		String stringTeste = "Olá mundo";
		Integer numero = 21051997;
		
		printerInteiros.print(numero);
		printerStrings.print(stringTeste);
		
	}
}
