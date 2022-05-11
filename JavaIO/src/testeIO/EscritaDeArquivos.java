package testeIO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class EscritaDeArquivos {
	
	/* É de suma importância que a declaração 'throws IOException' seja adicionada, uma vez
	 * que todas as exceções do pacote java.io são do tipo checked 
	 */
	
	public static void main(String[] args) throws IOException {
		
		/* O construtor da classe FileOutputStream lê a sequência de bytes do arquivo informado como argumento
		 * 
		 * A classe FileOutputStream é uma subclasse de OutputStream. Com essa classe abstrata, pode-se não apenas
		 * criar um output em arquivo, mas também no console ou em outra rede.
		 * 
		 * Toma uma string com o nome ou path de um arquivo como argumento
		 */
		FileOutputStream fos = new FileOutputStream("comandos_git2.txt"); 
		
		/* O construtor da classe OutputStreamWriter faz a ponte entre a sequência de bytes lida em uma das classes
		 * do OutputStream e transforma essa sequência em caracteres 
		 * 
		 * Toma um objeto do tipo OutputStream como argumento
		 */
		OutputStreamWriter osw = new OutputStreamWriter(fos); 
		
		/* O construtor da classe BufferedWriter salva os caracteres lidos no OutputStreamWriter em um buffer para
		 * que possam ser escritos de forma eficiente através de seus métodos.
		 * 
		 * Toma um objeto do tipo Writer como argumento
		 */
		BufferedWriter ow = new BufferedWriter(osw);
		
		//O método write() da classe BufferedWriter faz a escrita de uma linha no arquivo destino
		ow.write("Marrapaiz");
		
		//Sempre devemos fechar a conexão/stream de dados externos para evitar desperdício de memória
		ow.close();
		
	}

}
