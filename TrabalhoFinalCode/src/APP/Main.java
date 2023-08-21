package APP;

import File.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import List.*;
import Set.*;
import Map.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Arq arq = new Arq();
     /*   StopwatchCPU timer = new StopwatchCPU();

        arq.removeDuplicadas("TrabalhoFinalCode\\src\\File\\leipzig100k.txt", "TrabalhoFinalCode\\src\\File\\leipzingTratada.txt");

        double timerTratamento = timer.elapsedTime();
        arq.escritor("TrabalhoFinalCode\\src\\File\\TempTratamento.txt", "Tempo de tratamento: " + timerTratamento);
        */

        String leipzigTratada = "TrabalhoFinalCode\\src\\File\\leipzingTratada.txt";
        String Templist = "TrabalhoFinalCode\\src\\File\\TempList.txt";
        String TempMap = "TrabalhoFinalCode\\src\\File\\TempMap.txt";
        String TempSet = "TrabalhoFinalCode\\src\\File\\TempSet.txt";


        ArrayList<String> palavrasLeipzingA = new ArrayList<>(Arrays.asList(arq.leitor(leipzigTratada)));
        ArrayList<String> palavrasBDA = new ArrayList<>(Arrays.asList("Lisbon", "NASA", "Kyunghee", "Konkuk", "Sogang", "momentarily", "rubella", "vaccinations", "government", "Authorities"));

        LinkedList<String> palavrasLeipzingLL = new LinkedList<>(Arrays.asList(arq.leitor(leipzigTratada)));
        LinkedList<String> palavrasBDLL = new LinkedList<>(Arrays.asList("Lisbon", "NASA", "Kyunghee", "Konkuk", "Sogang", "momentarily", "rubella", "vaccinations", "government", "Authorities"));


        //--------------------------------------------------------------------------------------------------------------------
        //List

        classArrayList arrayList = new classArrayList();
        classLinkedList linkedList = new classLinkedList();
        classVector vector = new classVector();


        /*arq.escritor(Templist, "ArrayList");
        arq.escritor(Templist, arrayList.adicionar(palavrasLeipzingA));
        arq.escritor(Templist, arrayList.buscar(palavrasBDA));
        arq.escritor(Templist, arrayList.deletar(palavrasBDA));*/

        /*arq.escritor(Templist, "LinkedList");
        arq.escritor(Templist, linkedList.adicionar(palavrasLeipzingLL));
        arq.escritor(Templist, linkedList.buscar(palavrasBDLL));
        arq.escritor(Templist, linkedList.deletar(palavrasBDLL));*/


        /*arq.escritor(Templist, "Vector");
        arq.escritor(Templist, vector.adicionar(palavrasLeipzingA));
        arq.escritor(Templist, vector.buscar(palavrasBDA));
        arq.escritor(Templist, vector.deletar(palavrasBDA));*/


        //--------------------------------------------------------------------------------------------------------------------
        //Set

        classHashSet hashSet = new classHashSet();
        classLinkedHashSet linkedHashSet = new classLinkedHashSet();
        classTreeSet treeSet = new classTreeSet();

        /*arq.escritor(TempSet, "HashSet");
        arq.escritor(TempSet, hashSet.adicionar(palavrasLeipzingA));
        arq.escritor(TempSet, hashSet.buscar(palavrasBDA));
        arq.escritor(TempSet, hashSet.deletar(palavrasBDA));
*/
        /*arq.escritor(TempSet, "LinkedHashSet");
        arq.escritor(TempSet, linkedHashSet.adicionar(palavrasLeipzingA));
        arq.escritor(TempSet, linkedHashSet.buscar(palavrasBDA));
        arq.escritor(TempSet, linkedHashSet.deletar(palavrasBDA));*/

        /*arq.escritor(TempSet, "TreeSet");
        arq.escritor(TempSet, treeSet.adicionar(palavrasLeipzingA));
        arq.escritor(TempSet, treeSet.buscar(palavrasBDA));
        arq.escritor(TempSet, treeSet.deletar(palavrasBDA));*/



        //--------------------------------------------------------------------------------------------------------------------
        //Map

        String[] palavrasLeipzingMap = arq.leitor(leipzigTratada);
        String[] palavrasBDMap = {"Lisbon"};


        classHashMap hashMap = new classHashMap();
        classLinkedHashMap linkedHashMap = new classLinkedHashMap();
        classTreeMap treeMap = new classTreeMap();

        /*arq.escritor(TempMap, "HashMap");
        arq.escritor(TempMap, hashMap.adicionar(palavrasLeipzingMap));
        arq.escritor(TempMap, hashMap.buscar(palavrasBDMap));
        arq.escritor(TempMap, hashMap.deletar(palavrasBDMap));*/

        /*arq.escritor(TempMap, "LinkedHashMap");
        arq.escritor(TempMap, linkedHashMap.adicionar(palavrasLeipzingMap));
        arq.escritor(TempMap, linkedHashMap.buscar(palavrasBDMap));
        arq.escritor(TempMap, linkedHashMap.deletar(palavrasBDMap));*/

        /*arq.escritor(TempMap, "TreeMap");
        arq.escritor(TempMap, treeMap.adicionar(palavrasLeipzingMap));
        arq.escritor(TempMap, treeMap.buscar(palavrasBDMap));
        arq.escritor(TempMap, treeMap.deletar(palavrasBDMap));*/


    }
}
