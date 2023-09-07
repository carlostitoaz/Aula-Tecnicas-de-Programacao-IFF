package Lista_4.src;

public class ListaEncadeadaSimples implements ListaEncadeada{
    
    No noInicial = null;
    int totalElementos = 0;

    public void adicionarInicio(int dado){
        No novoNo = new No(dado);
        novoNo.definirProximo(this.noInicial);
        this.noInicial = novoNo;
        this.totalElementos++;
    }


//################## Bubble Sort ##################

    public void addInicioBubbleSort(int dado) {
        /* 
        No novoNo = new No(dado);
        novoNo.definirProximo(this.noInicial);
        this.noInicial = novoNo;
        this.totalElementos++;
        */
        adicionarInicio(dado);

        No noAtual;
        No noAnterior = null;
        No noProximo = null;
        No noFim = null;

        for (int i = 0; i < this.totalElementos - 1; i++) {
            noAtual = noInicial;
            noProximo = noAtual.obterProximo();
            noAnterior = null;
            
            while((noAtual.obterProximo() != null) && (noAtual.obterProximo() != noFim)){
                if (noAtual.obterDado() > noProximo.obterDado()) {
                    if (noAnterior != null) {
                        noAnterior.definirProximo(noProximo);
                    } else {
                       noInicial = noProximo; // Atualiza o início da lista, se necessário
                    }
                    noAtual.definirProximo(noProximo.obterProximo());
                    noProximo.definirProximo(noAtual);
                }
                noAnterior = noAtual;
                noAtual = noProximo;
                noProximo = noProximo.obterProximo();
            }
            noFim = noAtual;
        }
    }


//################## Selection Sort ##################
  
    public void selectionSort(int dado){
        adicionarInicio(dado);
        
        No noAtual = noInicial, noProximo, noAnterior = null;
        No noMenorValor = noInicial, noMVProximo=noMenorValor.obterProximo(), noMVAnterior = null;
        No noMenorValorAtual = noInicial, noMVAProximo=null, noMVAAnterior = null;
        No noTroca;

        for(int i=0; i < this.totalElementos-2; i++){
            
            while(noAtual.obterProximo() != null){
                noAnterior = noAtual;
                noAtual = noAtual.obterProximo();
                
                if(noAtual.obterProximo()!=null){
                    noProximo = noAtual.obterProximo();
                }else{
                    noProximo = null;
                }

                if(noAtual.obterDado() < noMenorValorAtual.obterDado()){
                    noMVAAnterior = noAnterior;
                    noMenorValorAtual = noAtual;
                    noMVAProximo = noProximo;
                }
            }

            if(noMenorValor != noMenorValorAtual){

                if(noMVAnterior != null){
                    noMVAnterior.definirProximo(noMenorValorAtual);
                }else{
                    noInicial = noMenorValorAtual;
                }

                if(noMVAProximo != null){
                    noMenorValor.definirProximo(noMVAProximo);
                }else{
                    noMenorValor.definirProximo(null);
                }

            
                if(noMVAAnterior != noMenorValor){
                    noMVAAnterior.definirProximo(noMenorValor);
                }
            
                if(noMenorValorAtual != noMVProximo){
                    noMenorValorAtual.definirProximo(noMVProximo);
                }else{
                    noMenorValorAtual.definirProximo(noMenorValor);
                }
            
                noTroca = noMenorValorAtual;
                noMenorValorAtual = noMenorValor;
                noMenorValor = noTroca;
            }

            noMVAnterior = noMenorValor;
            noMenorValor = noMenorValor.obterProximo();
            noMVProximo = noMenorValor.obterProximo();
            noAtual = noMenorValor;
            noMenorValorAtual = noMenorValor;
        }

    }


//####################################################





//####################################################

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

    //Outra atividade
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

    //Outra Atividade
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

    @Override
	public Iterador obterIterador() {
		Iterador iterador = new IteradorListaEncadeada(this.noInicial);
		return iterador;
	}

    public String toString() {
        String elementos = new String();
        No noAtual = this.noInicial;
        while (noAtual != null) {
            elementos = elementos + noAtual.obterDado() + " "; 
            noAtual = noAtual.obterProximo();
        }
        return "ListaEncadeada [ "+ elementos + "]";
	}
}
