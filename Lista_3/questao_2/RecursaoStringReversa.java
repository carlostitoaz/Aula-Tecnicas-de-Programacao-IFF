/*
 Escreva uma função recursiva que receba uma string como parâmetro e retorne uma nova string que é o
reverso do string de entrada. Faça um programa principal para testar a função.
 */

package Lista_3.questao_2;

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

        return caracteres.charAt(caracteres.length()-1) + reverterString(caracteres.substring(0, caracteres.length()-1));
    }

    public static void main(String[] args){
        String caracteres = "Texto que sera revertido utilisando recursao";

        System.out.println("Texto original: "+caracteres);
        System.out.println("Texto reverso: "+reverterString(caracteres));
    }
}