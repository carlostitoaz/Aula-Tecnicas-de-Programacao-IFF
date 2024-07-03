package questao_1.pilhaEncadeada;

public class TestaPilha2 {
    public static void main(String[] args){

        /*
            Tipos Abstratos de Dados - Pilhas e Filas
            Questão 1
            Desenvolva uma fun¸c˜ao para testar se duas pilhas s˜ao iguais. Duas pilhas ser˜ao iguais se possu´ırem os
            mesmos elementos, na mesma ordem. Sua fun¸c˜ao dever´a retornar 1 para pilha1 = pilha2 e 0 para pilha1
            ̸= pilha2. Fa¸ca um programa principal para testar a sua funcionalidade.
            Utilize o tipo abstrato de dados pilha desenvolvido anteriormente.
         */

        Pilha pilha1 = new PilhaImplementada();

        pilha1.empilhar(4);
        pilha1.empilhar(8);
        pilha1.empilhar(3);
        pilha1.empilhar(16);

        Pilha pilha2 = new PilhaImplementada();

        pilha2.empilhar(4);
        pilha2.empilhar(8);
        pilha2.empilhar(12);
        pilha2.empilhar(16);


        System.out.println("Pilha1: "+pilha1);
        System.out.println("Pilha2: "+pilha2);

        System.out.println(comparaPilha(pilha1, pilha2));
    }

    public static int comparaPilha(Pilha pilha1, Pilha pilha2){
        int valorPila1 = 0, valorPila2 = 0, saida=1;
        boolean fim = false;

        while((valorPila1 == valorPila2) && (fim != true)){
            try{
                valorPila1 = pilha1.desempilhar();
                valorPila2 = pilha2.desempilhar();
            }catch(IllegalStateException e){
                fim=true;
                System.out.println("Fim da pilha");
            }

            if(valorPila1 != valorPila2){
                saida = 0;
            }
        }

        return saida;
    }
}





        