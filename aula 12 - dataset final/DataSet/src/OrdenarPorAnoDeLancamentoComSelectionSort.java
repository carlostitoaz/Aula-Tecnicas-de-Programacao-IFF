public class OrdenarPorAnoDeLancamentoComSelectionSort implements Ordenador{
    public void ordenar(ColecaoDeMusicas colecaoDeMusicas){
    
        for(int indice=0; indice<colecaoDeMusicas.obterTotalDeMusicas(); indice++){
            int indiceMenor = indice;
            for(int indiceSeguinte = indice+1; indiceSeguinte < colecaoDeMusicas.obterTotalDeMusicas(); indiceSeguinte++){
                if(Integer.parseInt(colecaoDeMusicas.obterMusica(indiceSeguinte).getAno()) < Integer.parseInt(colecaoDeMusicas.obterMusica(indiceMenor).getAno())){
                    indiceMenor = indiceSeguinte;
                }
            }
            colecaoDeMusicas.trocarPosicaoEntreMusicas(indice, indiceMenor);
        }
    
    }
}
