import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        //El set lo podrias ocupar cuando trabajes con conjuntos de datos
        //set its faster
        //si no quieres duplicados usa set

        //Symetrys addAll .- contiene los mismos registros
        //Asymetric retainAll .- contiene los diferentes registros
        Set<Integer> squares=new HashSet<>();
        Set<Integer> cubes=new HashSet<>();

        for(int i=1;i<=100;i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }
        System.out.println("There are "+squares.size()+" squares and "+cubes.size()+" cubes.");

        Set<Integer> union =new HashSet<>(squares);
        union.addAll(cubes); //save the same elements
        System.out.println("Unions contains "+union.size()+" elements");

        Set<Integer> intersection=new HashSet<>(squares);
        intersection.retainAll(cubes); //save the differents elements
        System.out.println("Intersections contains "+intersection.size()+" elements.");
        for (int i: intersection){
            System.out.println(i+" is the Square of "+Math.sqrt(i)+" and the cube of "+Math.cbrt(i));
        }
        Set<String> words=new HashSet<>();
        String sentence="One day i will be a java developer";
        String[]   arrayWord=sentence.split(" ");
        words.addAll(Arrays.asList(arrayWord));
        for (String s:words) {
            System.out.println(s);
        }

        Set<String> nature=new HashSet<>();
        Set<String> religion=new HashSet<>();
        String[] natureWords={"A","B","C", "D","E","F"};
        nature.addAll(Arrays.asList(natureWords));

        String[]  religionWords={"E", "F","X", "Y","Z"};
        religion.addAll(Arrays.asList(religionWords));

        System.out.println("Nature - religion ");
        Set<String> diff1=new HashSet<>(nature);
        diff1.removeAll(religion);
        print(diff1);

        System.out.println("Religion - nature");
        Set<String> diff2=new HashSet<>(religion);
        diff2.removeAll(nature);
        print(diff2);

        System.out.println("-------------------------------------------------------");
        Set<String> unionTest=new HashSet<>(nature);
        unionTest.addAll(religion);
        print(unionTest);

        Set<String> intersectionTest=new HashSet<>(nature);
        intersectionTest.retainAll(religion);
        print(intersectionTest);
        System.out.println("-------------------------------------------------------");

        System.out.println("Symmetric difference");
        unionTest.removeAll(intersectionTest);
        print(unionTest);

        if(nature.containsAll(religion)){
            System.out.println("Religion is a subset of nature");
        }
        if(nature.containsAll(intersectionTest)){
            System.out.println("interception is a subset of nature");
        }
        if(religion.containsAll(intersectionTest)){
            System.out.println("interception is a subset of religion");
        }

    }
    public static void print(Set<String> set){
        System.out.print("\t");
        for (String s:set){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}




