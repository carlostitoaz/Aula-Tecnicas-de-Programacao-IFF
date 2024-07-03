package questao_1.pilhaSequencial;
/* 
public class PilhaImplementada_old implements Pilha{
    private No[] array;
    private int top;

    private static final int MAX_SIZE=20;

    public PilhaImplementada_old(){
        array = new No[MAX_SIZE];
        top = -1;
    }

    public void empilhar(int dado){
        if(top >= MAX_SIZE - 1){
            throw new IllegalStateException("Pilha cheia, não é possível empilhar.");

        }
   
        No novoNo = new No(dado);

        if(top >= 0){
            novoNo.definirProximo(array[0]);
        }
        array[++top] = novoNo;
    }

    public int desempilhar(){
        if(estaVazia()){
            throw new IllegalStateException("Pilha vazia.");
        }

        int valor = array[top].obterDado();
        array[top--] = null;
        return valor;
    }

    public int obterNoTopo(){
        if(estaVazia()){
            throw new IllegalStateException("Pilha vazia.");
        }

        return array[top].obterDado();
    }

    public boolean estaVazia(){
        return top == -1;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i <= top; i++){
            sb.append(array[i].obterDado()).append(" ");
        }

        return sb.toString();
    }
}*/
