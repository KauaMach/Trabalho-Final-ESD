package Map;

import java.util.HashMap;
import File.StopwatchCPU;

public class classHashMap {
    private HashMap<String, Integer> hashMap = new HashMap<>();
    private StopwatchCPU stopwatch = new StopwatchCPU();

    private void add(String Palavra) {
        hashMap.put(Palavra, hashMap.getOrDefault(Palavra, 0));
    }

    public String adicionar(String[] palavras) {
        stopwatch = new StopwatchCPU();
        for (String palavra : palavras) {
            add(palavra);
        }
        double timea = stopwatch.elapsedTime();
        return "HashMap: "+ timea;
    }

    private boolean buscar(String palavra) {
        return hashMap.containsKey(palavra);
    }

    public String buscar(String[] palavras) {
        stopwatch = new StopwatchCPU();
        for (String palavra : palavras) {
            if (!buscar(palavra)) {
                return "False"; 
            }
        }
        double timeb = stopwatch.elapsedTime();
        return "HashMap: "+ timeb;
    }

    private boolean deletar(String palavra) {

        return hashMap.remove(palavra) != null;
    }

    public String deletar(String[] palavras) {
        stopwatch = new StopwatchCPU();
        for (String palavra : palavras) {
            if (!deletar(palavra)) {
                return "False";
            }
        }
        double timed = stopwatch.elapsedTime();
        return "HashMap: "+ timed;
    }
}
