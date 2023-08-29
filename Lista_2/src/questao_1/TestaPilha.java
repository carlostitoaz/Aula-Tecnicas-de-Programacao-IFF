package questao_1;

public class TestaPilha {
    public static void main(String[] args){
        Pilha pilha1 = new PilhaImplementada();

        //Empilhando os elementos
        pilha1.empilhar(10); //ultima posicao, primeiro elemento empilhado
        pilha1.empilhar(20);
        pilha1.empilhar(30); //primeira posicao, ultimo elemento empilhado

        System.out.println("Pilha: "+pilha1); //imprimindo a pilha
        System.out.println("Topo: "+pilha1.obterNoTopo()); //imprimindo a posição zero

        //Desempilhando elemento
        int elementoDesempilhado = pilha1.desempilhar(); //Desempilhando o elemento
        
        
        System.out.println("Elemento desempilhado: "+elementoDesempilhado);
        System.out.println("Pilha após desempilhar: "+pilha1.toString());
        

        //Verificando se a pilha está vazia
        System.out.println("A pilha está vazia: "+pilha1.estaVazia());




    }
}
