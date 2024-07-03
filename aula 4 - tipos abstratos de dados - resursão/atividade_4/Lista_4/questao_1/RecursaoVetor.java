package Lista_4.questao_1;

/* Fazer uma função recursiva que receba um vetor de números inteiros e retorne a soma dos números de
forma recursiva. Fazer um programa principal para testar a função.
 */

public class RecursaoVetor {

/*     public static int posicao=0;
    public static int soma=0;
    public static void main(String[] args){
        int[] vetor = {10,20,30};
        System.out.println(somaRecursiva(vetor));
        //System.out.println(vetor[2]);
    }

    public static int somaRecursiva(int[] v){
        if(posicao==3){
            return soma;
        }
        
        soma += v[posicao];
        posicao++;

        return somaRecursiva(v);
    } */

    public static void main(String[] args){
        int[] vetor = {10, 20, 30};

        System.out.println(somaRecursiva(vetor, 0));
    }

    public static int somaRecursiva(int[] v, int p){
        if(p == v.length){
            return 0;
        }

        return v[p] + somaRecursiva(v, p+1);
    }
}