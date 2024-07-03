public class OrdenarPorVendasComBubbleSort implements Ordenador{
    
    public void ordenar(ColecaoDeMusicas colecaoDeMusicas){
        
        for(int j=0; j<colecaoDeMusicas.obterTotalDeMusicas(); j++ ){
            for(int i=0; i<colecaoDeMusicas.obterTotalDeMusicas() - j; i++ ){
                if(Double.parseDouble(colecaoDeMusicas.obterMusica(i).getVendas()) > Double.parseDouble(colecaoDeMusicas.obterMusica(i++).getVendas())){
                    colecaoDeMusicas.trocarPosicaoEntreMusicas(i, i++);
                }
            }
        }
    
    }

}
