package questao_2.pilhaEncadeada;

interface Pilha { //Stack - Pilha
    void empilhar(char dado); //push - Empilhar elemento

    char desempilhar(); //pop - Desempilhar elemento

    char obterNoTopo(); //peek - Obter o topo

    boolean estaVazia(); //isEmpty - Verificar se a Pilha está vazia

    String toString(); //toString - imprime a pilha
}