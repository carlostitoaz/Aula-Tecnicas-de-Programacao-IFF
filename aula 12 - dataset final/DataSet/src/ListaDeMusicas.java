public class ListaDeMusicas implements ColecaoDeMusicas{
    
    private No noInicial;
    private No noAtual;
    private int tamanho;

    public ListaDeMusicas(){
        this.noInicial = null;
        this.tamanho = 0;
    }
    
    public void adicionarMusica(Musica novaMusica){//Metodo fila
        No novoNo = new No(novaMusica);

        if(this.noInicial == null){//verifica se a lista está vazia
            noInicial = novoNo;
        }else{
            noAtual = noInicial;
            while(noAtual.getProximo() != null){//Caminhar até o último nó
                noAtual = noAtual.getProximo();
            }
            noAtual.setProximo(novoNo); //O último nó aponta para o novo nó
        }
        tamanho++;
    }

    public void excluirMusica(String nomeDaMusica){
        No noAtual = noInicial;
        No noAnterior = null;
        boolean encontrou = false;

        while(noAtual != null){ //Caminhar até o último nó
            if(noAtual.getMusica().getTitulo().equals(nomeDaMusica)){//compara o título da música atual com o nome da música a ser excluída
                if(noAnterior == null){
                    noInicial = noAtual.getProximo();
                }else{
                    noAnterior.setProximo(noAtual.getProximo());
                }
                tamanho--;
                encontrou = true; 
            }
            noAnterior = noAtual;
            noAtual = noAtual.getProximo();
        }

        if(encontrou == false){
            System.out.println("Música não encontrada\n");
        }else{
            System.out.println("Música excluída\n");
        }
        
    }
   
    public Musica obterMusica(int posicaoDaMusica){
        if(posicaoDaMusica >= 0 && posicaoDaMusica < tamanho){
            No noAtual = noInicial;
            for(int i = 0; i < posicaoDaMusica; i++){
                noAtual = noAtual.getProximo();
            }
            return noAtual.getMusica();
        }else{
            return null;
        }
        
    } 

    public int obterTotalDeMusicas( ){
        return tamanho;
    }

    public void trocarPosicaoEntreMusicas(int posicaoDaMusica1, int posicaoDaMusica2){

        if((posicaoDaMusica1 >= 0 && posicaoDaMusica2 >= 0) && (posicaoDaMusica1 < tamanho && posicaoDaMusica2 < tamanho)){
            No noAtual1 = noInicial;
            No noAtual2 = noInicial;
            No noAnterior1 = null;
            No noAnterior2 = null;

            for(int i = 0; i < posicaoDaMusica1; i++){
                noAnterior1 = noAtual1;
                noAtual1 = noAtual1.getProximo();
            }

            for(int i = 0; i < posicaoDaMusica2; i++){
                noAnterior2 = noAtual2;
                noAtual2 = noAtual2.getProximo();
            }

            if(noAnterior1 != null){
                noAnterior1.setProximo(noAtual2);
            }else{
                noInicial = noAtual2;
            }

            if(noAtual1.getProximo() != null){
                noAtual2.setProximo(noAtual1.getProximo());
            }

            if(noAnterior2 != null){
                noAnterior2.setProximo(noAtual1);
            }else{
                noInicial = noAtual1;
            }

            if(noAtual2.getProximo() != null){
                noAtual1.setProximo(noAtual2.getProximo());
            }

            
        }
    }

    public void alterarMusica(int posicaoDaMusica, Musica novaMusica){
        if(posicaoDaMusica >= 0 && posicaoDaMusica < tamanho){
            No noAtual = noInicial;
            for(int i = 0; i < posicaoDaMusica; i++){
                noAtual = noAtual.getProximo();
            }
            noAtual.setMusica(novaMusica);
        }else{
            System.out.println("Posição inválida");
        }
    }

    public void ordenar(Ordenador ordenador) {
        ordenador.ordenar(this);
    }
}