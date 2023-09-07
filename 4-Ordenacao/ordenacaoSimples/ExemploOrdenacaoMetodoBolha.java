package OrdenacaoDeVetores;

import java.util.Random;
import java.util.Scanner;

public class ExemploOrdenacaoMetodoBolha {

	public static void main(String[] args) {
		
		final int tamanhoVetor;
		Random geradorNumeroAleatorio = new Random();
		Scanner entradaDoTeclado = new Scanner(System.in);
		System.out.println("Entre com o tamanho do vetor:");
		tamanhoVetor = entradaDoTeclado.nextInt();
		
		int vetorInteiros[] = new int[tamanhoVetor];
		
		for (int indice = 0; indice < tamanhoVetor; indice++) {
			vetorInteiros[indice] = geradorNumeroAleatorio.nextInt(100);
		}
		
		for (int indice = 0; indice < tamanhoVetor; indice++) {
			System.out.print(" " + vetorInteiros[indice]);
		}
		
		System.out.println("\n");
		ordenacaoMetodoBolha(vetorInteiros);
		
		for (int indice = 0; indice < tamanhoVetor; indice++) {
			System.out.print(" " + vetorInteiros[indice]);
		}
	}

	private static void ordenacaoMetodoBolha(int[] vetorNumeros) {
		int tamanhoVetor = vetorNumeros.length;
		boolean existiuTroca;
		do {
			existiuTroca = false;
			for (int posicaoVetor = 0; posicaoVetor < tamanhoVetor - 1; posicaoVetor++) {
				if (vetorNumeros[posicaoVetor] > vetorNumeros[posicaoVetor + 1]) {
					trocarValores(vetorNumeros, posicaoVetor, posicaoVetor + 1);	
					existiuTroca = true;
				}
			}
		}
		while (existiuTroca);
	}

	private static void trocarValores(int[] vetorNumeros, int primeiraPosicao, int segundaPosicao) {
		int armazenamentoAuxiliar;
		armazenamentoAuxiliar = vetorNumeros[primeiraPosicao];
		vetorNumeros[primeiraPosicao] = vetorNumeros[segundaPosicao];
		vetorNumeros[segundaPosicao] = armazenamentoAuxiliar;
	}
	
}
