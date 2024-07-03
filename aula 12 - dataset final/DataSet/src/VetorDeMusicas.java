//package datasetV2;

import java.util.ArrayList;
import java.util.List;

public class VetorDeMusicas implements ColecaoDeMusicas{
    List <Musica> listaDeMusicas;

    public VetorDeMusicas() {
        this.listaDeMusicas = new ArrayList<Musica>();
    }

    public List<Musica> getListaDeMusicas(){
        return this.listaDeMusicas;
    }

    public void adicionarMusica(Musica novaMusica) {
        listaDeMusicas.add(novaMusica);
    }

    public void excluirMusica(String nomeDaMusica){
        boolean achou = false;
        for(int i = 0; i < listaDeMusicas.size(); i++){
            if(listaDeMusicas.get(i).getTitulo().equals(nomeDaMusica)){
                listaDeMusicas.remove(i);
                achou = true;
            }
        }

        if(achou == false){
            System.out.println("Música não encontrada");
        }else{
            System.out.println("Música excluída");
        }
    }

    public Musica obterMusica(int posicaoDaMusica){
        if(posicaoDaMusica >= 0 && posicaoDaMusica < listaDeMusicas.size()){
            return listaDeMusicas.get(posicaoDaMusica);
        }else{
            System.out.println("Posição inválida");
            return null;
        }
    }

    public int obterTotalDeMusicas(){
        return listaDeMusicas.size();
    }

    public void trocarPosicaoEntreMusicas(int posicaoDaMusica1, int posicaoDaMusica2){
        if((posicaoDaMusica1 >= 0 && posicaoDaMusica2 >= 0) && (posicaoDaMusica1 < listaDeMusicas.size() && posicaoDaMusica2 < listaDeMusicas.size())){
            Musica objetoMusicaPosicao1 = listaDeMusicas.get(posicaoDaMusica1);

            listaDeMusicas.set(posicaoDaMusica1, listaDeMusicas.get(posicaoDaMusica2));
            listaDeMusicas.set(posicaoDaMusica2, objetoMusicaPosicao1);
        }else{
            System.out.println("Posição inválida");
        }
    }

    public void alterarMusica(int posicaoDaMusica, Musica novaMusica){
        if(posicaoDaMusica >= 0 && posicaoDaMusica < listaDeMusicas.size()){
            listaDeMusicas.set(posicaoDaMusica, novaMusica);
        }else{
            System.out.println("Posição inválida");
        }  
    }

    public void ordenar(Ordenador ordenador) {
        ordenador.ordenar(this);
    }
}


