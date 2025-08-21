import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReadingExercise {
    public static void main(String[] args) {
        String fileName = "exemplo.txt";

        System.out.println("Conteúdo do arquivo '" + fileName + "':\n");


        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8))) {

            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

            System.out.println("\nLeitura do arquivo concluída.");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}