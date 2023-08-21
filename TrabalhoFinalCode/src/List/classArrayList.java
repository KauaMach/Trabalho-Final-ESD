package List;

import java.util.ArrayList;

public class classArrayList {
    ArrayList<String> arrayList = new ArrayList<String>();

    public void adicionar(ArrayList<String> lista) {
        arrayList.addAll(lista);
    }

    public void deletetar(ArrayList<String> lista) {
        arrayList.removeAll(lista);
    }

    public ArrayList<String> buscar(ArrayList<String> lista) {
        ArrayList<String> palavrasEncontradas = new ArrayList<String>();

        for (String palavra : arrayList) {
            for (String palavraProcurada : lista) {
                if (palavra.contains(palavraProcurada)) {
                    palavrasEncontradas.add(palavra);
                }
            }
        }
        return palavrasEncontradas;
    }
}
