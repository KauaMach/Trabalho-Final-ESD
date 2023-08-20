package List;

import java.util.LinkedList;

public class classLinkedList {
    LinkedList<String> linkedList = new LinkedList<String>();

    long adicionarIncio = System.nanoTime();
    public LinkedList addAllLinkedLista(LinkedList<String> lista) {
        linkedList.addAll(lista);
        return linkedList;
    }
    public LinkedList addLinkedList(String string) {
        linkedList.add(string);
        return linkedList;
    }

    long adicionarFim = System.nanoTime();
    public long tempoParaAdicionarLinkedList() {
        return adicionarFim - adicionarIncio;
    }

    long removerIncio = System.nanoTime();
    public void apagarLinkedList() {
        linkedList.clear();
    }
    public void removerElementoLinkedList(String string) {
        linkedList.remove(string);
    }
    public void removerElementosLinkedList(LinkedList<String> lista) {
        linkedList.removeAll(lista);
    }
    long removerFim = System.nanoTime();
    public long tempoParaApagarLinkedList() {
        return removerFim - removerIncio;
    }

    long procurarIncio = System.nanoTime();
    public LinkedList<String> procurarPalavrasLinkedList(LinkedList<String> lista) {
        LinkedList<String> palavrasEncontradas = new LinkedList<String>();

        for (String palavra: linkedList) {
            for (String palavraProcurada: lista) {
                if (palavra.contains(palavraProcurada)) {
                    palavrasEncontradas.add(palavra);
                }
            }
        }
        return palavrasEncontradas;
    }

    public LinkedList<String> procurarPalavraLinkedList(String palavra) {
        LinkedList<String> palavraEncontrada = new LinkedList<String>();
        
        for (String string: linkedList) {
            if (string.contains(palavra)) {
                palavraEncontrada.add(string);
            }
        }
        return palavraEncontrada;
    }

    long procurarFim = System.nanoTime();
    public long tempoParaProcurarLinkedList() {
        return procurarFim - procurarIncio;
    }


}

