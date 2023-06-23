public class TestTwoDimensionalArray {
    public static void main(String[] args) {
        //Step 1 - Declare
        int [][] int2DArray;

        //Step 2 - Instantiate
        int2DArray=new int[2][2];

        //Step 3 - Initialize

        int2DArray[0][0]=1;
        int2DArray[0][1]=2;
        int2DArray[1][0]=3;
        int2DArray[1][1]=4;
        //System.out.println(Arrays.deepToString(int2DArray));

        //All together .- Declare  Instantiate   initialize
        String s2DArray[][]={{"a","b"},{"c","d"}};
        //System.out.println(Arrays.deepToString(s2DArray));

        TwoDimensionalArray twoDArray=new TwoDimensionalArray(3,3);
        //insertValueInTheArray
        twoDArray.insertValueInTheArray(0,1,10);
        twoDArray.insertValueInTheArray(1,0,20);
        twoDArray.insertValueInTheArray(1,1,30);
        twoDArray.insertValueInTheArray(2,1,40);
        twoDArray.insertValueInTheArray(2,2,50);

        //System.out.println(Arrays.deepToString(twoDArray.twoDimensionalArray));
        twoDArray.accessValue(2,1);

        //print trancersal 2Darray
        twoDArray.transerve2DArray();
        twoDArray.searchingValue(60);

        //deleting value
        twoDArray.deletingValueFromArray(2,2);

    }
}
