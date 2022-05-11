package testesutil;

public class ArraysPrimitivos {
	
	public static void main(String[] args) {
		
		/* O código abaixo cria um novo array. O tamanho de um array é definido no momento
		 * da sua inicialização (new tipoDoArray[tamanhoDoArray]. */
		
		//array de tipo primitivo
		int[] numeros = new int[10]; 
		
		for (int i = 1; i < numeros.length; i++) {
			numeros[i] = i * i;
		}
		
		for (int i : numeros) { //para cada int i no array numeros
			System.out.println(i); //imprimir i
		}
		
		/*a sintaxe nomeDoArray[index] acessa o valor alocado naquela posição do array
		*lembrando que as posições do array se iniciam sempre por 0, ou seja, 
		*o maior index do array sempre será tamanhoDoArray - 1 */
		int numero = numeros[5]; 
		System.out.println(numero);
		
		//criação de um array vazio
		int[] numeros2 = {};
		
		//criação de um array de forma literal
		int[] numeros3 = {1,2,3};
		
		//alteração de um valor dentro do array
		numeros3[2] = 4;
		
		System.out.println(numeros3[2]);

	}

}
