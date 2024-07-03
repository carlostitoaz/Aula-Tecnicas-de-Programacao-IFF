package busca_em_vetores;

import java.util.Scanner;

public class ExemploBuscaBinariaIterativa {

	public static void main(String[] args) {

		final int tamanhoVetor = 20;
		Scanner entradaDoTeclado = new Scanner(System.in);

		int vetorNumeros[] = { 1, 14, 16, 19, 28, 30, 32, 45, 48, 54, 58, 61, 64, 68, 71, 75, 91, 92, 94, 97 };
		imprimirVetor(vetorNumeros, tamanhoVetor);
		System.out.println("\n\nEntre com o número a ser buscado:");
		int chaveDeBusca = entradaDoTeclado.nextInt();
		int posicaoEncontrada = buscaBinaria(chaveDeBusca, vetorNumeros, tamanhoVetor);
		if (posicaoEncontrada != -1) {
			System.out.println("Número encontrado na posição " + posicaoEncontrada + ".");
		} else {
			System.out.println("Número não encontrado!");
		}
	}

	private static int buscaBinaria(int chaveDeBusca, int[] vetorNumeros, int tamanhoVetor) {
		int inicio  = 0;
		int fim = tamanhoVetor - 1;
		int meio;
		
		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			if (chaveDeBusca == vetorNumeros[meio]) {
				return meio; // número encontrado			
			}
			if (chaveDeBusca < vetorNumeros[meio]) {
				fim = meio - 1;
			}
			else {
				inicio = meio + 1;
			}						
		}
		return -1;
	}

	private static void imprimirVetor(int[] vetorNumeros, int tamanhoVetor) {
		for (int indice = 0; indice < tamanhoVetor; indice++) {
			System.out.print(indice + "\t");
		}
		System.out.println();
		for (int indice = 0; indice < tamanhoVetor; indice++) {
			System.out.print(vetorNumeros[indice] + "\t");
		}
	}

}
