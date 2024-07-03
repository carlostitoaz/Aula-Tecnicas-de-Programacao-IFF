/*
 Escreva uma função recursiva que receba uma string como parâmetro e retorne uma nova string que é o
reverso da string de entrada. Faça um programa principal para testar a função.
 */

package Lista_4.questao_2;

public class RecursaoStringReversa {
/*     public static void main(String[] args){
        String caracteres = "Texto que sera revertido utilisando recursao";

        System.out.println("Texto original: "+caracteres);
        System.out.println("Texto reverso: "+reverterString(caracteres, caracteres.length()-1));
    }

    public static String reverterString(String caracteres, int i){
        if(i==0){
            return "";
        }

        return caracteres.charAt(i) + reverterString(caracteres, i-1);
    } */

    public static String reverterString(String caracteres){
        if(caracteres.length()==1){
            return caracteres;
        }
        System.out.println("Texto em andamento: "+caracteres);
        return caracteres.charAt(caracteres.length()-1) + reverterString(caracteres.substring(0, caracteres.length()-1));
    }

    public static void main(String[] args){
        String caracteres = "Texto que sera revertido utilisando recursao";

        System.out.println("Texto original: "+caracteres);
        System.out.println("Texto reverso: "+reverterString(caracteres));
    }
}

