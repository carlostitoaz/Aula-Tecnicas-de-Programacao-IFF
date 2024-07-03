package questao_1.pilhaSequencial;

public class PilhaImplementada implements Pilha {
    private int[] array;
    private int top;
    private static final int MAX_SIZE = 20;

    public PilhaImplementada() {
        array = new int[MAX_SIZE];
        top = -1;
    }

    public void empilhar(int dado) {
        if (top >= MAX_SIZE - 1) {
            throw new IllegalStateException("Pilha cheia, não é possível empilhar.");
        }

        array[++top] = dado;
    }

    public int desempilhar() {
        if (estaVazia()) {
            throw new IllegalStateException("Pilha vazia.");
        }

        int valor = array[top];
        array[top--] = 0; // Zera o valor para indicar que a posição está vazia
        return valor;
    }

    public int obterNoTopo() {
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

        for (int i = 0; i <= top; i++) {
            sb.append(array[i]).append(" ");
        }

        return sb.toString();
    }
}
