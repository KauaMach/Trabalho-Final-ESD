package List;

import java.util.ArrayList;

public class classArrayList {
    ArrayList<String> arrayList = new ArrayList<String>();

    long adicionarIncio = System.nanoTime();
    public ArrayList addAllArrayLista(ArrayList<String> lista) {
        arrayList.addAll(lista);
        return arrayList;
    }

    public ArrayList addArrayList(String string) {
        arrayList.add(string);
        return arrayList;
    }

    long adicionarFim = System.nanoTime();
    public long tempoParaAdicionarArrayList() {
        return adicionarFim - adicionarIncio;
    }

    long removerIncio = System.nanoTime();
    public void apagarArrayList() {
        arrayList.clear();
    }

    public void removerElementoArrayList(String string) {
        arrayList.remove(string);
    }

    public void removerElementosArrayList(ArrayList<String> lista) {
        arrayList.removeAll(lista);
    }

    long removerFim = System.nanoTime();
    public long tempoParaApagarArrayList() {
        return removerFim - removerIncio;
    }

    long procurarIncio = System.nanoTime();
    public ArrayList<String> procurarPalavrasArrayList(ArrayList<String> lista) {
        ArrayList<String> palavrasEncontradas = new ArrayList<String>();

        for (String palavra: arrayList) {
            for (String palavraProcurada: lista) {
                if (palavra.contains(palavraProcurada)) {
                    palavrasEncontradas.add(palavra);
                }
            }
        }
        return palavrasEncontradas;
    }
    public ArrayList<String> procurarPalavraArrayList(String palavra) {
        ArrayList<String> palavraEncontrada = new ArrayList<String>();
        
        for (String string: arrayList) {
            if (string.contains(palavra)) {
                palavraEncontrada.add(string);
            }
        }
        return palavraEncontrada;
    }

    long procurarFim = System.nanoTime();
    public long tempoParaProcurarArrayList() {
        return procurarFim - procurarIncio;
    }
}
