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

        int[] myArray = {84,85,86,87,85,90,85,83,23,45,88,1,2,89,91};
        int[] top=FindTopTwoScores.findTopTwoScores(myArray);
        System.out.println(Arrays.toString(top));

        System.out.println("*********");
        int[] myArray2 = {1,2,3,4,5,6,7,8,9,10,11,13};
        int res=FindMissingNumberInArray.findMissingNumberInArray2(myArray2);
        System.out.println(res);

        System.out.println("*********");
        int[] myArray3={1, 1, 2, 2, 3, 4, 5};
        int[] resRemoveDuplicates=RemoveDuplicates.removeDuplicates(myArray3);
        System.out.println(Arrays.toString(resRemoveDuplicates));

    }
}