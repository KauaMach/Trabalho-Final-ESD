package File;

import java.io.*;
import java.util.*;
public class Arq {
    public String[] leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        List<String> linhas = new ArrayList<>();
        String linha;

        while ((linha = buffRead.readLine()) != null) {
            linhas.add(linha);
        }
        buffRead.close();
        return linhas.toArray(new String[0]);
    }

    public  void escritor(String path, String Resultados) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path, true));
        buffWrite.write(Resultados);
        buffWrite.newLine();;
        buffWrite.close();
    }

    public void removeDuplicadas(String inputPath, String outputPath) throws IOException {
        String[] lines = leitor(inputPath);

        Set<String> uniqueWords = new HashSet<>();
        for (String line : lines) {
            String[] words = line.split("\\s+|\\p{Punct}"); // Split by whitespace or punctuation
            uniqueWords.addAll(Arrays.asList(words));
        }

        StringBuilder result = new StringBuilder();
        for (String word : uniqueWords) {
            if (!word.isEmpty()) {
                result.append(word).append("\n");
            }
        }

        escritor(outputPath, result.toString());
    }

}
