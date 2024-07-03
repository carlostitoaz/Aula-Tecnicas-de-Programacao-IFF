//package datasetV2;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ManipulaDataset{

    int tamanhoVetor = 8;
    String[] vetorLinha = new String[tamanhoVetor];


    public void lerDoArquivoCsv(ColecaoDeMusicas colecao){
        FileReader arquivoTexto = null;
        BufferedReader leituraBufferizada = null;
        boolean vetorEntra = true;

        try{
            //arquivoTexto = new FileReader("C:/Users/Carlos/Documents/Meus Arquivos/IFF/3° Período/Técnicas de Programação 2023.2/aula 11 - dataset parte 2/ProgramaMusicas/src/archive/Song.csv"); // --
            arquivoTexto = new FileReader("/home/runner/DataSet/src/main/java/archive/Song.csv"); // --
            leituraBufferizada = new BufferedReader(arquivoTexto);

            String linhaLidaDoArquivo = leituraBufferizada.readLine(); // lê a primeira linha
            linhaLidaDoArquivo = leituraBufferizada.readLine(); // lê a segunda linha

            vetorLinha[0]="";

            while (linhaLidaDoArquivo != null) {
                    //System.out.println("\n\nLINHA: " + contaLinhaAtual + " - " + linhaLidaDoArquivo); // ----
                    //contaLinhaAtual++;

                    int tamanhoDalinha = linhaLidaDoArquivo.length();
                    int y = 0;

                    // colocando a string dentro do vetor
                    for (int i = 0; i != tamanhoDalinha; i++) {
                        //if (!(linhaLidaDoArquivo.charAt(i) == ',' && linhaLidaDoArquivo.charAt(i + 1) == '\"')) {
                        if (linhaLidaDoArquivo.charAt(i) != '\"' && linhaLidaDoArquivo.charAt(i) != ',') {
                            // == "," e != aspas
                            // != "," e == aspas
                            // != "," e != aspas
                            vetorLinha[y] = vetorLinha[y] + linhaLidaDoArquivo.charAt(i);
                        } else {
                            if((linhaLidaDoArquivo.charAt(i) == ',') && (linhaLidaDoArquivo.charAt(i + 1) == '\"')){
                                // Encontrou virgula
                                y++;
                                vetorLinha[y] = "";
                            }       
                        }
                    }

                    // verificando se no vetor tem uma posição vazia ou com zero.
                    for (int x = 0; x != vetorLinha.length; x++) {
                        if (vetorLinha[x].equals("0") || vetorLinha[x] == "") {
                            vetorEntra = false; // Linha não entra
                            System.out.println("======= Linha não entra ========="); // ----
                        }
                    }

                    if (vetorEntra == true) {
                        // Criando objeto da classe Musica
                        // Integer.parseInt - Converter a String para int
                        Musica novaMusica = new Musica(vetorLinha[0], vetorLinha[1], vetorLinha[2], vetorLinha[3], vetorLinha[4], vetorLinha[7]);

                        // Adicionando a música na coleção
                        colecao.adicionarMusica(novaMusica);

                    }

                    // Limpar o vetor
                    for (int j = 0; j < vetorLinha.length; j++) {
                        vetorLinha[j] = "";
                    }

                    linhaLidaDoArquivo = leituraBufferizada.readLine();
                    vetorEntra = true;
                }
        } catch (FileNotFoundException e) {
            System.out.printf("Erro no nome do arquivo: %s.\n", e.getMessage());
        } catch (IOException e) {
            System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }

        try {
            leituraBufferizada.close();
            arquivoTexto.close();
        } catch (IOException e) {
            System.out.printf("Erro de E/S no fechamento do arquivo: %s.\n", e.getMessage());
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.printf("Erro de apontamento para null: %s.\n", e.getMessage());
        }

    }

    public void escreverNoArquivoCsv(ColecaoDeMusicas colecao){
        FileWriter arquivoTexto2 = null;
        BufferedWriter escritaBufferezada = null;

        try{
            //arquivoTexto2 = new FileWriter("C:/Users/Carlos/Documents/Meus Arquivos/IFF/3° Período/Técnicas de Programação 2023.2/aula 11 - dataset parte 2/ProgramaMusicas/src/archive/Song_Filtrado.csv", true); // --
            //limpando o escritaBuffezada
            FileWriter limpar = new FileWriter("/home/runner/DataSet/src/main/java/archive/Song_Filtrado.csv"); // --
            escritaBufferezada = new BufferedWriter(limpar);
            escritaBufferezada.write(""); 
            
            arquivoTexto2 = new FileWriter("/home/runner/DataSet/src/main/java/archive/Song_Filtrado.csv", true); // --
            escritaBufferezada = new BufferedWriter(arquivoTexto2);

            //Escrevendo no arquivo
            for(int i = 0; i < colecao.obterTotalDeMusicas(); i++){
                escritaBufferezada.write(colecao.obterMusica(i).toString()); 
                escritaBufferezada.flush();
            }

        }catch (FileNotFoundException e) {
                System.out.printf("Erro no nome do arquivo: %s.\n", e.getMessage());
            } catch (IOException e) {
                System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
            }

            try {
                escritaBufferezada.close();
                arquivoTexto2.close();
            } catch (IOException e) {
                System.out.printf("Erro de E/S no fechamento do arquivo: %s.\n", e.getMessage());
                e.printStackTrace();
            } catch (NullPointerException e) {
                System.out.printf("Erro de apontamento para null: %s.\n", e.getMessage());
            }   
    }
}