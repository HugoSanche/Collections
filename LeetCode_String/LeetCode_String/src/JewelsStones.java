import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JewelsStones {
    public static void main(String[] args) {
        String jewels="aA";
        String stones="aAAbbbb";

      // int num= numJewelsInStones(jewels,stones);
       // System.out.println(num);


    }

    public static  int numJewelsInStones(String jewels, String stones) {
        List<String> strings=new ArrayList<>();
        int cont=0;
        for(int i=0; i<jewels.length(); i++){
            strings= Arrays.asList(stones.split(""));

          //  strings.stream().filter().;
            System.out.println(jewels.charAt(i));
            if (strings.contains("a")){
                cont++;
            }
        }
        return cont;
    }
}
