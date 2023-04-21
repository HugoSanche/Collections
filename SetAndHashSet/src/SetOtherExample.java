import java.util.HashSet;
import java.util.Set;

public class SetOtherExample {
    public static void main(String[] args) {

        //remember its like set of sql
        Set<String> one = new HashSet<>();
        one.add("Hugo");
        one.add("Karina");
        one.add("Veronica");

        Set<String> two = new HashSet<>();
        two.add("Hugo");
        two.add("Janneth");
        two.add("Veronica");


        //we wanted to return a set that was symmetric, we would use retainAll:
        Set<String> intersection = new HashSet<>(one);
        intersection.retainAll(two);
        System.out.println(intersection); // [Hugo, Veronica]

        //we wanted to return a set that was asymmetric, we would use removeAll:
        Set<String> difference = new HashSet<>(one);
        difference.removeAll(two);
        System.out.println(difference); // [Karina]

    }
}
