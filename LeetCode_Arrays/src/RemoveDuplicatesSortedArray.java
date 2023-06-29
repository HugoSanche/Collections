public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        //TODO
        int n=nums.length;
        int cont=0;
        for(int i=0;i<n-1;i++){
            if (nums[i]==nums[i+1]){
                cont++;
            }
        }
        return n-cont;
    }

}
