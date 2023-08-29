package questao_4;

public class LinkedQueue implements Queue{

    private static final int MAX_SIZE = 20;
    private int[] array;
    private int front;
    public int rear;
    private int size;

    public LinkedQueue(){
        array = new int[MAX_SIZE];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int data){

        if(size >= MAX_SIZE){
            throw new IllegalStateException("Fila cheia!");
        }

        rear = (rear + 1) % MAX_SIZE;
        array[rear] = data;
        size++;
    }

    public int dequeue(){
        
        if(isEmpty()){
            throw new IllegalStateException("Fila vazia, não é possivel remover");
        }

        int data = array[front];
        front = (front + 1) % MAX_SIZE;

        size--;
        return data;
    }

    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("Fila vazia");
        }
        return array[front];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        int current = front;

        for(int i=0; i < size; i++){
            sb.append(array[current]).append(" ");
            current = (current + 1) % MAX_SIZE;
        }

        return sb.toString();
    }    
}