package APP;

import File.*;
import java.io.IOException;
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

        //--------------------------------------------------------------------------------------------------------------------
        //List
        //--------------------------------------------------------------------------------------------------------------------
        //Set
        //--------------------------------------------------------------------------------------------------------------------
        //Map
        String[] palavras = {"Lisbon", "NASA", "Kyunghee", "Konkuk", "Sogang",
                "momentarily", "rubella", "vaccinations", "government", "Authorities"};

        classHashMap hashMap = new classHashMap();
        classLinkedHashMap linkedHashMap = new classLinkedHashMap();
        classTreeMap treeMap = new classTreeMap();

        hashMap.adicionar(palavras);
        linkedHashMap.adicionar(palavras);
        treeMap.adicionar(palavras);

        String[] palavrasParaBuscarEDeletar = {"Lisbon", "NASA", "Kyunghee", "Konkuk", "Sogang",
                "momentarily", "rubella", "vaccinations", "government", "Authorities"};

        boolean buscaDeletaHashMap = hashMap.buscar(palavrasParaBuscarEDeletar) && hashMap.deletar(palavrasParaBuscarEDeletar);
        boolean buscaDeletaLinkedHashMap = linkedHashMap.buscar(palavrasParaBuscarEDeletar) && linkedHashMap.deletar(palavrasParaBuscarEDeletar);
        boolean buscaDeletaTreeMap = treeMap.buscar(palavrasParaBuscarEDeletar) && treeMap.deletar(palavrasParaBuscarEDeletar);

        System.out.println("Buscar e Deletar em HashMap: " + buscaDeletaHashMap);
        System.out.println("Buscar e Deletar em LinkedHashMap: " + buscaDeletaLinkedHashMap);
        System.out.println("Buscar e Deletar em TreeMap: " + buscaDeletaTreeMap);


    }
}
