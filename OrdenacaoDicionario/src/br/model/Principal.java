package br.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	private static Scanner leia;

	public static void main(String[] args) {

		String [] vetor = null;
		System.out.printf("\nConteúdo do arquivo texto:\n");
		try {
			FileReader arq = new FileReader("./data/InglesAmericano.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			int i = 0;
			String linha = lerArq.readLine(); // lê a primeira linha
			// a variável "linha" recebe o valor "null" quando o processo
			// de repetição atingir o final do arquivo texto
			int tamVetor = Integer.parseInt(linha);
			vetor = new String[tamVetor];
			
			while (linha != null && i < tamVetor) {
				linha = lerArq.readLine();
				vetor[i] = linha;
				System.out.printf("linha = %s\t v = %s\n", linha, vetor[i]);
				i++;
			}

			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
		
		String ordSelectionSort[] = Ordenacao.selectionSort(vetor.clone());
		
		mostrarVetor(ordSelectionSort);
		
		mostrarVetor(vetor);
		
		
	}
	
	
	public static void mostrarVetor(String[] vetor)
	{
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + "  tam: "+vetor[i].length());
		}
	}
	
}
