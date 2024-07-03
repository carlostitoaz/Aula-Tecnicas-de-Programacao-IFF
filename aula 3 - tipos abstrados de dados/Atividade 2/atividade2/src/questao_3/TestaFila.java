package questao_3;

public class TestaFila {
    public static void main(String[] ags){
        Fila fila1 = new FilaImplementada();

        fila1.adicionar(2);
        fila1.adicionar(4);
        fila1.adicionar(6);
        fila1.adicionar(8);

        System.out.println("Fila: "+fila1);
        System.out.println("Primeiro da fila removido: "+fila1.remover());
        System.out.println("Após remover o primeiro da fila: "+fila1);

        System.out.println("Primeiro da fila: "+fila1.obterNoPrimeiro());

        System.out.println("Fila está vazia? "+fila1.estaVazio());

        System.out.println("Representação para o objeto contendo todos os dados existentes: "+fila1.toString());
    }
    
}
