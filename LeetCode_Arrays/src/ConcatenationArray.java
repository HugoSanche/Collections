/*
 Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
 */
public class ConcatenationArray {
    public static void main(String[] args) {
        int[] array={1,3,2,1};
      int[] concatenation=ConcatenationArray.getConcatenation(array);
      for(var r:concatenation){
          System.out.println(r);
      }


    }
    public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] result=new int[n*2];
        for(int i=0;i<n;i++){
            result[i]=nums[i];
            result[n+i]=nums[i];
        }
        return result;
    }
}
