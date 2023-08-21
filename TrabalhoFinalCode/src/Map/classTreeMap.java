package Map;

import java.util.TreeMap;
import File.StopwatchCPU;

public class classTreeMap {
    private TreeMap<String, Integer> treeMap = new TreeMap<>();
    private StopwatchCPU stopwatch = new StopwatchCPU();

    private void add(String palavra) {
        treeMap.put(palavra, treeMap.getOrDefault(palavra, 0));
    }

    public String adicionar(String[] palavras) {
        stopwatch = new StopwatchCPU();
        for (String palavra : palavras) {
            add(palavra);
        }
        double timea = stopwatch.elapsedTime();
        return "TreeMap: " + timea;
    }

    private boolean buscar(String palavra) {
        return treeMap.containsKey(palavra);
    }

    public String buscar(String[] palavras) {
        stopwatch = new StopwatchCPU();
        for (String palavra : palavras) {
            if (!buscar(palavra)) {
                return "False";
            }
        }
        double timeb = stopwatch.elapsedTime();
        return "TreeMap: " + timeb;
    }

    private boolean deletar(String palavra) {
        return treeMap.remove(palavra) != null;
    }

    public String deletar(String[] palavras) {
        stopwatch = new StopwatchCPU();
        for (String palavra : palavras) {
            if (!deletar(palavra)) {
                return "False";
            }
        }
        double timed = stopwatch.elapsedTime();
        return "TreeMap: " + timed;
    }
}
