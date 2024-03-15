package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    }
}
