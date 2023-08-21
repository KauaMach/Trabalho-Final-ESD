package Map;

import java.util.LinkedHashMap;
import File.StopwatchCPU;

public class classLinkedHashMap {
    private LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
    private StopwatchCPU stopwatch = new StopwatchCPU();

    private void add(String palavra) {
        linkedHashMap.put(palavra, linkedHashMap.getOrDefault(palavra, 0));
    }

    public String adicionar(String[] palavras) {
        stopwatch = new StopwatchCPU();
        for (String palavra : palavras) {
            add(palavra);
        }
        double timea = stopwatch.elapsedTime();
        return "LinkedHashMap: " + timea;
    }

    private boolean buscar(String palavra) {
        return linkedHashMap.containsKey(palavra);
    }

    public String buscar(String[] palavras) {
        stopwatch = new StopwatchCPU();
        for (String palavra : palavras) {
            if (!buscar(palavra)) {
                return "False";
            }
        }
        double timeb = stopwatch.elapsedTime();
        return "LinkedHashMap: " + timeb;
    }

    private boolean deletar(String palavra) {
        return linkedHashMap.remove(palavra) != null;
    }

    public String deletar(String[] palavras) {
        stopwatch = new StopwatchCPU();
        for (String palavra : palavras) {
            if (!deletar(palavra)) {
                return "False";
            }
        }
        double timed = stopwatch.elapsedTime();
        return "LinkedHashMap: " + timed;
    }
}
