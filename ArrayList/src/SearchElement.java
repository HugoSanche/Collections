import java.util.ArrayList;
import java.util.Arrays;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<String> myArray=new ArrayList<>(Arrays.asList("A","B","C","D","E","F"));
        for(String array:myArray){
            if(array.equals("E")){
                System.out.println("The element is found");
                break;
            }
        }

        int index=myArray.indexOf("X");
        if (index>0){
            System.out.println("The element found in the index "+index);
        }
        else{
            System.out.println("The element not found");
        }

    }
}
