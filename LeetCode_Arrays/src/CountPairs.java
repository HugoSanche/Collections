import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountPairs {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(-6,2,5,-2,-7,-1,3);

        int result=countPairs2(nums,-2);
        System.out.println(result);
    }
    public static int countPairs(List<Integer> nums, int target) {
        int count=0;
       for(int i=0; i<nums.size(); i++){
           for(int j=i+1;j<nums.size();j++){
               if (nums.get(i)+nums.get(j)<target){
                    count++;
               }
           }
       }
       return count;
    }
    public static int countPairs2(List<Integer> nums, int target) {
        int n = nums.size();

        // Sort the List.
        Collections.sort(nums);

        // Initialize the number of pairs.
        int countPairs = 0;

        // Initialize the left and right pointers.
        int low = 0;
        int high = n - 1;
        nums.stream().forEach(System.out::println);
        // Iterate while the left pointer is less than the right pointer.
        while (low < high) {
            // Calculate the sum of the two elements.
            int sum = nums.get(low) + nums.get(high);

            // If the sum is less than the target, then increment the number of pairs.
            if (sum < target) {
                countPairs += high - low;
                low++;
            } else {
                // Otherwise, decrement the right pointer.
                high--;
            }
        }

        // Return the number of pairs.
        return countPairs;
    }
}
