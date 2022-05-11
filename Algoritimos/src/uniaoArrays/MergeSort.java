package uniaoArrays;

import java.util.Arrays;
import java.util.List;

public class MergeSort {
	
	public static List<Integer> intercalaDoisArrays(Integer[] array1, Integer[] array2) {
		Integer[] uniaoArrays = new Integer[array1.length + array2.length];
		int ponteiroArray1 = 0;
		int ponteiroArray2 = 0;
		int ponteiroUniaoArrays = 0;
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		while(ponteiroArray1 < array1.length && ponteiroArray2 < array2.length) {
			if (array1[ponteiroArray1] <= array2[ponteiroArray2]) {
				uniaoArrays[ponteiroUniaoArrays] = array1[ponteiroArray1];
				ponteiroArray1++;
			} else if (array1[ponteiroArray1] > array2[ponteiroArray2]) {
				uniaoArrays[ponteiroUniaoArrays] = array2[ponteiroArray2];
				ponteiroArray2++;
			} 
			ponteiroUniaoArrays++;
		} 
		
		if (ponteiroArray1 >= array1.length) {
			for(int indice = ponteiroArray2; indice < array2.length; indice++) {
				uniaoArrays[ponteiroUniaoArrays] = array2[indice];
				ponteiroUniaoArrays++;
			} 
		} else if (ponteiroArray2 >= array2.length) {
			for(int indice = ponteiroArray1; indice < array1.length; indice++) {
				uniaoArrays[ponteiroUniaoArrays] = array1[indice];
				ponteiroUniaoArrays++;
			}
		}
		
		return Arrays.asList(uniaoArrays);
	}
	
	public static List<Integer> mergeSort(Integer[] array1, Integer[] array2) {
		Integer[] uniaoArrays =	uneArrays(array1, array2);
		Integer[] resultado = new Integer[uniaoArrays.length];
		
		int ponteiroArray1 = 0;
		int ponteiroArray2 = array1.length;
		int ponteiroResultado = 0;
		
		while(ponteiroArray1 < array1.length && ponteiroResultado < resultado.length) {
			if (uniaoArrays[ponteiroArray1] <= uniaoArrays[ponteiroArray2]) {
				resultado[ponteiroResultado]  = uniaoArrays[ponteiroArray1];
				ponteiroArray1++;
				ponteiroResultado++;
			} else if (uniaoArrays[ponteiroArray1] > uniaoArrays[ponteiroArray2]) {
				resultado[ponteiroResultado]  = uniaoArrays[ponteiroArray2];
				ponteiroArray2++;
				ponteiroResultado++;
			}
		} 
		
		while(ponteiroResultado < resultado.length) {
			resultado[ponteiroResultado] = uniaoArrays[ponteiroArray2];
			ponteiroArray2++;
			ponteiroResultado++;
		}
		
		return Arrays.asList(resultado);
	}
	
	public static List<String> mergeSort(String[] array1, String[] array2) {
		String[] uniaoArrays = uneArrays(array1, array2);
		String[] resultado = new String[uniaoArrays.length];
		
		int ponteiroArray1 = 0;
		int ponteiroArray2 = array1.length;
		int ponteiroResultado = 0;
		
		while(ponteiroArray1 < array1.length && ponteiroResultado < resultado.length) {
			if (uniaoArrays[ponteiroArray1].compareTo(uniaoArrays[ponteiroArray2]) <= 0) {
				resultado[ponteiroResultado]  = uniaoArrays[ponteiroArray1];
				ponteiroArray1++;
				ponteiroResultado++;
			} else if (uniaoArrays[ponteiroArray1].compareTo(uniaoArrays[ponteiroArray2]) > 0) {
				resultado[ponteiroResultado]  = uniaoArrays[ponteiroArray2];
				ponteiroArray2++;
				ponteiroResultado++;
			}
		} 
		
		while(ponteiroResultado < resultado.length) {
			resultado[ponteiroResultado] = uniaoArrays[ponteiroArray2];
			ponteiroArray2++;
			ponteiroResultado++;
		}
		
		return Arrays.asList(resultado);
	}
	
	private static Integer[] uneArrays(Integer[] array1, Integer[] array2) {		
		Integer[] uniaoArrays = new Integer[array1.length + array2.length];
		int posicaoLivre = 0;
		
		Arrays.sort(array1);
		Arrays.sort(array2);

		for(int i = 0; i < array1.length; i++) {
			uniaoArrays[posicaoLivre] = array1[i];
			posicaoLivre++;
		}
		for(int i = 0; i < array2.length;i++) {
			uniaoArrays[posicaoLivre] = array2[i];
			posicaoLivre++;
		}
		
		return uniaoArrays;
	}
	
	private static String[] uneArrays(String[] array1, String[] array2) {		
		String[] uniaoArrays = new String[array1.length + array2.length];
		int posicaoLivre = 0;
		
		Arrays.sort(array1);
		Arrays.sort(array2);

		for(int i = 0; i < array1.length; i++) {
			uniaoArrays[posicaoLivre] = array1[i];
			posicaoLivre++;
		}
		for(int i = 0; i < array2.length;i++) {
			uniaoArrays[posicaoLivre] = array2[i];
			posicaoLivre++;
		}
		
		return uniaoArrays;
	}
	
	public static void main(String[] args) {
		
		Integer[] array1 = {1,4,2,8,3,10,11,94,42,123}; //1,2,3,4,8
		Integer[] array2 = {3,9,2,5,3213,43,213,43,56,42}; //2,3,5,9
		
		List<Integer> array3 = intercalaDoisArrays(array1, array2);
		List<Integer> array4 = mergeSort(array1, array2);
		
		System.out.println(array3);
		System.out.println(array4);
		
		String[] arrayString1 = {"Nikolai", "Andreia"};
		String[] arrayString2 = {"Priscila", "Mauricio"};
		
		System.out.println(mergeSort(arrayString1, arrayString2));
		
		

	}	

}
