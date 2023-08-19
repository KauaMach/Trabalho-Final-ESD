package Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetClass {
    HashSet<String> hashsets = new HashSet<String>();

    long adiconarIncio = System.nanoTime();
    public HashSet addAllHashsetsLista(List<String> lista) {
        hashsets.addAll(lista);
        return hashsets;
    }

    public HashSet addhasHsets (String string) {
        hashsets.add(string);
        return hashsets;
    }

    long getAdiconarFim = System.nanoTime();
    public long tempoParaAdicionarHashsets() {
        long tempoParaAdicionar = getAdiconarFim - adiconarIncio;
        return tempoParaAdicionar;
    }

    long apagarInicio = System.nanoTime();
    public void apagarHashsets() {
        hashsets.clear();
    }
    public void apagarElementoHashsets(String string) {
        hashsets.remove(string);
    }

    public void apagarElementosHashsets(List<String> lista ){
        hashsets.removeAll(lista);
    }
    long apagarFim = System.nanoTime();

    public long tempoParaApagarHashsets() {
        long tempoParaApagar = apagarFim - apagarInicio;
        return tempoParaApagar;
    }
    long procurarInicio = System.nanoTime();
    public List<String> procurarPalasvraHashsets(List<String> lista) {
        ArrayList<String> plavrasEncontradas = new ArrayList<String>();
        for (String palavra : hashsets) {
            for (String palavra2 : lista) {
                if (palavra.contains(palavra2)) {
                    plavrasEncontradas.add(palavra);
                }
            }
        }
        return plavrasEncontradas;
    }

    public List<String> procurarPalavraHashsets(String palavra) {
        ArrayList<String> plavrasEncontradas = new ArrayList<String>();
        for (String palavra2 : hashsets) {
            if (palavra2.contains(palavra)) {
                plavrasEncontradas.add(palavra2);
            }
        }
        return plavrasEncontradas;
    }
    long procurarFim = System.nanoTime();
    public long tempoParaProcurarHashsets() {
        long tempoParaProcurar = procurarFim - procurarInicio;
        return tempoParaProcurar;
    }
}

