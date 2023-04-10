import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list =new ArrayList<Person>(List.of(new Person("Hugo","Baltazar"),
                new Person("Pedro", "Paramo"),
                new Person("Veronica", "Perez"),
                new Person("Mayte", "Sanchez"),
                new Person("Nallely","Balcazar")
                ));
        Collections.sort(list);
        System.out.println(list);
    }
}