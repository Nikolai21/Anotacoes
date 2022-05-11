package testeIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeituraDeArquivos {
	
	/* É de suma importância que a declaração 'throws IOException' seja adicionada, uma vez
	 * que todas as exceções do pacote java.io são do tipo checked 
	 */
	
	public static void main(String[] args) throws IOException {
		
		/* O construtor da classe FileInputStream lê a sequência de bytes do arquivo informado como argumento
		 * 
		 * A classe FileInputStream é uma subclasse de InputStream. Com essa classe abstrata, pode-se tomar 
		 * inputs não apenas de arquivos, mas do console ou da internet (utilizando a classe socket, por exemplo).
		 * 
		 * Toma uma string com o nome ou path de um arquivo como argumento
		 */
		FileInputStream fis = new FileInputStream("comandos_git.txt"); 
		
		/* O construtor da classe InputStreamReader faz a ponte entre a sequência de bytes lida em uma das classes
		 * do InputStream e transforma essa sequência em caracteres 
		 * 
		 * Toma um objeto do tipo InputStream como argumento
		 */
		InputStreamReader isr = new InputStreamReader(fis); 
		
		/* O construtor da classe BufferedReader salva os caracteres lidos no InputStreamReader em um buffer para
		 * que possam ser lidos de forma eficiente através de seus métodos.
		 * 
		 * Toma um objeto do tipo Reader como argumento
		 */
		BufferedReader br = new BufferedReader(isr);
		
		//O método readLine() da classe BufferedReader faz a leitura de uma linha do arquivo
		String linha = br.readLine();
		
		/* De forma rudimentar, para lermos todas as linhas de um arquivo, podemos fazer um laço no qual,
		 * enquanto a variável que armazena a linha lida através do readLine não for nula (o que acontece quando 
		 * o método readLine não lê mais nenhuma sequência de caracteres), os caracteres lidos serão impressos no 
		 * console 
		 */
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		//Sempre devemos fechar a conexão/stream de dados externos para evitar desperdício de memória
		br.close();
		
	}

}
