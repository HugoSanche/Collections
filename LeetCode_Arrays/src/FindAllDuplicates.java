import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] array={4,3,2,7,8,2,3,1};
        List<Integer> result= findDuplicates(array);
        System.out.println(result);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        final List<Integer> duplicates = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            final int n = Math.abs(nums[i]);
            if(nums[n - 1] < 0) {
                duplicates.add(n);
            } else {
                nums[n - 1] *= -1;
            }
        }
        return duplicates;
    }
}
