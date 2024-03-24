package map;

import java.util.Map;
import java.util.TreeMap;

//Mantiene el orden natural de los datos
//no se permiten null
public class Example_TreeMap {
    public static void main(String[] args) {
        Map<String,Integer> treeMap=new TreeMap<>();

        treeMap.put("Hugo",9999);
        treeMap.put("Daniela",2222);
        treeMap.put("Alberto",3333);
        treeMap.put("Veronica",7777);

        System.out.println(treeMap);

        System.out.println(treeMap.get("Veronica"));


        for(Map.Entry<String, Integer> set:treeMap.entrySet()){
            System.out.println("Key: "+set.getKey()+" Value: "+set.getValue());
        }

        System.out.println(treeMap.containsKey("Daniela"));

        System.out.println("*********************************************************************");
        //treeMap.put(null,8888); //no se permiten null
        System.out.println(treeMap);

        treeMap.putIfAbsent("Hugo",141414);//solamente pone si no existe
        System.out.println(treeMap);
    }
}
