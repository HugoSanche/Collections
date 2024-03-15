package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//No tiene una secuencia de orden
//no se puede acceder por el indice
//no permiten valores duplicados
//For HashSet, the add(), remove() and contains() operations cost constant O(1) time thanks to the internal HashMap implementation.
public class Example_Hashset {
    public static void main(String[] args) {
        Set<String> names=new HashSet<>();
        names.add("Hugo");
        names.add("Karina");
        names.add("Pedro");
        names.add("Lizeth");
        names.add("Joel");
        System.out.println(names);

        names.remove(0); //no tiene un indice predeterminado
        System.out.println(names);

        names.remove("Hugo");
        System.out.println(names);

        //Una forma de iterar los elementos
        for(String name:names){
            System.out.println(name);
        }
        System.out.println("******************************************************");
        //otra forma de iterar los elementos
        names.forEach(System.out::println);

        //otra forma de iterar los elementos
        Iterator<String> iterator=names.iterator();
        System.out.println("******************************************************");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
