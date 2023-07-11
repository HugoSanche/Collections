import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {

    //time Complexity: O(N)
    //Space Complexity O(1)
    public static void main(String[] args) {
        ArrayList<String> myArray=new ArrayList<>(Arrays.asList("A","B","C","D","E","F"));
        myArray.remove("D");
        System.out.println(myArray);

    }
}
