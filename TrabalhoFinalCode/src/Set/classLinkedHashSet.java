package Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class classLinkedHashSet {
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

    public void adicionar(List<String> lista) {
        linkedHashSet.addAll(lista);
    }


    public void deletar(List<String> lista) {
        linkedHashSet.removeAll(lista);
    }

    public List<String> buscar(List<String> lista) {
        List<String> plavrasEncontradas = new ArrayList<String>();
        for (String palavra : linkedHashSet) {
            for (String palavra2 : lista) {
                if (palavra.contains(palavra2)) {
                    plavrasEncontradas.add(palavra);
                }
            }
        }
        return plavrasEncontradas;
    }

}
