import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilterCSV {

    public static void main(String[] args) {
        String inputFile = "Song.csv";
        String outputFile = "FilteredSong.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                // Dividir a linha em campos separados por vírgula
                String[] fields = line.split(",");

                // Verificar se todos os campos obrigatórios têm conteúdo
                if (fields.length >= 6 && !fields[0].isEmpty() && !fields[1].isEmpty()
                        && !fields[2].isEmpty() && !fields[3].isEmpty()
                        && !fields[4].isEmpty() && !fields[5].isEmpty()) {
                    // Verificar se nenhum campo tem valor 0
                    if (!fields[3].equals("0") && !fields[4].equals("0")) {
                        // Escrever a linha no arquivo de saída
                        bw.write(fields[0] + "," + fields[1] + "," + fields[2] + ","
                                + fields[3] + "," + fields[4] + "," + fields[5] + "\n");
                    }
                }
            }

            System.out.println("Filtragem concluída com sucesso.");

        } catch (IOException e) {
            System.err.println("Erro de leitura/escrita: " + e.getMessage());
        }
    }
}
