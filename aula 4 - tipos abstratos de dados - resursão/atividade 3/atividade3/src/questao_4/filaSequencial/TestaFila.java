package questao_4.filaSequencial;

public class TestaFila {
    public static void main(String[] args){
        Fila fila1 = new FilaImplementada();

        fila1.inserir(5);
        fila1.inserir(10);
        fila1.inserir(15);
        fila1.inserir(20);
        fila1.inserir(25);

        System.out.println("Fila sequencial: "+fila1);

        System.out.println("Primeiro elemento removido: "+fila1.remover());
        System.out.println("Fila sequencial após remover o primeiro elemento: "+fila1);

        System.out.println("Primeiro elemento da fila: "+fila1.obterPrimeiro());
        System.out.println("Fila está vazia: "+fila1.estaVazio());
        System.out.println("Representação da fila: "+fila1.toString());
    }   
}
