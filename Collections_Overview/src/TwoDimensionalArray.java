public class TwoDimensionalArray {
    int[][] twoDimensionalArray;

    public TwoDimensionalArray(int numOfRows, int numOfColum) {
        twoDimensionalArray = new int[numOfRows][numOfColum];
        for (int row = 0; row < twoDimensionalArray.length; row++) {
            for (int col = 0; col < twoDimensionalArray.length; col++) {
                twoDimensionalArray[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    //insert value from given row an column
    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if (twoDimensionalArray[row][col] == Integer.MIN_VALUE) {
                twoDimensionalArray[row][col] = value;
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2d array");
        }
    }
    //access value from given index
    public void accessValue(int row, int col){
        System.out.println("\n Accesing row# "+row+" col "+col);
        try{
            System.out.println(twoDimensionalArray[row][col]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2d array");
        }
    }

    //transverse two array
    public void transerve2DArray(){
        for (int row=0; row<twoDimensionalArray.length;row++  ){
            for (int col=0; col<twoDimensionalArray.length; col++){
                System.out.printf("%12d",twoDimensionalArray[row][col]);
            }
            System.out.println();
        }
    }
    //search a single value from Array
    public void searchingValue(int value){
        for (int row=0; row<twoDimensionalArray.length;row++  ){
            for (int col=0; col<twoDimensionalArray.length; col++){
                if (twoDimensionalArray[row][col]==value){
                    System.out.println("Element found in row "+ row+" col "+col);
                    return;
                }

            }
        }
        System.out.println("Value not found");
    }
    //Deleting value from array
    public void deletingValueFromArray(int row, int col){
        try{
            System.out.println("Success deleted "+twoDimensionalArray[row][col]);
            twoDimensionalArray[row][col]=Integer.MIN_VALUE;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2d array "+e);
        }
    }
}

