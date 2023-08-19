package Set;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetClass {
    TreeSet<String> treeSet = new TreeSet<String>();

    long adiconarIncio = System.nanoTime();
    public TreeSet AddAllTreeSetLista (List<String>  lista) {
        treeSet.addAll(lista);
        return treeSet;
    }
    public TreeSet AddTreeSet (String string) {
        treeSet.add(string);
        return treeSet;
    }
    long AdiconarFim = System.nanoTime();

    public long tempoParaAdicionarTreeSet () {
        long tempoParaAdicionar = AdiconarFim - adiconarIncio;
        return tempoParaAdicionar;
    }

    long apagarInicio = System.nanoTime();
    public void ApagarTreeSet () {
        treeSet.clear();
    }

    public void ApagarElementoTreeSet (String string) {
        treeSet.remove(string);
    }

    public void ApagarElementosTreeSet (List<String> lista) {
        treeSet.removeAll(lista);
    }
    long apagarFim = System.nanoTime();
    public long tempoParaApagarTreeSet () {
        long tempoParaApagar = apagarFim - apagarInicio;
        return tempoParaApagar;
    }
    long procurarInicio = System.nanoTime();
    public List<String> ProcurarPalasvraTreeSet (List<String> lista) {
        List<String> plavrasEncontradas = new ArrayList<String>();
        for (String palavra : treeSet) {
            for (String palavra2 : lista) {
                if (palavra.contains(palavra2)) {
                    plavrasEncontradas.add(palavra);
                }
            }
        }
        return plavrasEncontradas;
    }

    public List<String> ProcurarPalavraTreeSet (String palavra){
        List<String> plavrasEncontradas = new ArrayList<String>();
        for (String palavra2 : treeSet) {
            if (palavra2.contains(palavra)) {
                plavrasEncontradas.add(palavra2);
            }
        }
        return plavrasEncontradas;
    }
    long procurarFim = System.nanoTime();
    public long tempoParaProcurarTreeSet () {
        long tempoParaProcurar = procurarFim - procurarInicio;
        return tempoParaProcurar;
    }
}

