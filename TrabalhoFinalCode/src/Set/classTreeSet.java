package Set;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import File.StopwatchCPU;

public class classTreeSet {
    TreeSet<String> treeSet = new TreeSet<String>();
    private StopwatchCPU stopwatch = new StopwatchCPU();

    public String adicionar(List<String> lista) {
        stopwatch = new StopwatchCPU();
        treeSet.addAll(lista);
        double time = stopwatch.elapsedTime();
        return "TreeSet: " + time;
    }

    public String deletar(List<String> lista) {
        stopwatch = new StopwatchCPU();
        treeSet.removeAll(lista);
        double time = stopwatch.elapsedTime();
        return "TreeSet: " + time;
    }

    public String buscar(List<String> lista) {
        List<String> palavrasEncontradas = new ArrayList<String>();
        stopwatch = new StopwatchCPU();

        for (String palavra : treeSet) {
            for (String palavraProcurada : lista) {
                if (palavra.contains(palavraProcurada)) {
                    palavrasEncontradas.add(palavra);
                }
            }
        }

        double time = stopwatch.elapsedTime();
        return "TreeSet: " + time;
    }
}
