package testeIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteLeituraEscrita {
	
	public static void main(String[] args) throws IOException {
				
		FileInputStream fis = new FileInputStream("comandos_git.txt"); // System.in 
		InputStreamReader isr = new InputStreamReader(fis); 
		BufferedReader br = new BufferedReader(isr);

		FileOutputStream fos = new FileOutputStream("comandos_git2.txt"); // System.out;
		OutputStreamWriter osw = new OutputStreamWriter(fos); 
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();

		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
				
	}

}
