public class MaxProduct {
    public static String maxProduct(int[] intArray) {
        // TODO
        int firstMax=0;
        int secondMax=0;
        String pairs;

        //intArray = {10,20,30,40,50};
        for (int i=0; i<intArray.length; i++){
            if (intArray[i]>firstMax){
                firstMax=intArray[i];
            }
            if(intArray[i]>secondMax && secondMax<firstMax){
                secondMax=intArray[i];
            }
        }
        pairs= Integer.toString(firstMax)  +","+Integer.toString(secondMax);
        return pairs;
    }
}
