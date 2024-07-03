package OrdenacaoDeVetores;

import java.util.Random;
import java.util.Scanner;

public class ExemploOrdenacaoPorInsercao {

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
		ordenacaoPorInsercao(vetorInteiros);	

		for (int indice = 0; indice < tamanhoVetor; indice++) {
			System.out.print(" " + vetorInteiros[indice]);
		}
	}

	private static void ordenacaoPorInsercao(int[] vetorNumeros) {
		int tamanhoVetor = vetorNumeros.length;
		int novaPosicaoDoNumero, numeroParaSerTrocado;
		for (int posicaoEmAvaliacao = 1; posicaoEmAvaliacao < tamanhoVetor; posicaoEmAvaliacao++) {
			numeroParaSerTrocado = vetorNumeros[posicaoEmAvaliacao];
			novaPosicaoDoNumero = obterNovaPosicao(vetorNumeros, posicaoEmAvaliacao, numeroParaSerTrocado);
			vetorNumeros[novaPosicaoDoNumero] = numeroParaSerTrocado;
		}
	}

	private static int obterNovaPosicao(int[] vetorNumeros, int potencialNovaPosicao, int numeroParaSerTrocado) {
		while ((potencialNovaPosicao > 0) && (vetorNumeros[potencialNovaPosicao - 1] > numeroParaSerTrocado)) {
			vetorNumeros[potencialNovaPosicao] = vetorNumeros[potencialNovaPosicao - 1];
			potencialNovaPosicao--;
		}
		return potencialNovaPosicao;
	}
}
