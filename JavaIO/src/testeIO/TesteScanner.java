package testeIO;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scanner1 = new Scanner(new File("contas.csv"));
		
		while(scanner1.hasNextLine()) {
			
			String linha = scanner1.nextLine();
			
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
			
			Scanner scanner2 = new Scanner(linha);
			
			scanner2.useLocale(Locale.US);
			scanner2.useDelimiter(",");
			
			String tipoConta = scanner2.next();
			Integer contaNumero = scanner2.nextInt();
			Integer contaAgencia = scanner2.nextInt();
			String clienteNome = scanner2.next();
			String clienteCpf = scanner2.next();
			String clienteProfissao = scanner2.next();
			String clienteUsuario = scanner2.next();
			String clienteSenha = scanner2.next();
			
//			System.out.format(new Locale ("pt-BR"),, clienteSenha, args)
			
			ArrayList<Object> dadosConta = new ArrayList<>();
			dadosConta.add(tipoConta);
			dadosConta.add(contaNumero);
			dadosConta.add(contaAgencia);
			
			ArrayList<Object> dadosCliente = new ArrayList<>();
			dadosCliente.add(clienteNome);
			dadosCliente.add(clienteCpf);
			dadosCliente.add(clienteProfissao);
			dadosCliente.add(clienteUsuario);
			dadosCliente.add(clienteSenha);
			
			
			
		
			scanner2.close();
		}
				
		scanner1.close();
	}
}
