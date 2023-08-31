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
        int len = nums.length;
        System.out.println(Arrays.toString(nums));
        // to store the pair of numbers in right half of the original array
        for (int i = n; i < len; i++) {
            nums[i] = (nums[i] * 1024) + nums[i - n];
        }
        System.out.println(Arrays.toString(nums));
        int index = 0;
        // to retrive values from the pair of numbers and placing those retrieved value at their desired position
        for (int i = n; i < len; i++, index += 2) {
           // System.out.println(index);
           // System.out.println(nums[i]);
            nums[index] = nums[i] % 1024;
           // System.out.println(nums[index]);
            nums[index + 1] = nums[i] / 1024;
        }

        return nums;
    }
}
