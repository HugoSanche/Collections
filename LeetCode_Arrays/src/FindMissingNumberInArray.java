public class FindMissingNumberInArray {
    static int findMissingNumberInArray(int[] arr) {
        int val=0;
        for (int i=1; i<arr.length;i++){
            if ((arr[i-1]+1)!=arr[i]){
                val= i+1;
            }
        }
        return val;
    }

    //best solution
    static int findMissingNumberInArray2(int[] arr) {
        int n=arr.length+1;
        int total=n*(n+1)/2; //calculate the suma total from the array
        int sumArray=0;
        for (var sum:arr){
            sumArray+=sum;
        }
        return total-sumArray;
    }
}
