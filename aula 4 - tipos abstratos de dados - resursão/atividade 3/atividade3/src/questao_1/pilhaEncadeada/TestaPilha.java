package questao_1.pilhaEncadeada;

public class TestaPilha {
    public static void main(String[] args){
        Pilha pilha1 = new PilhaImplementada();

        pilha1.empilhar(4);
        pilha1.empilhar(8);
        pilha1.empilhar(12);
        pilha1.empilhar(16);

        System.out.println("Pilha: "+pilha1);
        System.out.println("Topo: "+pilha1.obterNoTopo());

        System.out.println("Elemento desempilhado: "+pilha1.desempilhar());
        System.out.println("Pilha após desempilhar: "+pilha1.toString());

        System.out.println("A pilha está vazia: "+pilha1.estaVazia());
        
    }
}
