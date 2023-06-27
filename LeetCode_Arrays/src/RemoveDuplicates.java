import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        int[] newArray=new int [arr.length-1];
        int index=0;
        //{1, 1, 2, 2, 3, 4, 5};
        for (int i=1; i<arr.length-1; i++){
            newArray[0]=arr[0];

            System.out.println("i "+i+" "+arr[i]+" "+arr[i+1]);
            if (arr[i]!=arr[i+1]){
                System.out.println("YYYYYYYYYY");
                System.out.println("X "+newArray[index]+" "+arr[i+1]);


                newArray[index]=arr[i+1];
                System.out.println(Arrays.toString(newArray));
                System.out.println("YYYYYYYYYY");
                index=index+1;
            }
        }
        return newArray;
    }
}
