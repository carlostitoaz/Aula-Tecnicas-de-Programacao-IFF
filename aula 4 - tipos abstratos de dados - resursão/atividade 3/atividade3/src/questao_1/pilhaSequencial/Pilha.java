package questao_1.pilhaSequencial;

interface Pilha { //Stack - Pilha
    void empilhar(int dado); //push - Empilhar elemento

    int desempilhar(); //pop - Desempilhar elemento

    int obterNoTopo(); //peek - Obter o topo

    boolean estaVazia(); //isEmpty - Verificar se a Pilha está vazia

    String toString(); //toString - imprime a pilha
}
