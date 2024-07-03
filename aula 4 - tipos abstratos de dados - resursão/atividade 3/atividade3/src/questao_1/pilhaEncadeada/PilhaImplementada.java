package questao_1.pilhaEncadeada;

public class PilhaImplementada implements Pilha{
    private No noTopo;

    public void empilhar(int dado){
        No novoNo = new No(dado);
        novoNo.definirProximo(noTopo);
        noTopo = novoNo;
    }

    public int desempilhar(){
        if(noTopo==null){
            throw new IllegalStateException("A pilha está vazia.");
        }

        int dadoNo = noTopo.obterDado();
        noTopo = noTopo.obterProximo();
        return dadoNo;
    }

    public int obterNoTopo(){
        if(noTopo==null){
            throw new IllegalStateException("A pilha está vazia.");
        }

        return noTopo.obterDado();
    }

    public boolean estaVazia(){
        return noTopo == null;
    }

    public String toString(){
        String dadoNoString = new String();
        No noAtual = noTopo;

        while(noAtual != null){
            dadoNoString = dadoNoString + noAtual.obterDado()+" ";
            noAtual = noAtual.obterProximo();
        }
        return dadoNoString;
    }

}
