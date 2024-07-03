//package datasetV2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ColecaoDeMusicas colecao = null;
        int resposta = 0;

        while((resposta != 1) && (resposta != 2)){//se for true o loop continua
            System.out.println("Lista com vetor [1], lista encadeada [2]): ");
            resposta = scanner.nextInt();
            if (resposta == 1){
                colecao = new VetorDeMusicas();
                 System.out.println("igual a 1");
            }else{
                if(resposta == 2){
                    colecao = new ListaDeMusicas();
                    System.out.println("igual a 2");
                }else{
                    System.out.println("Opção inválida");
                }
            }
        }
        
        ManipulaDataset manipulador = new ManipulaDataset();
        ProgramaMusicas programa = new ProgramaMusicas();

        // Lendo músicas de um arquivo CSV
        manipulador.lerDoArquivoCsv(colecao);

        // Listando as músicas
        //programa.listarMusicas(colecao.getListaDeMusicas();
        programa.listarMusicas(colecao);

        // Escrevendo músicas em um arquivo CSV
        manipulador.escreverNoArquivoCsv(colecao);

        int opcao = 0;

        while(opcao != 5){

            System.out.println("Menu de opções: \n");
            System.out.println("1 - Adição de música \n" 
                +"2 - Exclusão de música \n"
                +"3 - Troca de posição entre duas músicas \n"
                +"4 - Alterar uma música \n"
                +"5 - Finalizar o programa \n"
                +"6 - Listar as músicas \n"
                +"7 - Ordenar por ano de lançamento \n"
                +"8 - Ordenar por vendas \n");
            System.out.print("Digite a opção desejada: "); 

            Scanner entrada = new Scanner(System.in);
            opcao = entrada.nextInt();
            entrada.nextLine();

            String artista, titulo, ano, vendas, streams, classificacao;
            int posicao1, posicao2, posicaoTroca;
            Musica novaMusica;

            switch (opcao){
                case 1:
                    System.out.println("1 - Adição de música");

                    System.out.print("Informe o artista: ");
                    artista = entrada.nextLine();

                    System.out.print("Informe o titulo: ");
                    titulo = entrada.nextLine();

                    System.out.print("Informe o ano: ");
                    ano = entrada.nextLine();

                    System.out.print("Informe as vendas: ");
                    vendas = entrada.nextLine();

                    System.out.print("Informe os streams: ");
                    streams = entrada.nextLine();

                    System.out.print("Informe a classificacao: ");
                    classificacao = entrada.nextLine();

                    novaMusica = new Musica(artista, titulo, ano, vendas, streams, classificacao);

                    colecao.adicionarMusica(novaMusica);

                    System.out.println("Música adicionada - "+colecao.obterMusica(colecao.obterTotalDeMusicas()-1).toString());

                    break;

                case 2:
                    System.out.println("2 - Exclusão de música");

                    System.out.print("Informe o título da música: ");
                    titulo = entrada.nextLine();

                    colecao.excluirMusica(titulo);

                    break;

                case 3:
                    System.out.println("3 - Troca de posição entre duas músicas");

                    System.out.print("Informe a primeira posição: ");
                    posicao1 = entrada.nextInt();

                    System.out.print("Informe a segunda posição: ");
                    posicao2 = entrada.nextInt();

                    colecao.trocarPosicaoEntreMusicas(posicao1, posicao2);

                    break;

                case 4:
                    System.out.println("4 - Alterar uma música");

                    System.out.print("Informe o artista: ");
                    artista = entrada.nextLine();

                    System.out.print("Informe o titulo: ");
                    titulo = entrada.nextLine();

                    System.out.print("Informe o ano: ");
                    ano = entrada.nextLine();

                    System.out.print("Informe as vendas: ");
                    vendas = entrada.nextLine();

                    System.out.print("Informe os streams: ");
                    streams = entrada.nextLine();

                    System.out.print("Informe a classificacao: ");
                    classificacao = entrada.nextLine();

                    novaMusica = new Musica(artista, titulo, ano, vendas, streams, classificacao);

                    System.out.print("Informe a posição para troca: ");
                    posicaoTroca = entrada.nextInt();

                    colecao.alterarMusica(posicaoTroca, novaMusica);

                    break;

                case 5:
                    System.out.println("5 - Finalizar o programa");
                    break;

                case 6:
                    System.out.println("6 - Listar as músicas");
                    programa.listarMusicas(colecao);
                    break;

                case 7:
                    System.out.println("7 - Ordenar as músicas por ano de lançamento");
                    colecao.ordenar(new OrdenarPorAnoDeLancamentoComSelectionSort());
                    break;

                case 8:
                    System.out.println("8 - Ordenar as músicas por vendas");
                    colecao.ordenar(new OrdenarPorVendasComBubbleSort());
                    break;
            }            
            manipulador.escreverNoArquivoCsv(colecao);
        }
    }
}

