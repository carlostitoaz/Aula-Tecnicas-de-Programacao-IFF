package questao_2;

public interface Stack { //Pilha
    
    void push(int dada); //Empilhar elemento na pilha.
    int pop(); //Desempilhar elemento e retirna o elemento, o elemento saí da pilha.
    int peek(); //Retorna o elemento que está no topo da pilha, o elemento continua lá.
    boolean isEmpty(); //Verifica se está vazio.
    String toString(); //Retorna os elementos da pilha em forma de string.
}
