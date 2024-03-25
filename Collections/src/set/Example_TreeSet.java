package set;

import java.util.Set;
import java.util.TreeSet;

public class Example_TreeSet {
    public static void main(String[] args) {
        Set<String> names=new TreeSet<>();
        names.add("Hugo");
        names.add("Karina");
        names.add("Pedro");
        names.add("Lizeth");
        names.add("Joel");
        //names.add(null);
        System.out.println(names);

        Set<Integer> numeros=new TreeSet<>();
        numeros.add(50);
        numeros.add(30);
        numeros.add(80);
        numeros.add(10);
        numeros.add(70);
        System.out.println(numeros);

        System.out.println("*************************************************");
        TreeSet<Integer> treeNumeros=new TreeSet<>();
        numeros.add(50);
        numeros.add(30);
        numeros.add(80);
        numeros.add(10);
        numeros.add(70);
        System.out.println(treeNumeros);

        System.out.println(treeNumeros.floor(30));
        System.out.println(treeNumeros.lower(30));
        System.out.println(treeNumeros.higher(30));
        System.out.println(treeNumeros.ceiling(30));
    }
}
