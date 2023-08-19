package Set;
import java.util.HashSet;
import java.util.Arrays;

// Uma função que recebe um array de Strings e retorna um HashSet com as palavras
public class HashSet {
    public HashSet(String[] palavras) {
    }

    public static HashSet<String> HashSet(String[] palavras) {
        // Cria um novo HashSet vazio
        HashSet<String> conjunto = new HashSet<String>();
        // Adiciona todas as palavras do array ao conjunto
        conjunto.addAll(Arrays.asList(palavras));
        // Retorna o conjunto
        return conjunto;
    }
}