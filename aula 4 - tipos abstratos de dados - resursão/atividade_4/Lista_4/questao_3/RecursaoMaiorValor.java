/* 
 Faça um programa para encontrar o maior elemento de um vetor. Para tanto utilize uma função recursiva
que receba o vetor e a quantidade de elementos do mesmo, e retorne o maior valor encontrado.
 */

package Lista_4.questao_3;

import java.util.Arrays;

public class RecursaoMaiorValor {
    
    public static int maiorValor(int[] numeros, int quantidade){
        if(quantidade == 1){
            return numeros[0];
        }
        return Math.max(numeros[quantidade], maiorValor(numeros,quantidade-1));
    }

    public static void main(String[] args){
        int[] numeros = {10,20,5,40,8,7,2,1};

        System.out.println("Vetor de inteiros: " + Arrays.toString(numeros)); //imprimindo o vetor de números inteiros
        System.out.println("Maior valor: " + maiorValor(numeros, numeros.length-1));
    }
}