import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ColecaoDeMusicas colecao = new VetorDeMusicas();
        ManipulaDataset manipulador = new ManipulaDataset();
        ProgramaMusicas programa = new ProgramaMusicas();

        // Lendo músicas de um arquivo CSV
        manipulador.lerDoArquivoCsv(colecao);

        // Listando as músicas
        //programa.listarMusicas(colecao.getListaDeMusicas());

        // Escrevendo músicas em um arquivo CSV
        manipulador.escreverNoArquivoCsv(colecao);
        
        int opcao = 0;

        while(opcao != 5){

            System.out.println("Menu de opções: \n");
            System.out.println("1 - Adição de música \n" + "2 - Exclusão de música \n" + "3 - Troca de posição entre duas músicas \n" + "4 - Alterar uma música \n" + "5 - Finalizar o programa \n");
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

                    System.out.print("Informe o artista:");
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

                    System.out.println(colecao.obterMusica(colecao.obterTotalDeMusicas()-1).toString());

                    break;
            
                case 2:
                    System.out.println("2 - Exclusão de música");

                    System.out.print("Informe o titulo da música");
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
            }
        }
    }
}