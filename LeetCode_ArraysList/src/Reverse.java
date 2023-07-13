import java.util.Arrays;

//Time Complexity O(N)
public class Reverse {
    public static void main(String[] args) {

        Reverse reverse=new Reverse();
        int [] arrayNumbers={4,1,5,9,7,5};
        reverse.reverse(arrayNumbers);
    }
    public void reverse(int[] array){//-------------------------------------->O(N/2)-------------->O(N)
        System.out.println(array.length);  //-------------------------------------->O(1)
        for (int i=0; i<array.length/2; i++){  //-------------------------------------->O(1)
            int other=array.length-i-1; //save the last index //-------------------------------------->O(1)
            int temp=array[i]; ////-------------------------------------->O(1)

            array[i]=array[other];//-------------------------------------->O(1)
            array[other]=temp;//-------------------------------------->O(1)
        }
        System.out.println(Arrays.toString(array));//-------------------------------------->O(N)
    }
}
