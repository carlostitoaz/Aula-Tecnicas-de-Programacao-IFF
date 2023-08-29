package questao_4;

public interface Queue { 
    void enqueue(int data);
    int dequeue();
    int peek();
    boolean isEmpty();
    String toString();
}
