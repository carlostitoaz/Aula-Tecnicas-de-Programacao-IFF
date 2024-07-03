package questao_1.pilhaSequencial;

public class TestaPilha {
    public static void main(String[] args){
        Pilha pilha1 = new PilhaImplementada();

        pilha1.empilhar(5);
        pilha1.empilhar(10);
        pilha1.empilhar(15);
        pilha1.empilhar(20);

        System.out.println("Pilha: "+pilha1);

        System.out.println("Elemento desempilhado: "+pilha1.desempilhar());
        System.out.println("Após desempilhar: "+pilha1);

        System.out.println("Elemento no topo: "+pilha1.obterNoTopo());

        System.out.println("Pilha está vazia? "+pilha1.estaVazia());

    }
}
