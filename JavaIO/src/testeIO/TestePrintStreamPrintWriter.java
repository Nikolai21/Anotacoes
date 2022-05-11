package testeIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestePrintStreamPrintWriter {
	
	public static void main(String[] args) throws IOException {
		
		long inicio = System.currentTimeMillis();
		
		PrintWriter pw = new PrintWriter("testePrintWriter.txt");
		//pode ser utilizado em conjunto com o buffered writer, já que PrintWriter é uma subclasse de Writer
		
		pw.write("Testando 1 2 3 Testando MELEEEECAAAAA Testanto a bagaçada");
		pw.println();
		pw.write("Johnson ");
		pw.write("Malocakoroco");
		
		pw.close();
		
		//---------------------------------------------------------------------------------------------------------//
		
		FileWriter fw = new FileWriter("testeFileWriter.txt");
		//pode ser utilizado em conjunto com o buffered writer, já que FileWriter é uma subclasse de Writer
		
		fw.write("Testando o FileWriter, a meleca é melecau");
		/*em sistemas operacionais diferentes, os caracteres de escape podem ser diferentes
		 *por isso, um jeito simples de fazer com que não haja problemas de compatibilidade é utilizar
		 *o método lineSeparator ou substituir o FileWriter por PrintWriter
		 */
		fw.write(System.lineSeparator()); 
		fw.write("ELDEN RING É FODA PRA CARALHO");
		
		fw.close();
		
		//---------------------------------------------------------------------------------------------------------//
		
		PrintStream ps = new PrintStream("testePrintStream.txt");
		
		ps.println("Marrapaiz, não é que funciona mesmo");
		ps.println("Johnson");
		
		ps.close();
		
		PrintStream ps2 = new PrintStream(System.out);
		//diferente do PrintWriter e FileWriter, PrintStream também pode 
		//ser utilizado para imprimir dados no console
		
		ps2.println("Imprimindo essa bagaça no consoleeeeee");
		ps2.println(2.2);
		
	
		ps2.close();
		
		long fim = System.currentTimeMillis();
		
		/*o método currentTimeMillis conta os milissegundos que passaram desde 01/01/1970, que é considerada o início
		 * da era UNIX. Podemos utilizar esse método no início e no final de um programa para medir quanto tempo levou
		 * para executar o programa, em milissegundos. Claro, há muitas outras formas de utilizar esse método.
		 */
		
		System.out.println((fim - inicio));
	}

}
