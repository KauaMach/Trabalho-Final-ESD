package List;

import java.util.LinkedList;

public class classLinkedList {
    LinkedList<String> linkedList = new LinkedList<String>();

    public void adicionar(LinkedList<String> lista) {
        linkedList.addAll(lista);
    }



    public void deletar(LinkedList<String> lista) {
        linkedList.removeAll(lista);
    }


    public LinkedList<String> buscar(String palavra) {
        LinkedList<String> palavraEncontrada = new LinkedList<String>();

        for (String string : linkedList) {
            if (string.contains(palavra)) {
                palavraEncontrada.add(string);
            }
        }
        return palavraEncontrada;
    }
}
