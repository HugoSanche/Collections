import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    enum Cardinal{NORTH,EAST,WEST,SOUTH }
    final private static HashMap<Integer,Location> locations=new HashMap<>();
    public static void main(String[] args) {
        // Change the program to allow players to type full words, or phrases, then move to the
        // correct location based upon their input.
        // The player should be able to type commands such as "Go West", "run South", or just "East"
        // and the program will move to the appropriate location if there is one.  As at present, an
        // attempt to move in an invalid direction should print a message and remain in the same place.
        //
        // Single letter commands (N, W, S, E, Q) should still be available.

        Scanner scanner=new Scanner(System.in);

        Map<String, Integer> tempExit=new HashMap<>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",tempExit));
        tempExit.put("W",2);
        tempExit.put("E",3);
        tempExit.put("S",4);
        tempExit.put("N",5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));

        tempExit=new HashMap<String,Integer>();
        tempExit.put("N",5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));

        tempExit=new HashMap<String,Integer>();
        tempExit.put("W",1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));


        tempExit=new HashMap<String,Integer>();
        tempExit.put("N",1);
        tempExit.put("W",2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));

        tempExit=new HashMap<String,Integer>();
        tempExit.put("S",1);
        tempExit.put("W",2);
        locations.put(5, new Location(5, "You are in the forest",tempExit));

        int loc=1;
        while (true){
            System.out.println(locations.get(loc).getDescription());
            //tempExit.remove("S");
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
            while (null == destination || destination.length() != 1) {
                System.out.println("Invaid Input, Please enter only one character : ");
                destination = scanner.nextLine().toUpperCase();
            }
            System.out.println(destination);

            String[] direcction=destination.split(" ");
            boolean bandera=false;

                for(String s:direcction){
                    if (s.equalsIgnoreCase("q")){
                        //System.exit(0);
                        loc=exits.get(String.valueOf(s.charAt(0)));
                        bandera=true;
                        //return;
                    }
                    for (var values : Cardinal.values()){
                        if (values.toString().equals(s) || values.toString().startsWith(String.valueOf(s.charAt(0)))){
                            loc=exits.get(String.valueOf(s.charAt(0)));
                            bandera=true;
                        }
                }
            }
            if (!bandera){
                System.out.println("You cannot go to that destination");
                System.out.println("You are in the same place");
            }
        }
    }
}