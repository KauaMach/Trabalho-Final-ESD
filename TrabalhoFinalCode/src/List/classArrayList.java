package List;

import java.util.ArrayList;
import File.StopwatchCPU;

public class classArrayList {
    ArrayList<String> arrayList = new ArrayList<String>();
    private StopwatchCPU stopwatch = new StopwatchCPU();

    public String adicionar(ArrayList<String> lista) {
        stopwatch = new StopwatchCPU();
        arrayList.addAll(lista);
        double timea = stopwatch.elapsedTime();
        return "ArrayList: " + timea;
    }

    public String deletar(ArrayList<String> lista) {
        stopwatch = new StopwatchCPU();
        arrayList.removeAll(lista);
        double timed = stopwatch.elapsedTime();
        return "ArrayList: " + timed;
    }

    public String buscar(ArrayList<String> lista) {
        ArrayList<String> palavrasEncontradas = new ArrayList<String>();
        stopwatch = new StopwatchCPU();

        for (String palavra : arrayList) {
            for (String palavraProcurada : lista) {
                if (palavra.contains(palavraProcurada)) {
                    palavrasEncontradas.add(palavra);
                }
            }
        }

        double timeb = stopwatch.elapsedTime();
        return "ArrayList: " + timeb;
    }
}
