package buscaMenorItem;

import java.util.Arrays;
import java.util.List;

public class Produto {
	
	private String nome;
	private Integer preco;
	private static Produto[] listaDeProdutos = new Produto[5];
	private static int contadorIndice = 0;
	
	public Produto(String nome, Integer preco) {
		this.nome = nome;
		this.preco = preco;
		listaDeProdutos[contadorIndice] = this;
		contadorIndice++;
	}
	
	private static int retornaIndice(Produto produto) {
		int contador = 0;
		
		for (int i = 0; i < listaDeProdutos.length; i++) {
			if (listaDeProdutos[i].equals(produto)) {
				contador = i;
			}
		}
		
		return contador;
	}
	
	public static Produto buscaMenorProduto(int posicaoInicial) {
		int posicaoMaisBarato = posicaoInicial;
		Produto produtoMaisBarato = null;
		
		for(int atual = posicaoInicial; atual < listaDeProdutos.length; atual++) {
			if (listaDeProdutos[atual].getPreco() < listaDeProdutos[posicaoMaisBarato].getPreco()) {
				posicaoMaisBarato = atual;
				produtoMaisBarato = listaDeProdutos[posicaoMaisBarato];
			} 
		}
		
		if (produtoMaisBarato == null) {
			return listaDeProdutos[posicaoMaisBarato];
		}
		return produtoMaisBarato;		
	}
	
	//implementação do algoritmo Bubble Sort
	public static List<Produto> ordenaListaBubbleSort() {

		Produto[] listaOrdenada = listaDeProdutos;
				
		for(int indiceProduto = 0; indiceProduto < listaOrdenada.length; indiceProduto++) {
			for (int indice = 0; indice < listaOrdenada.length; indice++) {
				if (listaOrdenada[indiceProduto].getPreco() < listaOrdenada[indice].getPreco()) {
					Produto temp = listaOrdenada[indice];
					listaOrdenada[indice] = listaOrdenada[indiceProduto];
					listaOrdenada[indiceProduto] = temp;
				}
			}
		}
		
		return Arrays.asList(listaOrdenada);
	}
	
	//implementação algoritmo Selection Sort
	public static List<Produto> ordenaListaSelectionSort() {
		
		Produto[] listaOrdenada = listaDeProdutos;
		
		for (int indiceProduto = 0; indiceProduto < listaOrdenada.length; indiceProduto++) {
			int indiceMenorProduto = retornaIndice(buscaMenorProduto(indiceProduto));
			Produto temp = listaOrdenada[indiceMenorProduto];
			listaOrdenada[indiceMenorProduto] = listaOrdenada[indiceProduto];
			listaOrdenada[indiceProduto] = temp;
		}
		
		return Arrays.asList(listaOrdenada);
	}
	
	public static List<Produto> ordenaListaInsertionSort() {
		Produto[] listaOrdenada = listaDeProdutos;

		for(int indice = 0; indice < listaOrdenada.length; indice++) {
			int contador = indice;
			while(contador > 0 && listaOrdenada[contador].getPreco() < listaOrdenada[contador-1].getPreco()) {
				Produto temp = listaOrdenada[contador];
				listaOrdenada[contador] = listaOrdenada[contador-1];
				listaOrdenada[contador-1] = temp;
				contador--;
			}
		}
		
		return Arrays.asList(listaOrdenada);
	}
	
	public static void getLista() {
		System.out.println(Arrays.asList(listaDeProdutos));
	}
	

	public Integer getPreco() {
		return this.preco;
	}
	
	public String getNome() {
		return this.nome;
	}

	@Override
	public String toString() {
		return "[Produto: " + this.nome + " - Preço: R$ " + this.preco + "]";
	}

}
