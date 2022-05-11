package testeIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EscritaELeitura {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("comandos_git.txt"); 
		InputStreamReader isr = new InputStreamReader(fis, "ASCII"); 
		BufferedReader br = new BufferedReader(isr);

		FileOutputStream fos = new FileOutputStream("comandos_git2.txt"); 
		OutputStreamWriter osw = new OutputStreamWriter(fos, "ASCII"); 
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();

		while (linha != null) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
		
	}

}
