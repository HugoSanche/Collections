package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example_LinkedHashSet {
    public static void main(String[] args) {
        Set<String> names=new LinkedHashSet<>();

        names.add("Hugo");
        names.add("Karina");
        names.add("Pedro");
        names.add("Lizeth");
        names.add("Joel");
        names.add(null);

        for (String name:names){
            System.out.println(name); //print the same order to added
        }
        names.remove(null);
        System.out.println(names);

        System.out.println("---------------------------------------------------------");
        Iterator<String> iterator=names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*********************************************");
        names.forEach(a-> System.out.println(a));
    }

}
