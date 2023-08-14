package File;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Arq {
    public String[] leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        List<String> linhas = new ArrayList<>();
        String linha;

        while ((linha = buffRead.readLine()) != null) {
            //System.out.println(linha);

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
}
