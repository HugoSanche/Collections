import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        int n=arr.length;
        int[] newArray=new int [n];
        int index=0;
        for (int i=0; i<n; i++){
            boolean bandera=false;
            for(int j=i+1; j<n; j++){
                if (arr[i]==arr[j]){
                    bandera=true;
                    break;
                }
            }
            if(!bandera){
                newArray[index++]=arr[i];
            }
        }
        return Arrays.copyOf(newArray,index);
    }
}
