package Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import File.StopwatchCPU;

public class classLinkedHashSet {
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
    private StopwatchCPU stopwatch = new StopwatchCPU();

    public String adicionar(List<String> lista) {
        stopwatch = new StopwatchCPU();
        linkedHashSet.addAll(lista);
        double time = stopwatch.elapsedTime();
        return "LinkedHashSet: " + time;
    }

    public String deletar(List<String> lista) {
        stopwatch = new StopwatchCPU();
        linkedHashSet.removeAll(lista);
        double time = stopwatch.elapsedTime();
        return "LinkedHashSet: " + time;
    }

    public String buscar(List<String> lista) {
        List<String> palavrasEncontradas = new ArrayList<String>();
        stopwatch = new StopwatchCPU();

        for (String palavra : linkedHashSet) {
            for (String palavraProcurada : lista) {
                if (palavra.contains(palavraProcurada)) {
                    palavrasEncontradas.add(palavra);
                }
            }
        }

        double time = stopwatch.elapsedTime();
        return "LinkedHashSet: " + time;
    }
}
