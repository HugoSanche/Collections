import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

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
        String[] motivateWords={"all","days","woud", "be","the","best","for","you"};
        nature.addAll(Arrays.asList(motivateWords));

        String[]  religionWords={"good", "is","the", "creator","of","the","universe"};
        religion.addAll(Arrays.asList(religionWords));
    }
}
