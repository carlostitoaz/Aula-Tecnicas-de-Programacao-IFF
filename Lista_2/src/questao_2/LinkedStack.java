package questao_2;

public class LinkedStack implements Stack{
    private Node[] array; //Array para armazenar os Nós
    private int top;    //Índice do topo da pilha

    private static final int MAX_SIZE = 20; //Tamanho máximo da pilha
    //private: Isso indica que a constante só é acessível dentro da classe onde foi declarada. Outras classes não podem acessá-la diretamente.
    //static: Isso significa que a constante pertence à classe em vez de uma instância específica dessa classe. Isso também significa que você pode acessar a constante usando o nome da classe, em vez de criar uma instância da classe.  
    //final: Isso indica que o valor da constante é fixo e não pode ser alterado após ser atribuído. Ou seja, a constante é somente leitura. 
    //int: Isso especifica que a constante é do tipo inteiro.
    //MAX_SIZE: Esse é o nome da constante, que é uma convenção comum em letras maiúsculas separadas por underscore para melhor legibilidade.

    public LinkedStack(){ //Construtor
        array = new Node[MAX_SIZE]; //Inicialize o array de Nós
        top = -1;   // Pilha vazia, topo é -1
    }

    public void push(int data){
        if(top >= MAX_SIZE - 1){
            throw new IllegalStateException("Pilha cheia, não é possivel empilhar");
        }
        Node newNode = new Node(data);  // Cria um novo Nó com dado a ser empilhado
        
        if(top >= 0){  //caso seja o primeiro Nó da pilha.
            newNode.setNext(array[top]);    // O novo Nó aponta para o antigo topo
        }
        array[++top] = newNode;         // Atualiza o topo para o novo Nó
    }

    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Pilha está vazia");
        }

        int data = array[top].getData();    //Guarda o dado do topo
        array[top--] = null;                //Remove o Nó do topo
        return data;                        //Retorna o dado do topo
    }

    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("Pilha está vazia");
        }

        return array[top].getData(); //retorna o dado do topo
    }

    public boolean isEmpty(){
        return top == -1;  //Pilha vazia se o topo for -1
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i <= top; i++){
            sb.append(array[i].getData()).append(" ");
        }

        return sb.toString(); //Retorna uma representação dos dados na pilha.
    }
}