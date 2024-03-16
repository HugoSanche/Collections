package set;

import java.util.*;

public class Other_Example_Hashset {
    public static void main(String[] args) {
        List<Integer> numeros=new ArrayList<>();

        numeros.add(5);
        numeros.add(3);
        numeros.add(8);
        numeros.add(3);
        numeros.add(9);
        numeros.add(5);
        System.out.println(numeros);

        System.out.println("**************************************");
        Set<Integer> setNumbers=new HashSet<>(numeros);
        System.out.println(setNumbers);

        System.out.println("*************************************************");
        //al implementar SortedSet a setNumbers (HashSet) los ordena en forma natural
        SortedSet<Integer> sortedNumbers=new TreeSet<>(setNumbers);
        System.out.println(sortedNumbers);

        System.out.println("*************************************************");
        //al implementar SortedSet a numeros (ArrayList) los ordena en forma natural
        SortedSet<Integer> sortedNumbersb=new TreeSet<>(numeros);
        System.out.println(sortedNumbersb);

    }
}
