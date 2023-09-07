package OrdenacaoDeVetores;

import java.util.Random;
import java.util.Scanner;

public class ExemploOrdenacaoPorSelecao {

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
			System.out.println(vetorInteiros[indice]);
		}
		
		System.out.println("\n");
		ordenacaoPorSelecao(vetorInteiros);
		
		for (int indice = 0; indice < tamanhoVetor; indice++) {
			System.out.println(vetorInteiros[indice]);
		}
	}

	private static void ordenacaoPorSelecao(int[] vetorNumeros) {
		int tamanhoVetor = vetorNumeros.length;
		int posicaoDoMenorValor = 0;
		for (int posicaoEmAnalise = 0; posicaoEmAnalise < tamanhoVetor; posicaoEmAnalise++) {
			posicaoDoMenorValor = obterPosicaoDoMenorValor(vetorNumeros, posicaoEmAnalise);
			trocarValores(vetorNumeros, posicaoDoMenorValor, posicaoEmAnalise);
		}
	}

	private static int obterPosicaoDoMenorValor(int[] vetorNumeros, int posicaoDeInicio) {
		int tamanhoDoVetor = vetorNumeros.length;
		int menorValor = vetorNumeros[posicaoDeInicio];
		int posicaoParaTroca = posicaoDeInicio;
		for (int posicaoAvaliada = posicaoDeInicio + 1; posicaoAvaliada < tamanhoDoVetor; posicaoAvaliada++) {			
			if (vetorNumeros[posicaoAvaliada] < menorValor) {
				menorValor = vetorNumeros[posicaoAvaliada];
				posicaoParaTroca = posicaoAvaliada;
			}
		}
		return posicaoParaTroca;
	}
	
	private static void trocarValores(int[] vetorNumeros, int posicaoDoMenorValor, int posicaoVetor) {
		int armazenamentoAuxiliar;
		armazenamentoAuxiliar = vetorNumeros[posicaoVetor];
		vetorNumeros[posicaoVetor] = vetorNumeros[posicaoDoMenorValor];
		vetorNumeros[posicaoDoMenorValor] = armazenamentoAuxiliar;
	}
	
}
