package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Example_ArrayList {
    public static void main(String[] args) {

        //Implementa list interface
        //facil acceso a los elementos
        //para agregar o eliminar es muy lento. Ya que tiene que hacer una copia del arreglo para agregar o eliminar
        //Seria util para listas que no cambian mucho y son mas para consulta
        //recuerda que hereda los metodos de la interface collection.- size(), add(), remove(),isEmpty(), contains(), containsAll()

        ArrayList<String> arrayList =new ArrayList<>();
        arrayList.add("Pedro");
        arrayList.add("Hugo");
        arrayList.add("Nadia");
        arrayList.add("Veronica");

        System.out.println(arrayList);

        System.out.println("*****************************************************");
        for (String names: arrayList){
            System.out.println(names);
        }

        System.out.println("*****************************************************");
        Iterator<String> iterator=arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*****************************************************");


        System.out.println(arrayList.contains("Nadia"));

        arrayList.remove(0);
        System.out.println(arrayList);

        System.out.println("El tamaño es de: "+arrayList.size());

        //Example of containsAll

        ArrayList<String> otherNames=new ArrayList<>();

        otherNames.add("Veronica");
        otherNames.add("Nadia");
        otherNames.add("Hugo");

        System.out.println("\nLista 1 "+arrayList);
        System.out.println();

        System.out.println("Lista 2 "+otherNames);

        //Compara ambas listas
        System.out.println("\nLas listas son iguales; "+arrayList.containsAll(otherNames));

        //ordenando la lista.
        //Recuerda que la interface Collections tiene el metodo sort
        Collections.sort(otherNames);
        otherNames.forEach(a-> System.out.println(a));


        arrayList.clear();
        System.out.println(arrayList);
    }
}
