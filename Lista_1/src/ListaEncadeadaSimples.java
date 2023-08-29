//import org.junit.Test.None;

//import org.w3c.dom.Node;

public class ListaEncadeadaSimples implements ListaEncadeada {
    //Nó
    No noInicial = null;
    int totalElementos = 0;

    //Reescrita do método para adicionar o valor no Inicio
    public void adicionarInicio(int dado) {
        No novoNo = new No(dado);
        novoNo.definirProximo(this.noInicial);
        this.noInicial = novoNo;
        this.totalElementos++;
    }

    //Reescrita do método para adicionar o valor no Fim
    public void adicionarFim(int dado){
        No novoNo = new No(dado);
        No noAtual = this.noInicial;

        if(noInicial != null){
            while(noAtual.obterProximo() != null){
                noAtual = noAtual.obterProximo();
            }

            noAtual.definirProximo(novoNo);
        }else{
            this.noInicial = novoNo;
        }
        this.totalElementos++;
    }

    //Reescrevendo o metodo para adicionar no meio
    public boolean adicionarMeio(int posicaoInclusao, int dado){
        No novoNo = new No(dado);
        No noAtual = this.noInicial;
        No noProximo = null;   
        int contPosic;
        
        if(noAtual != null){
            for(contPosic=0; noAtual.obterProximo() != null && contPosic==posicaoInclusao-1; contPosic++){
                noAtual = noAtual.obterProximo();
            }
                        
            if(contPosic != posicaoInclusao){
                noProximo = noAtual.obterProximo();
                noAtual.definirProximo(novoNo);
                novoNo.definirProximo(noProximo);
                this.totalElementos++;
            }   
        }else{
            noAtual = novoNo;
            this.totalElementos++;
            return true;
        }
        return false;
    }

    //Reescrevendo o método para excluir o Nó que está na primeira posição
    public boolean excluirInicio(){
        if(this.noInicial != null){
            this.noInicial = this.noInicial.obterProximo();
            this.totalElementos--;
            return true;
        } 
        return false;
    }

    public boolean excluirFim(){
        if(this.noInicial != null){
            No noAtual = this.noInicial;
                
            for(int cont=1; cont<totalElementos-1; cont++){
                noAtual = noAtual.obterProximo();
            }

            noAtual.definirProximo(null);
            this.totalElementos--;
            return true;
        }
            
        return false;
    }

    // public boolean excluirMeio(int posicao){
    //     if(this.noInicial != null){
    //         No noAtual = this.noInicial;
    //         No noExcluir = null;
    //         int cont=0;

    //         //O "noAtual = noAtual.obterProximo()" começa pela posição [1], ele pula a posição [0].
    //         for(cont=1; ((cont < posicao) && (noAtual.obterProximo()!=null)); cont++){
    //             System.out.println("teste do for: "+cont+" - "+noAtual.obterDado());
    //             noAtual = noAtual.obterProximo();
    //             System.out.println("teste do for: "+cont+" - "+noAtual.obterDado());
    //         }

    //         if(cont==posicao){
    //             noExcluir = noAtual.obterProximo();
    //             noAtual.definirProximo(noExcluir.obterProximo());
    //             noExcluir.definirProximo(null);
    //             this.totalElementos--;
    //         }
    //         return true;
    //     }


    //     return false;
        
    // }

    public boolean excluirMeio(int posicaoExclusao){
        No noAtual = noInicial;
        No noAnterior = null;
        int posicaoAtual = 0;

        if(this.noInicial!=null){
            while((noAtual.obterProximo()!=null) && (posicaoExclusao != posicaoAtual)){
                noAnterior = noAtual;
                noAtual = noAtual.obterProximo();
                posicaoAtual++;
            }
            if(posicaoExclusao == posicaoAtual){
                if(noAnterior == null){
                    this.noInicial = noAtual.obterProximo();
                }else{
                    noAnterior.definirProximo(noAtual.obterProximo());
                }
                this.totalElementos--;
                return true;
            }
        }
        return false;
    }


    //Reescrevendo o método para retornar um deterninado valor a partir de sua posição
    public int obterDado(int posicao) {
        int pAtual = 0;
        No noInt = this.noInicial;
        
        for (pAtual = 0; pAtual != posicao; pAtual++) {
            noInt = noInt.obterProximo();
        }
        if (pAtual == posicao) {
            return noInt.obterDado();
        }
        return -1;
    }

    public int obterTotalDeElementos(){
        return this.totalElementos;
    }

    //Imprimindo os dados com toString
	public String toString() {
		String elementos = new String();
		No noAtual = this.noInicial;
		while (noAtual != null) {
			elementos = elementos + noAtual.obterDado() + " "; 
			noAtual = noAtual.obterProximo();
		}
		return "ListaEncadeada [ "+ elementos + "]";
	}











    public boolean incluiCrescente() {
    if (noInicial == null || noInicial.obterProximo() == null) {
        return true;
    }

    boolean trocaFeita = true;

    while (trocaFeita) {
        trocaFeita = false;
        No anterior = null;
        No noAtual = noInicial;

        while (noAtual != null && noAtual.obterProximo() != null) {
            No proximo = noAtual.obterProximo();

            if (noAtual.obterDado() > proximo.obterDado()) {
                trocaFeita = true;

                if (anterior == null) {
                    noAtual.definirProximo(proximo.obterProximo());
                    proximo.definirProximo(noAtual);
                    noInicial = proximo;  // Atualiza o início da lista
                } else {
                    noAtual.definirProximo(proximo.obterProximo());
                    proximo.definirProximo(noAtual);
                    anterior.definirProximo(proximo);
                }
            }

            anterior = noAtual;
            noAtual = proximo;
        }
    }

    return true;
}

    


public boolean excluirNoValor(int valor){
    No noAtual = noInicial;
    No anterior = null;
    No proximo = null;

    while(noAtual != null){

        if(noAtual.obterDado() == valor){

            if((noAtual.obterProximo() == null) && (noAtual.obterDado() == valor) && (anterior == null)){ //Só tem um Nó
                noInicial = null;
                
                return true;
            }


            if(anterior == null){ //Caso seja o Nó na posição zero a ser excluido ele não terá anterior. No caso existe mais de um Nó na lista.
                noInicial = noInicial.obterProximo();
                this.totalElementos--;
                return true;
            }else{
                if(proximo == null){ //Caso o Nó a ser exluido não esteja na posição zero.
                    anterior.definirProximo(null);
                    noAtual = anterior;
                    this.totalElementos--;
                    return true;
                }else{
                    if(anterior != null && proximo != null){
                        anterior.definirProximo(noAtual.obterProximo());
                        noAtual.definirProximo(null);
                        this.totalElementos--;
                        return true;
                    }
                }
            }
        }

        anterior = noAtual;
        noAtual = noAtual.obterProximo();
        proximo = noAtual.obterProximo();
    }

    return false;
}





















    
    
}