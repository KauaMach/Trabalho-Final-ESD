package Map;

import java.util.HashMap;

public class classHashMap {
    private HashMap<String, Integer> hashMap = new HashMap<>();

    private void add(String Palavra) {
        hashMap.put(Palavra, hashMap.getOrDefault(Palavra, null));
    }
    public void adicionar(String[] palavras) {
        for (String palavra : palavras) {
            add(palavra);
        }
    }

    private boolean buscar(String palavra) {
        return hashMap.containsKey(palavra);
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
        return hashMap.remove(palavra) != null;
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
