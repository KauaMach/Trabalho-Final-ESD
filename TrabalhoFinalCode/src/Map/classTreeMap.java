package Map;

import java.util.TreeMap;

public class classTreeMap {
    private TreeMap<String, Integer> treeMap = new TreeMap<>();

    private void add(String palavra) {
        treeMap.put(palavra, treeMap.getOrDefault(palavra, null));
    }

    public void adicionar(String[] palavras) {
        for (String palavra : palavras) {
            add(palavra);
        }
    }

    private boolean buscar(String palavra) {
        return treeMap.containsKey(palavra);
    }

    public boolean buscar(String[] palavras) {
        for (String palavra : palavras) {
            if (!buscar(palavra)) {
                return false;
            }
        }
        return true;
    }

    private boolean deletar(String palavra) {
        return treeMap.remove(palavra) != null;
    }

    public boolean deletar(String[] palavras) {
        for (String palavra : palavras) {
            if (!deletar(palavra)) {
                return false;
            }
        }
        return true;
    }
}
