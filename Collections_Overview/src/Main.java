import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
      //  List<String> list= new ArrayList<>();
        //Collection<String> list= new TreeSet<>();
        Collection<String> list= new HashSet<>();

        String[] names={"Hugo","Veronica","Adrian","Pedro"};
        list.addAll(Arrays.asList(names));
        list.add("Georgina");
        list.addAll(Arrays.asList("Gary","Guillermo","German"));
        System.out.println(list);
        System.out.println(list.contains("Guillermo"));
        list.removeIf(s -> s.charAt(0)=='G');
        System.out.println(list);
        System.out.println(list.contains("Guillermo"));
        //list.sort();
    }
}