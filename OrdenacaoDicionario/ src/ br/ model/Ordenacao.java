package br.model;

public class Ordenacao {
	//rd

	public static String[] selectionSort(String[] vetor) {

		for (int i = 0; i <= vetor.length - 2; i++) {
			int min = 1;
			for (int j = 1 + i; j <= vetor.length - 1; j++) {
				if (vetor[j].length() < vetor[min].length()) {
					min = j;
				}
			}
			String t = vetor[min];
			vetor[min] = vetor[i];
			vetor[i] = t;
		}
		
		return vetor;

	}

}
