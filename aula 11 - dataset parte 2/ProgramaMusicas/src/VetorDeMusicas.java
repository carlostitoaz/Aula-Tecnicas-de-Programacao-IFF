import java.util.ArrayList;
import java.util.List;

public class VetorDeMusicas implements ColecaoDeMusicas{
    List <Musica> listaDeMusicas;

    public VetorDeMusicas() {
        this.listaDeMusicas = new ArrayList<>();
    }

    public List<Musica> getListaDeMusicas(){
        return this.listaDeMusicas;
    }
    
    public void adicionarMusica(Musica novaMusica) {

        listaDeMusicas.add(novaMusica);

        /*
        String artista;
        String titulo;
        int ano;
        int vendas;
        int streams;
        String classificacao;

        System.out.print("Informações da música\n Informe o artista: ");
        artista = leia.nextLine();

        System.out.println("Informe o título: ");
        titulo = leia.nextLine();

        System.out.println("Informe o ano: ");
        ano = leia.nextInt();

        System.out.println("Informe as vendas: ");
        vendas = leia.nextInt();

        System.out.println("Informe as streams: ");
        streams = leia.nextInt();

        System.out.println("Informe as classificacao: ");
        classificacao = leia.nextLine();
        
        novaMusica = new Musica(artista, titulo, ano, vendas, streams, classificacao);
        */
    }
   
    
    public void excluirMusica(String nomeDaMusica){
        for(int i = 0; i < listaDeMusicas.size(); i++){
            if(listaDeMusicas.get(i).getTitulo().equals(nomeDaMusica)){
                listaDeMusicas.remove(i);
            }
        }
    }
    
    public Musica obterMusica(int posicaoDaMusica){
        return listaDeMusicas.get(posicaoDaMusica); //???????????????
    }
    
    public int obterTotalDeMusicas(){
        return listaDeMusicas.size();
    }

    public void trocarPosicaoEntreMusicas(int posicaoDaMusica1, int posicaoDaMusica2){
        Musica objetoMusicaPosicao1 = listaDeMusicas.get(posicaoDaMusica1);

        listaDeMusicas.set(posicaoDaMusica1, listaDeMusicas.get(posicaoDaMusica2));
        listaDeMusicas.set(posicaoDaMusica2, objetoMusicaPosicao1);
        
    }

    public void alterarMusica(int posicaoDaMusica, Musica novaMusica){
        listaDeMusicas.set(posicaoDaMusica, novaMusica);
    }
    
}


