package questao_4.filaSequencial;
//Questão 4
public class TestaFila2 {
    public static void separarParesEImpares(Fila filaOriginal, Fila filaImpares, Fila filaPares) {
        while (!filaOriginal.estaVazio()) {
            int elemento = filaOriginal.remover();
            if (elemento % 2 == 0) {
                filaPares.inserir(elemento);
            } else {
                filaImpares.inserir(elemento);
            }
        }
    }

    public static void main(String[] args) {
        Fila filaOriginal = new FilaImplementada();
        filaOriginal.inserir(3);
        filaOriginal.inserir(6);
        filaOriginal.inserir(9);
        filaOriginal.inserir(4);
        filaOriginal.inserir(2);

        System.out.println("Valores na fila original: "+filaOriginal.toString());

        Fila filaImpares = new FilaImplementada();
        Fila filaPares = new FilaImplementada();

        separarParesEImpares(filaOriginal, filaImpares, filaPares);

        System.out.println("Valores na fila original após remover: "+filaOriginal.toString());

        System.out.println("Valores na fila de ímpares: " +filaImpares.toString());

        System.out.println("Valores na fila de pares: " +filaPares.toString());
    }
}
