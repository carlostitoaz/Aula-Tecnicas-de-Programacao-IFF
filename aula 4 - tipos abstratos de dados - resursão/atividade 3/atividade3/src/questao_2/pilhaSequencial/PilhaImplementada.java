package questao_2.pilhaSequencial;

public class PilhaImplementada implements Pilha {
    private char[] array;
    private int top;
    private static final int MAX_SIZE = 20;

    public PilhaImplementada() {
        array = new char[MAX_SIZE];
        top = -1;
    }

    public void empilhar(char dado) {
        if (top >= MAX_SIZE - 1) {
            throw new IllegalStateException("Pilha cheia, não é possível empilhar.");
        }

        array[++top] = dado;
    }

    public char desempilhar() {
        if (estaVazia()) {
            throw new IllegalStateException("Pilha vazia.");
        }

        char valor = array[top];
        array[top--] = 0; // Zera o valor para indicar que a posição está vazia
        return valor;
    }

    public char obterNoTopo() {
        if (estaVazia()) {
            throw new IllegalStateException("Pilha vazia.");
        }

        return array[top];
    }

    public boolean estaVazia() {
        return top == -1;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
    
        while (!estaVazia()) {
            sb.append(desempilhar()).append(" ");
        }
    
        return sb.toString().trim(); // Remove o espaço extra do final
    }
}
