package questao_2.pilhaEncadeada;
import java.util.Scanner;
/*
 2. Fa¸ca uma fun¸c˜ao para inverter a ordem dos elementos existentes em uma string. Utilize, obrigatoriamente,
uma pilha como mem´oria tempor´aria para armazenar a string. Fa¸ca um programa principal para testar a
sua funcionalidade, entre com uma frase de at´e 20 caracteres e a imprima ap´os a invers˜ao.
Utilize o tipo abstrato de dados pilha desenvolvido anteriormente alterando-o para trabalhar com o tipo
char.
 */
public class TestaPilha3 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String texto;
        int cont=0;

        System.out.println("Informe a string com no máximo 20 caracteres para inverter: ");
        texto = ler.nextLine();

        if(texto.length() > 20){
            System.out.println("O texto deve ter no máximo 20 caracteres.");
            return;
        }

        Pilha pilhaAuxiliar = new PilhaImplementada();

        while(cont < texto.length()){
            pilhaAuxiliar.empilhar(texto.charAt(cont));
            cont++;
        }

        System.out.println(pilhaAuxiliar);
    }
}
