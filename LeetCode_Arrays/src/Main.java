import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] myArray2D= {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        //excercise sum diagonal
        int sum=sumDiagonal.sumDiagonalElements(myArray2D);
        System.out.println(sum);

        //exercise toptwoScores

        int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int[] top=FindTopTwoScores.findTopTwoScores(myArray);
        System.out.println(Arrays.toString(top));
    }
}