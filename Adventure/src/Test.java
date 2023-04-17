import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, String> example=new HashMap<String,String>();
        example.put("NORTH","N");
        example.put("EAST","E");
        example.put("WEST","W");
        example.put("SOUTH","S");

        String text="go SOUTH";
        String[] text2=text.split(" ");

        for (String s : text2){
            if (example.containsKey(s)){
                System.out.println("Lo encontre");
            }
        }
    }
}
