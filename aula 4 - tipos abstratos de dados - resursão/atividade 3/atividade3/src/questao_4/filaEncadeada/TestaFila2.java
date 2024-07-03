package questao_4.filaEncadeada;
//Questão 4
public class TestaFila2 {
    public static void separarParesEImpares(Fila filaOriginal, Fila filaImpares, Fila filaPares) {
        while (!filaOriginal.estaVazio()) {
            int elemento = filaOriginal.remover();
            if (elemento % 2 == 0) {
                filaPares.adicionar(elemento);
            } else {
                filaImpares.adicionar(elemento);
            }
        }
    }

    public static void main(String[] args) {
        Fila filaOriginal = new FilaImplementada();
        filaOriginal.adicionar(3);
        filaOriginal.adicionar(6);
        filaOriginal.adicionar(9);
        filaOriginal.adicionar(4);
        filaOriginal.adicionar(2);

        System.out.println("Valores na fila original: "+filaOriginal.toString());

        Fila filaImpares = new FilaImplementada();
        Fila filaPares = new FilaImplementada();

        separarParesEImpares(filaOriginal, filaImpares, filaPares);

        System.out.println("Valores na fila original após remover: "+filaOriginal.toString());

        System.out.println("Valores na fila de ímpares: " +filaImpares.toString());

        System.out.println("Valores na fila de pares: " +filaPares.toString());
    }
}
