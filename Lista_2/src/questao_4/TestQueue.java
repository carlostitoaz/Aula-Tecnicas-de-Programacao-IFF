package questao_4;

public class TestQueue {
    public static void main(String[] args){

        Queue fila = new LinkedQueue();
        int cont=0, valor=0;

        //ENQUEUE - Incrementar de 10 em 10;
        while(cont!=16){
            valor+=10;
            fila.enqueue(valor);
            cont++;
        }

        limparTela();
        System.out.println("Fila toda preechida: "+fila);

        //DEQUEUE 
        cont=0;
        while(cont!=1){
            fila.dequeue();
            cont++;
        }

        System.out.println("Fila após remover elementos: "+fila);

        fila.enqueue(210);
 
        System.out.println("Fila após adicionar elementos: "+fila);

        //PEEK
        System.out.println("Elemento na primeira posição: "+fila.peek());

        LinkedQueue valorRear = (LinkedQueue) fila;
        System.out.println("Valor atual de rear: "+valorRear.rear);

        //IsEmpty
        System.out.println("Está vazio: "+ fila.isEmpty());

        //toString
        System.out.println("Fila com toString: "+fila.toString());
    }

    public static void limparTela(){
        System.out.print("\033[H\033[2J");
    }
}
