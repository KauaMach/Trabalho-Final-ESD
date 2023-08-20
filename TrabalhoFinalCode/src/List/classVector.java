package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class classVector {
    Vector<String> vector = new Vector<String>();

    long adicionarIncio = System.nanoTime();
    public Vector addAllVectorLista(List<String> lista) {
        vector.addAll(lista);
        return vector;
    }
    public Vector addVector(String valor) {
        vector.add(valor);
        return vector;
    }

    long adicionarFim = System.nanoTime();
    public long tempoParaAdicionarVector() {
        return adicionarFim - adicionarIncio;
    }

    long removerIncio = System.nanoTime();
    public void apagarVector() {
        vector.clear();
    }
    public void removerElementoVector(String valor) {
        vector.remove(valor);
    }
    public void removerElementosVector(List<String> lista) {
        vector.removeAll(lista);
    }

    long removerFim = System.nanoTime();
    public long tempoParaApagarVector() {
        return removerFim - removerIncio;
    }

    long procurarIncio = System.nanoTime();
    public List<String> procurarPalavrasVector(List<String> lista) {
        List<String> palavrasEncontradas = new ArrayList<String>();

        for (String palavra: vector) {
            for (String palavraProcurada: lista) {
                if (palavra.contains(palavraProcurada)) {
                    palavrasEncontradas.add(palavra);
                }
            }
        }
        return palavrasEncontradas;
    }  

    public List<String> procurarPalavraVector(String palavra) {
        List<String> palavraEncontrada = new ArrayList<String>();
        
        for (String palavraProcurada: vector) {
            if (palavraProcurada.contains(palavra)) {
                palavraEncontrada.add(palavraProcurada);
            }
        }
        return palavraEncontrada;
    }
    
    long procurarFim = System.nanoTime();
    public long tempoParaProcurarVector() {
        return procurarFim - procurarIncio;
    }
}
