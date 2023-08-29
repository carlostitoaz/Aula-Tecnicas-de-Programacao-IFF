package questao_3;

public class TestQueue {
    public static void main(String[] args){
        Queue fila = new LinkedQueue();

        
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);
        fila.enqueue(40);
        fila.enqueue(50);
        System.out.println("Elementos da fila: "+fila);

        fila.dequeue();
        System.out.println("Após remover o primeiro elemento da fila: "+fila.toString());

        System.out.println("Primeiro elemento da fila: "+fila.peek());

        System.out.println("A fila está vazia? "+fila.isEmpty());        

        System.out.println("Representação para o objeto contendo todos os dados existentes: "+fila.toString());
    }
}
