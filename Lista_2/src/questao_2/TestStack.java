package questao_2;

public class TestStack {
    public static void main(String[] args){

        Stack stack1 = new LinkedStack();

        //Empilhando elemento
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);

        System.out.println("Pilha: "+stack1);

        //Desempilhando elemento
        System.out.println("Desempilhando o elemnto: "+stack1.pop());
        System.out.println("Pilha após desempilhar o elemento: "+stack1.toString());

        //Elemento que está no topo
        System.out.println("Elemento que está no topo: "+stack1.peek());

        //Pilha está vazia?
        System.out.println("Pilha está vazia: "+stack1.isEmpty());
    }
}
