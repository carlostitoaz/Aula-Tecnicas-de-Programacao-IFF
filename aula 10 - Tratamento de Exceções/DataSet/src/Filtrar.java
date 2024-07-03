import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Filtrar {

    public static void main(String[] args) {
        FileReader arquivoTexto = null;
        BufferedReader leituraBufferizada = null;

        FileWriter arquivoTexto2 = null;
        BufferedWriter escritaBufferezada = null;

        int tamanhoVetor = 8;
        String[] vetorLinha = new String[tamanhoVetor];
        vetorLinha[0] = "";
        boolean vetorEntra = true;

        int contaLinhaAtual = 1; // -----

        System.out.printf("\nConteúdo do arquivo texto:\n");
        try {
            arquivoTexto = new FileReader("C:/Users/Carlos/Documents/Meus Arquivos/IFF/3° Período/Técnicas de Programação 2023.2/aula 10 - Tratamento de Exceções/DataSet/src/archive/Song.csv"); // --
            leituraBufferizada = new BufferedReader(arquivoTexto);

            arquivoTexto2 = new FileWriter("C:/Users/Carlos/Documents/Meus Arquivos/IFF/3° Período/Técnicas de Programação 2023.2/aula 10 - Tratamento de Exceções/DataSet/src/archive/Song_Filtrado.csv", true); // --
            escritaBufferezada = new BufferedWriter(arquivoTexto2);

            String linhaLidaDoArquivo = leituraBufferizada.readLine(); // lê a primeira linha
            linhaLidaDoArquivo = leituraBufferizada.readLine(); // lê da segunda até a última linha

            while (linhaLidaDoArquivo != null) {
                System.out.println("\n\nLINHA: " + contaLinhaAtual + " - " + linhaLidaDoArquivo); // ----
                contaLinhaAtual++;

                int tamanhoDalinha = linhaLidaDoArquivo.length();
                int y = 0;

                // colocando a string dentro do vetor
                for (int i = 0; i != tamanhoDalinha; i++) {
                    if (!(linhaLidaDoArquivo.charAt(i) == ',' && linhaLidaDoArquivo.charAt(i + 1) == '\"')) {
                        // == "," e != aspas
                        // != "," e == aspas
                        // != "," e != aspas

                        vetorLinha[y] = vetorLinha[y] + linhaLidaDoArquivo.charAt(i);
                    } else {
                        // Encontrou virgula
                        y++;
                        vetorLinha[y] = "";
                    }
                }

                // verificando se no vetor tem uma posição vazia ou com zero.
                for (int x = 0; x != vetorLinha.length; x++) {
                    if (vetorLinha[x].equals("\"0\"") || vetorLinha[x] == "") {
                        vetorEntra = false; // Linha não entra
                        System.out.println("======= Linha não entra ========="); // ----
                    }
                }

                if (vetorEntra == true) {
                    // Escreve no arquivo

                    escritaBufferezada.write(vetorLinha[0] + "," + vetorLinha[1] + "," + vetorLinha[2] + "," + vetorLinha[3] + "," + vetorLinha[4] + "," + vetorLinha[7] + "\n");

                    escritaBufferezada.flush();
                    // escritaBufferezada.close();
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

        System.out.println();
        try {
            arquivoTexto.close();
            arquivoTexto2.close();
        } catch (IOException e) {
            System.out.printf("Erro de E/S no fechamento do arquivo: %s.\n", e.getMessage());
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.printf("Erro de apontamento para null: %s.\n", e.getMessage());
        }
    }
}