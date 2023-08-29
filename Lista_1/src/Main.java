public class Main {
    public static void main(String[] args) {

        ListaEncadeadaSimples listaEncadeada = new ListaEncadeadaSimples();
      
        //O primeiro dado inserido fica na ultima posição, já o ultimo dado inserido fica na primeira posição.
        listaEncadeada.adicionarInicio(10); //ultima posicao
        listaEncadeada.adicionarInicio(20);
        listaEncadeada.adicionarInicio(30);//primeira posicao [0]

        System.out.println("\nAdicionar no Inicio");
        System.out.println("\nCom FOR");
        for(int cont=0; cont<3; cont++){
            System.out.println(listaEncadeada.obterDado(cont));  
        }
        System.out.println(listaEncadeada);
        System.out.println(listaEncadeada.toString());

        //##################################################################
        
        //Adicionando o No no fim e imprimindo a lista encadeada
        listaEncadeada.adicionarFim(40);
        System.out.println("\nAdicionar no Fim");
        System.out.println(listaEncadeada.toString());

        //##################################################################

        //Adicionar o Nó no meio
        listaEncadeada.adicionarMeio(2,15);
        System.out.println("\nAdicionar no Meio");
        System.out.println(listaEncadeada.toString());

        //##################################################################

        //Excluir Nó no inicio
        listaEncadeada.excluirInicio();
        System.out.println("\nExcluir Nó que está no inicio");
        System.out.println(listaEncadeada.toString());

        //##################################################################

        //Excluir Nó no fim
        listaEncadeada.excluirFim();
        System.out.println("\nExcluir Nó que está no fim");
        System.out.println(listaEncadeada.toString());

        //##################################################################


        //acrecentando para testar o excluir no meio
        System.out.println("\nAcrescentando para testar o excluir no meio");
        listaEncadeada.adicionarFim(45);
        listaEncadeada.adicionarFim(42);
        listaEncadeada.adicionarFim(41);
        listaEncadeada.adicionarFim(40);
        listaEncadeada.adicionarFim(4);
        System.out.println(listaEncadeada.toString());
        
        //Excluir Nó no meio
        listaEncadeada.excluirMeio(0);
        System.out.println("\nExcluir Nó que está no Meio");
        System.out.println(listaEncadeada.toString());

        //Organiza em ordem Crescente
        listaEncadeada.incluiCrescente();
        System.out.println("\nOrganiza em ordem Crescente");
        System.out.println(listaEncadeada.toString());



        //##################################################################


        //Excluir Nó com um determinado valor
        listaEncadeada.excluirNoValor(4);
        //listaEncadeada.excluirNoValor(10);
        //listaEncadeada.excluirNoValor(20);
        listaEncadeada.excluirNoValor(40);
        //listaEncadeada.excluirNoValor(41);
        //listaEncadeada.excluirNoValor(42);
        listaEncadeada.excluirNoValor(45);

        System.out.println(listaEncadeada.toString());



    }
}