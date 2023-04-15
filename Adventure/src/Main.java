import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static HashMap<Integer,Location> locations=new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExist("E",3);
        locations.get(1).addExist("S",4);
        locations.get(1).addExist("W",2);
        locations.get(1).addExist("N",5);
        //locations.get(1).addExist("Q",0);

        locations.get(3).addExist("W",1);
        //locations.get(3).addExist("Q",0);

        locations.get(4).addExist("N",1);
        locations.get(4).addExist("W",2);
        //locations.get(4).addExist("Q",0);

        locations.get(2).addExist("N",5);
        //locations.get(2).addExist("Q",0);

        locations.get(5).addExist("S",1);
        locations.get(5).addExist("W",2);
        //locations.get(5).addExist("Q",0);

        int loc=1;
        while (true){
            System.out.println(locations.get(loc).getDescription());
            if (loc==0){
                break;
            }
            Map<String, Integer> exits=locations.get(loc).getExists();
            System.out.println("Exists available");
            for (String e:exits.keySet()){
                System.out.print(e+", ");
            }
            System.out.println();

            String destination =scanner.nextLine().toUpperCase();
            if (exits.containsKey(destination)){
                loc=exits.get(destination);
            }else{
                System.out.println("You cannot go to that destination");
            }
        }
    }
}