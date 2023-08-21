package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class classHashSet {
    HashSet<String> hashsets = new HashSet<String>();

    public void adicionar(List<String> lista) {
        hashsets.addAll(lista);
    }


    public void deletar(List<String> lista) {
        hashsets.removeAll(lista);
    }

    public List<String> buscar(List<String> lista) {
        ArrayList<String> plavrasEncontradas = new ArrayList<String>();
        for (String palavra : hashsets) {
            for (String palavra2 : lista) {
                if (palavra.contains(palavra2)) {
                    plavrasEncontradas.add(palavra);
                }
            }
        }
        return plavrasEncontradas;
    }

}
