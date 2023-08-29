package questao_4;

public class LinkedQueue implements Queue{

    private static final int MAX_SIZE = 20;
    private int[] array;
    private int front;
    private int rear;
    private int size;

    public LinkedQueue(){
        array = new int[MAX_SIZE];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueeu(int data){

        if(size >= MAX_SIZE){
            throw new IllegalStateException("Fila cheia!");
        }

        rear = (rear + 1) % MAX_SIZE;
        array[rear] = data;
        size--;
    }

    public int dequeue(){
        
    }



















    
}
