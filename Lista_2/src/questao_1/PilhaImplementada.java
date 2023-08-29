package questao_1;

class PilhaImplementada implements Pilha{
    private No noTopo; //O Nó do topo da pilha

    public void empilhar(int dado){ // O novo no entra na posição zero.
        No novoNo = new No(dado); 
        novoNo.definirProximo(noTopo); //O novo Nó aponta para o Nó anterior do topo
        noTopo = novoNo; // Atualiza o topo para o novo Nó
    }

    public int desempilhar(){
        if(noTopo==null){   //ou poderia chamar o metodo estaVazia()
            throw new IllegalStateException("A pilha está vazia.");
        }

        int dadoNo = noTopo.obterDado();    // Guardando o valor do topo
        noTopo = noTopo.obterProximo();     // Movendo o topo para o próximo Nó
        return dadoNo;                      // Retornamos o valor desempilhado
    }

    public int obterNoTopo(){
        
        if(estaVazia()){
            throw new IllegalStateException("Pilha está vazia.");
        }

        return noTopo.obterDado(); // Retorna o valor do topo
    }

    public boolean estaVazia(){

        return noTopo == null; // A pilha está vazia se o topo for nulo.

        // if(noTopo == null){
        //     return true;
        // }
        // return false;
    }

    public String toString(){
        String dadoNoString = new String();
        No noAtual = noTopo;

        while(noAtual != null){
            dadoNoString = dadoNoString + noAtual.obterDado()+" ";
            noAtual = noAtual.obterProximo();
        }
        return dadoNoString; //Retorna uma representação dos dados na pilha
    }
}