package questao_3;

public class LinkedQueue implements Queue{
    private Node front; //Nó que está na frente da fila
    private Node rear; //Nó que está no ultimo da fila

    public LinkedQueue(){
        front = null;
        rear = null;
    }

    public void enqueue(int data){      //Adicionar elemento na fila
        Node newNode = new Node(data);

        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }else{
            rear.setNext(newNode);
            rear = newNode;
        }
    }


    public int dequeue(){

        if(isEmpty()){
            throw new IllegalStateException("Fila está vazia");
        }

        int data = front.data;
        front = front.next;

        if(front == null){
            rear = null;
        }

        return data;
    }

    public int peek(){

        if(isEmpty()){
            throw new IllegalStateException("Fila está vazia");
        }

        return front.getData();
    }

    public boolean isEmpty(){
        return front == null;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node current = front;

        while(current != null){
            sb.append(current.getData()).append(" ");

            current = current.getNext();
        }

        return sb.toString();
    }
}
