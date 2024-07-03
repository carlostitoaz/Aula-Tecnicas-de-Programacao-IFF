//package datasetV2;

import java.util.List; 

public interface ColecaoDeMusicas{
    //public List<Musica> getListaDeMusicas();

    public void adicionarMusica(Musica musica);
    public void excluirMusica(String nomeDaMusica);
    public Musica obterMusica(int posicaoDaMusica); 
    public int obterTotalDeMusicas( );
    public void trocarPosicaoEntreMusicas(int posicaoDaMusica1, int posicaoDaMusica2);
    public void alterarMusica(int posicaoDaMusica, Musica novaMusica);

    public void ordenar(Ordenador ordenador);
}





























