package testeIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeituraDeArquivos {
	
	/* � de suma import�ncia que a declara��o 'throws IOException' seja adicionada, uma vez
	 * que todas as exce��es do pacote java.io s�o do tipo checked 
	 */
	
	public static void main(String[] args) throws IOException {
		
		/* O construtor da classe FileInputStream l� a sequ�ncia de bytes do arquivo informado como argumento
		 * 
		 * A classe FileInputStream � uma subclasse de InputStream. Com essa classe abstrata, pode-se tomar 
		 * inputs n�o apenas de arquivos, mas do console ou da internet (utilizando a classe socket, por exemplo).
		 * 
		 * Toma uma string com o nome ou path de um arquivo como argumento
		 */
		FileInputStream fis = new FileInputStream("comandos_git.txt"); 
		
		/* O construtor da classe InputStreamReader faz a ponte entre a sequ�ncia de bytes lida em uma das classes
		 * do InputStream e transforma essa sequ�ncia em caracteres 
		 * 
		 * Toma um objeto do tipo InputStream como argumento
		 */
		InputStreamReader isr = new InputStreamReader(fis); 
		
		/* O construtor da classe BufferedReader salva os caracteres lidos no InputStreamReader em um buffer para
		 * que possam ser lidos de forma eficiente atrav�s de seus m�todos.
		 * 
		 * Toma um objeto do tipo Reader como argumento
		 */
		BufferedReader br = new BufferedReader(isr);
		
		//O m�todo readLine() da classe BufferedReader faz a leitura de uma linha do arquivo
		String linha = br.readLine();
		
		/* De forma rudimentar, para lermos todas as linhas de um arquivo, podemos fazer um la�o no qual,
		 * enquanto a vari�vel que armazena a linha lida atrav�s do readLine n�o for nula (o que acontece quando 
		 * o m�todo readLine n�o l� mais nenhuma sequ�ncia de caracteres), os caracteres lidos ser�o impressos no 
		 * console 
		 */
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		//Sempre devemos fechar a conex�o/stream de dados externos para evitar desperd�cio de mem�ria
		br.close();
		
	}

}
