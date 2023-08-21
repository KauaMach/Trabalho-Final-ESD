package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import File.StopwatchCPU;

public class classHashSet {
    HashSet<String> hashsets = new HashSet<String>();
    private StopwatchCPU stopwatch = new StopwatchCPU();

    public String adicionar(List<String> lista) {
        stopwatch = new StopwatchCPU();
        hashsets.addAll(lista);
        double time = stopwatch.elapsedTime();
        return "HashSet: " + time;
    }

    public String deletar(List<String> lista) {
        stopwatch = new StopwatchCPU();
        hashsets.removeAll(lista);
        double time = stopwatch.elapsedTime();
        return "HashSet: " + time;
    }

    public String buscar(List<String> lista) {
        ArrayList<String> palavrasEncontradas = new ArrayList<String>();
        stopwatch = new StopwatchCPU();

        for (String palavra : hashsets) {
            for (String palavraProcurada : lista) {
                if (palavra.contains(palavraProcurada)) {
                    palavrasEncontradas.add(palavra);
                }
            }
        }

        double time = stopwatch.elapsedTime();
        return "HashSet: " + time;
    }
}
