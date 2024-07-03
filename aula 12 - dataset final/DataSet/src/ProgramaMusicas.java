//package datasetV2;

import java.util.List;

public class ProgramaMusicas{
/*
    public void listarMusicas(List<Musica> listaDeMusicas){
        System.out.println("Listar músicas");
        for(int i = 0; i < listaDeMusicas.size(); i++){
            System.out.println(listaDeMusicas.get(i).toString());
        }
    }
*/
    public void listarMusicas(ColecaoDeMusicas listaDeMusicas){
        System.out.println("Listar músicas");
        for(int i = 0; i < listaDeMusicas.obterTotalDeMusicas(); i++){
            System.out.println(listaDeMusicas.obterMusica(i).toString());
        }
    }
}