package Set;
import java.util.*;

public class LinkedHashSetClass {

    LinkedHashSet<String> LinkedHashSet = new LinkedHashSet<String>();

    long adiconarIncio = System.nanoTime();

    public LinkedHashSet AddAllLinkedHashSetLista(List<String> lista) {
        LinkedHashSet.addAll(lista);
        return LinkedHashSet;
    }

    public LinkedHashSet AddLinkedHashSet(String string) {
        LinkedHashSet.add(string);
        return LinkedHashSet;
    }

    long getAdiconarFim = System.nanoTime();

    public long tempoParaAdicionarLinkedHashSet() {
        long tempoParaAdicionar = getAdiconarFim - adiconarIncio;
        return tempoParaAdicionar;
    }

    long apagarInicio = System.nanoTime();

    public void ApagarLinkedHashSet() {
        LinkedHashSet.clear();
    }

    public void ApagarElementoLinkedHashSet(String string) {
        LinkedHashSet.remove(string);
    }

    public void ApagarElementosLinkedHashSet(List<String> lista) {
        LinkedHashSet.removeAll(lista);
    }

    long apagarFim = System.nanoTime();

    public long tempoParaApagarLinkedHashSet() {
        long tempoParaApagar = apagarFim - apagarInicio;
        return tempoParaApagar;
    }

    long procurarInicio = System.nanoTime();

    public List<String> ProcurarPalavrasLinkedHashSet(List<String> lista) {
        List<String> plavrasEncontradas = new ArrayList<String>();
        for (String palavra : LinkedHashSet) {
            for (String palavra2 : lista) {
                if (palavra.contains(palavra2)) {
                    plavrasEncontradas.add(palavra);
                }
            }
        }
        return plavrasEncontradas;
    }

    public List<String> ProcurarPalavraLinkedHashSet(String palavra) {
        List<String> plavrasEncontradas = new ArrayList<String>();
        for (String palavra2 : LinkedHashSet) {
            if (palavra2.contains(palavra)) {
                plavrasEncontradas.add(palavra2);
            }
        }
        return plavrasEncontradas;
    }

    long procurarFim = System.nanoTime();

    public long tempoParaProcurarLinkedHashSet() {
        long tempoParaProcurar = procurarFim - procurarInicio;
        return tempoParaProcurar;
    }
}
