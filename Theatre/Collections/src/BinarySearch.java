import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int a,b;
        a=25;b=2;
        int sum =a*b;
        System.out.println(sum);
        Integer[] values={8,4,9,1,2,5};
        //{1,2,4,5,8,9}
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
        //search(values,1);
        System.out.println(search(values,9));
    }
    public static int search(Integer[] array, int value){
    int left=0;
    int right=array.length-1;
    while (left<=right){
        int mid=(left+right)/2;
        if (value== array[mid]){
            return mid;
        }
        if (value<array[mid])
            right=mid-1;
        else
            left=mid+1;
    }
    return -1;
    }
}
