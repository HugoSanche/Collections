//1480. Running Sum of 1d Array
//Easy
//7.3K
//326
//Companies
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
//Example 2:
//
//Input: nums = [1,1,1,1,1]
//Output: [1,2,3,4,5]
//Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
//Example 3:
//
//Input: nums = [3,1,2,10,1]
//Output: [3,4,6,16,17]
//

public class RunningSum {
    public static void main(String[] args) {
        int[] array={3,1,2,10,1};
        int [] result=runningSum(array);
        for(var x:result){
            System.out.println(x);
        }
    }
    public static  int[] runningSum(int[] nums) {
        int sum=0;
        int prev=nums[0];
        for (int i=1;i<nums.length; i++){
            nums[i-1]=prev;
            sum=prev+nums[i];
            prev=sum;
            nums[i]=sum;
        }
        return nums;
    }
}
