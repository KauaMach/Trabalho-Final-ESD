package Set;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class classTreeSet {
    TreeSet<String> treeSet = new TreeSet<String>();

    public void adicionar(List<String> lista) {
        treeSet.addAll(lista);
    }

    public void deletar(List<String> lista) {
        treeSet.removeAll(lista);
    }

    public List<String> buscar(List<String> lista) {
        List<String> plavrasEncontradas = new ArrayList<String>();
        for (String palavra : treeSet) {
            for (String palavra2 : lista) {
                if (palavra.contains(palavra2)) {
                    plavrasEncontradas.add(palavra);
                }
            }
        }
        return plavrasEncontradas;
    }

}
