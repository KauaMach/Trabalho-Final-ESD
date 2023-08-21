package List;

import java.util.LinkedList;
import File.StopwatchCPU;

public class classLinkedList {
    LinkedList<String> linkedList = new LinkedList<String>();
    private StopwatchCPU stopwatch = new StopwatchCPU();

    public String adicionar(LinkedList<String> lista) {
        stopwatch = new StopwatchCPU();
        linkedList.addAll(lista);
        double timea = stopwatch.elapsedTime();
        return "LinkedList: " + timea;
    }

    public String deletar(LinkedList<String> lista) {
        stopwatch = new StopwatchCPU();
        linkedList.removeAll(lista);
        double timed = stopwatch.elapsedTime();
        return "LinkedList: " + timed;
    }

    public String buscar(LinkedList<String> lista) {
        LinkedList<String> palavrasEncontradas = new LinkedList<String>();
        stopwatch = new StopwatchCPU();

        for (String palavra: linkedList) {
            for (String palavraProcurada: lista) {
                if (palavra.contains(palavraProcurada)) {
                    palavrasEncontradas.add(palavra);
                }
            }
        }
        double timeb = stopwatch.elapsedTime();
        return "LinkedList: " + timeb;
    }
}
