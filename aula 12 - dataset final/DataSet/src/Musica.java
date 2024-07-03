//package datasetV2;

public class Musica{
    private String artista;
    private String titulo;
    private String ano;
    private String vendas;
    private String streams;
    private String classificacao;

    public Musica(String artista, String titulo, String ano, String vendas, String streams, String classificacao){
        this.artista = artista;
        this.titulo = titulo;
        this.ano = ano;
        this.vendas = vendas;
        this.streams = streams;
        this.classificacao = classificacao;
    }

    //"Artist","Title","Year","Sales","Streams", "Rating"
    //"Artista","Título","Ano","Vendas","Streams", "Classificação"

    public void setArtista(String artista){
        this.artista = artista;
    }
    public String getArtista(){
        return this.artista;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setAno(String ano){
        this.ano = ano;
    }
    public String getAno(){
        return this.ano;
    }

    public void setVendas(String vendas){
        this.vendas = vendas;
    }
    public String getVendas(){
        return this.vendas;
    }

    public void setStreams(String streams){
        this.streams = streams;
    }
    public String getStreams(){
        return this.streams;
    }

    public void setClassificacao(String classificacao){
        this.classificacao = classificacao;
    }
    public String getClassificacao(){
        return this.classificacao;
    }

    public String toString() {
        return artista + "," + titulo + "," + ano + "," + vendas + "," + streams + "," + classificacao+"\n";
    }
}

