import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[]array={2,5,1,3,4,7};
        int[] result=shuffle2(array,3);
        System.out.println(Arrays.toString(result));
    }
    public static  int[] shuffle(int[] nums, int n) {
        int[] result=new int[n*2];
        for(int i=0;i<nums.length; i++){

            if (i%2==0){
                result[i]=nums[i/2];
            }else{
                n--;
                result[i]=nums[i+n];
            }
        }
        return result;
    }
    public static  int[] shuffle2(int[] nums, int n) {

        for(int i=0; i<n;i++){
            nums[n+i]=(nums[n+i]*1024)+nums[i];
        }
        System.out.println(Arrays.toString(nums));
       int index=0;
        for (int i=0;i<n; i++, index+=2){
                nums[index]=nums[n+i]%1024;
                nums[index+1]=nums[n+i]/1024;
        }
        return nums;
    }
}
