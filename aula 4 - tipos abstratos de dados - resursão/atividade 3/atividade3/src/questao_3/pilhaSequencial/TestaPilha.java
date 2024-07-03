package questao_3.pilhaSequencial;

public class TestaPilha {
    public static void main(String[] args){

        /*
        Construa uma funcão, que use a estrutura pilha e verifique se o número de abre parênteses é igual ao número
        de fecha parênteses em uma expressão matemática. Utilize o tipo abstrato de dados pilha desenvolvido
        na questão anterior.
        */

        String expressao1 = "((2 + 3) * 5) + 4 * (2 * 8)";
        String expressao2 = ")(2 + 3) * 5(";

        System.out.println("Expressão 1: " + expressao1);
        System.out.println("Expressão 1 está balanceada? " + verificarBalanceamento(expressao1));

        System.out.println("\nExpressão 2: " + expressao2);
        System.out.println("Expressão 2 está balanceada? " + verificarBalanceamento(expressao2));
    }

     public static boolean verificarBalanceamento(String expressao) {
        Pilha pilha = new PilhaImplementada();

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);

            if (caractere == '(') {//abre parênteses
                pilha.empilhar((int) caractere);
            } else if (caractere == ')') {//fecha parênteses
                if (pilha.estaVazia() || pilha.desempilhar() != '(') {
                    return false; // Encontrou um ')' sem correspondente '('
                }
            }
        }

        return pilha.estaVazia(); // Se a pilha estiver vazia, os parênteses estão balanceados
    }
}
