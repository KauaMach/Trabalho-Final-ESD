package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class classVector {
    Vector<String> vector = new Vector<String>();

    public void adicionar(List<String> lista) {
        vector.addAll(lista);
    }


    public void deletar(List<String> lista) {
        vector.removeAll(lista);
    }

    public List<String> buscar(List<String> lista) {
        List<String> palavrasEncontradas = new ArrayList<String>();

        for (String palavra : vector) {
            for (String palavraProcurada : lista) {
                if (palavra.contains(palavraProcurada)) {
                    palavrasEncontradas.add(palavra);
                }
            }
        }
        return palavrasEncontradas;
    }


}
