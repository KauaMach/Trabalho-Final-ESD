package Map;

import java.util.LinkedHashMap;

public class classLinkedHashMap {
    private LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

    private void add(String palavra) {
        linkedHashMap.put(palavra, linkedHashMap.getOrDefault(palavra, null) );
    }

    public void adicionar(String[] palavras) {
        for (String palavra : palavras) {
            add(palavra);
        }
    }

    private boolean buscar(String palavra) {
        return linkedHashMap.containsKey(palavra);
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
        return linkedHashMap.remove(palavra) != null;
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
