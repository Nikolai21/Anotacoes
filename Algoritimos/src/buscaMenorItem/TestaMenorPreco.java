package buscaMenorItem;

public class TestaMenorPreco {
	
	public static void main(String[] args) {
		
		double[] precos = new double[5];
		
		precos[0] = 1000000;
		precos[1] = 46000;
		precos[2] = 16000;
		precos[3] = 46000;
		precos[4] = 17000;
		
		int posicaoMaisBarato = 0;
		double menorPreco = 0;
		
		for(int i = 0; i < precos.length; i++) {
			if (precos[i] < precos[posicaoMaisBarato]) {
				posicaoMaisBarato = i;
				menorPreco = precos[i];
			}
		}
				
//		System.out.println(menorPreco);
		
		Produto produto1 = new Produto("Ford K", 20000);
		Produto produto2 = new Produto("Ferrari", 1000000);
		Produto produto3 = new Produto("Chevrolet Onix", 25000);
		Produto produto4 = new Produto("Volkswagen Brasilia", 15000);
		Produto produto5 = new Produto("Renault Logan", 30000);

		Produto.getLista();
		System.out.println(Produto.buscaMenorProduto(0));
		System.out.println(Produto.ordenaListaInsertionSort());
	
	}
}
