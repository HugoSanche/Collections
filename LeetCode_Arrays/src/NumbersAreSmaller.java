public class NumbersAreSmaller {
    public static void main(String[] args) {
        int[]nums={7,7,7,7};
        int[] result=smallerNumbersThanCurrent(nums);
        for(var x:result){
            System.out.println(x);
        }
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int cont=0;
        int sum=0;
        int[] result=new int[nums.length];
        while(cont< nums.length){
            for(int i=0; i<nums.length; i++){
                if (nums[cont]>nums[i]){
                    sum++;
                }
            }
            result[cont]=sum;
            sum=0;
            cont++;
        }
        return result;
    }
}
