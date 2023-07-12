import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        Reverse reverse=new Reverse();
        int [] arrayNumbers={4,1,5,9,7,5};
        reverse.reverse(arrayNumbers);
    }
    public void reverse(int[] array){
        System.out.println(array.length);
        for (int i=0; i<array.length/2; i++){
            int other=array.length-i-1; //save the last index
            int temp=array[i]; //

            array[i]=array[other];
            array[other]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
