public class sumDiagonal {
    public static int sumDiagonalElements(int[][] array) {

        int sumDiagonal=0;
        for (int i=0; i<array.length; i++ ){
                sumDiagonal+=array[i][i];
            }
        return  sumDiagonal;
    }
}