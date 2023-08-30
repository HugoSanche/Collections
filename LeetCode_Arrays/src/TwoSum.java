import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[]array={2,5,5,11};
        int[] res=twoSum(array,10);
        System.out.println(Arrays.toString(res));;
    }
    public static  int[] twoSum(int[] nums, int target) {
        // TODO
        for (int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if((nums[i]+nums[j])==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }

}
