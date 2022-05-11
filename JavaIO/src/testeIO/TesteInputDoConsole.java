package testeIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TesteInputDoConsole {
	
	public static void main(String[] args) throws IOException {
		
//		System.out.println("Digite seu nome, CPF e profissão:");
//		InputStreamReader input = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(input);
//		
//		String[] arg = br.readLine().split(",");
//		
//		System.out.println(Arrays.toString(arg));
//		
//		System.out.println();
//		
//		br.close();
		
		//----------------------------------------------------------------------------------------------------------------
				
		boolean param = true;
		
		while(param) {
			System.out.println("Digite um número de 1 a 10");
			
			boolean param2 = true;
			
			try {
				Scanner tentativa = new Scanner(new InputStreamReader(System.in));
				
				Integer numero = tentativa.nextInt();
				
				if (numero > 10) {
					System.out.println("É de 1 a 10!!!");
					param2 = false;
				} else {
					Random randomico = new Random();
					Integer numeroRandom = randomico.nextInt(10);
					
					if (numero == numeroRandom) {
						System.out.println("Você acertou!");
					} else {
						System.out.println("ERRRROOOOOOOOOO!!! O número era " + numeroRandom);
					}
				}
				
				while (param2) {
					System.out.println("Você quer jogar de novo? (Y/N)");
					Scanner opcao = new Scanner(new InputStreamReader(System.in));
					
					String parametro = opcao.next().toUpperCase();
					String sim = "Y";
					String nao = "N";
					
					if (parametro.equals(sim)) {
						param = true;
						param2 = false;
					} else if (parametro.equals(nao)) {
						param = false;
						param2 = false;
						tentativa.close();
						opcao.close();
						System.out.println("Então falow!");
					} else {
						System.out.println("Você precisa digitar Y ou N.");
					}
				}
			} 
			catch (InputMismatchException ex) {
				System.out.println("Você tem que digitar um número de 1 a 10, animal.");
			} 
			
		}
		
		
	}

}
