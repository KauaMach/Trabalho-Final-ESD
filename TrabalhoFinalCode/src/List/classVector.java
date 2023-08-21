package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import File.StopwatchCPU;

public class classVector {
    Vector<String> vector = new Vector<String>();
    private StopwatchCPU stopwatch = new StopwatchCPU();

    public String adicionar(List<String> lista) {
        stopwatch = new StopwatchCPU();
        vector.addAll(lista);
        double timea = stopwatch.elapsedTime();
        return "Vector: " + timea;
    }

    public String deletar(List<String> lista) {
        stopwatch = new StopwatchCPU();
        vector.removeAll(lista);
        double timed = stopwatch.elapsedTime();
        return "Vector: " + timed;
    }

    public String buscar(List<String> lista) {
        List<String> palavrasEncontradas = new ArrayList<String>();
        stopwatch = new StopwatchCPU();

        for (String palavra : vector) {
            for (String palavraProcurada : lista) {
                if (palavra.contains(palavraProcurada)) {
                    palavrasEncontradas.add(palavra);
                }
            }
        }

        double timeb = stopwatch.elapsedTime();
        return "Vector: " + timeb;
    }
}
