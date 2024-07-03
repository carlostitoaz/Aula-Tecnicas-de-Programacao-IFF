package busca_em_vetores;

import java.util.Scanner;

public class ExemploBuscaBinariaRecursiva {

	public static void main(String[] args) {

		final int tamanhoVetor = 20;
		Scanner entradaDoTeclado = new Scanner(System.in);

		int vetorNumeros[] = { 1, 14, 16, 19, 28, 30, 32, 45, 48, 54, 58, 61, 64, 68, 71, 75, 91, 92, 94, 97 };
		imprimirVetor(vetorNumeros, tamanhoVetor);
		System.out.println("\n\nEntre com o número a ser buscado:");
		int numeroBuscado = entradaDoTeclado.nextInt();
		int posicaoEncontrada = buscaBinaria(numeroBuscado, vetorNumeros, 0, tamanhoVetor);
		if (posicaoEncontrada != -1) {
			System.out.println("Número encontrado na posição " + posicaoEncontrada + ".");
		}
		else {
			System.out.println("Número não encontrado!");
		}
	}

	private static int buscaBinaria(int numeroBuscado, int[] vetorNumeros, int inicio, int fim) {
		int meio = (inicio + fim) / 2;
		if (vetorNumeros[meio] == numeroBuscado) {
			return meio; // número encontrado
		}
		if (inicio >= fim) {
			return -1; // número não encontrado
		} 
		if (vetorNumeros[meio] < numeroBuscado) {
			return buscaBinaria(numeroBuscado, vetorNumeros, meio + 1, fim);
		} 
		else {
			return buscaBinaria(numeroBuscado, vetorNumeros, inicio, meio - 1);
		}
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
