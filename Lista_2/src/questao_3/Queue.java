package questao_3;

public interface Queue { //Fila
    
    void enqueue(int data);    //Adicionar elemento na fila
    int dequeue();              //Excluir elemento da fila
    int peek();             //Obter o primeiro elemento da fila
    boolean isEmpty();      //Ver se a pilha está vazia
    String toString();      //Criar uma representação para o objeto contendo todos os dados existentes
}
