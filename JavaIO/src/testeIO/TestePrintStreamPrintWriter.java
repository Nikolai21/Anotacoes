package testeIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestePrintStreamPrintWriter {
	
	public static void main(String[] args) throws IOException {
		
		long inicio = System.currentTimeMillis();
		
		PrintWriter pw = new PrintWriter("testePrintWriter.txt");
		//pode ser utilizado em conjunto com o buffered writer, j� que PrintWriter � uma subclasse de Writer
		
		pw.write("Testando 1 2 3 Testando MELEEEECAAAAA Testanto a baga�ada");
		pw.println();
		pw.write("Johnson ");
		pw.write("Malocakoroco");
		
		pw.close();
		
		//---------------------------------------------------------------------------------------------------------//
		
		FileWriter fw = new FileWriter("testeFileWriter.txt");
		//pode ser utilizado em conjunto com o buffered writer, j� que FileWriter � uma subclasse de Writer
		
		fw.write("Testando o FileWriter, a meleca � melecau");
		/*em sistemas operacionais diferentes, os caracteres de escape podem ser diferentes
		 *por isso, um jeito simples de fazer com que n�o haja problemas de compatibilidade � utilizar
		 *o m�todo lineSeparator ou substituir o FileWriter por PrintWriter
		 */
		fw.write(System.lineSeparator()); 
		fw.write("ELDEN RING � FODA PRA CARALHO");
		
		fw.close();
		
		//---------------------------------------------------------------------------------------------------------//
		
		PrintStream ps = new PrintStream("testePrintStream.txt");
		
		ps.println("Marrapaiz, n�o � que funciona mesmo");
		ps.println("Johnson");
		
		ps.close();
		
		PrintStream ps2 = new PrintStream(System.out);
		//diferente do PrintWriter e FileWriter, PrintStream tamb�m pode 
		//ser utilizado para imprimir dados no console
		
		ps2.println("Imprimindo essa baga�a no consoleeeeee");
		ps2.println(2.2);
		
	
		ps2.close();
		
		long fim = System.currentTimeMillis();
		
		/*o m�todo currentTimeMillis conta os milissegundos que passaram desde 01/01/1970, que � considerada o in�cio
		 * da era UNIX. Podemos utilizar esse m�todo no in�cio e no final de um programa para medir quanto tempo levou
		 * para executar o programa, em milissegundos. Claro, h� muitas outras formas de utilizar esse m�todo.
		 */
		
		System.out.println((fim - inicio));
	}

}
