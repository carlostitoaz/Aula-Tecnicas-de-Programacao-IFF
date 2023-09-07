package Lista_4.src;

public class No {
    int dado;
    No proximo;

    public No(int dado){
        this.dado = dado;
        this.proximo = null;
    }

    public int obterDado(){
        return this.dado;
    }

    public void definirDado(int d){
        this.dado = d;
    }

    public No obterProximo(){
        return this.proximo;
    }

    public void definirProximo(No p){
        this.proximo = p;
    }
}