package testeIO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class EscritaDeArquivos {
	
	/* � de suma import�ncia que a declara��o 'throws IOException' seja adicionada, uma vez
	 * que todas as exce��es do pacote java.io s�o do tipo checked 
	 */
	
	public static void main(String[] args) throws IOException {
		
		/* O construtor da classe FileOutputStream l� a sequ�ncia de bytes do arquivo informado como argumento
		 * 
		 * A classe FileOutputStream � uma subclasse de OutputStream. Com essa classe abstrata, pode-se n�o apenas
		 * criar um output em arquivo, mas tamb�m no console ou em outra rede.
		 * 
		 * Toma uma string com o nome ou path de um arquivo como argumento
		 */
		FileOutputStream fos = new FileOutputStream("comandos_git2.txt"); 
		
		/* O construtor da classe OutputStreamWriter faz a ponte entre a sequ�ncia de bytes lida em uma das classes
		 * do OutputStream e transforma essa sequ�ncia em caracteres 
		 * 
		 * Toma um objeto do tipo OutputStream como argumento
		 */
		OutputStreamWriter osw = new OutputStreamWriter(fos); 
		
		/* O construtor da classe BufferedWriter salva os caracteres lidos no OutputStreamWriter em um buffer para
		 * que possam ser escritos de forma eficiente atrav�s de seus m�todos.
		 * 
		 * Toma um objeto do tipo Writer como argumento
		 */
		BufferedWriter ow = new BufferedWriter(osw);
		
		//O m�todo write() da classe BufferedWriter faz a escrita de uma linha no arquivo destino
		ow.write("Marrapaiz");
		
		//Sempre devemos fechar a conex�o/stream de dados externos para evitar desperd�cio de mem�ria
		ow.close();
		
	}

}
