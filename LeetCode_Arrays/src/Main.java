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

        //Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
        // Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.
        System.out.println("*********");
        int[] nums = {1, 1, 2,3,4,4,5,6,7,8,8};
        int resremove=RemoveDuplicatesSortedArray.removeDuplicates(nums);
        System.out.println(resremove);

        System.out.println("*********");
        //You are given an array prices where prices[i] is the price of a given stock on the ith day.
        // You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future
        // to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

        int[] prices = {7,2 , 5, 3, 6, 4,2,9};
        int resPrices=MaxProfit.maxProfit3(prices);
        System.out.println(resPrices);

        System.out.println("*********");
        //Max Product of Two Integers
        //How to find maximum product of two integers in the array where all elements are positive.
        //Example
        //int[] intArray = {10,20,30,40,50};
        //maxProduct(intArray) // (40,50)
        int[] intArray = {10,20,30,40,50};
        String pairs=MaxProduct.maxProduct(intArray);
        System.out.println(pairs);

        //IsUnique / Contains Duplicate - LeetCode 217
        //Write a program to check if an array is unique or not.
        //
        //Example
        //
        //int[] intArray = {1,2,3,4,5,6};
        //isUnique(intArray) // true
        System.out.println("*********");
        int[] isUnique = {1,80,10,30,5,40,50,80};
        boolean bandera=IsUnique.isUnique(isUnique);
        System.out.println(bandera);

        //Permutation
        //Your are given two integer arrays. Write a program to check if they are permutation of each other.
        //
        //Example
        //
        //int[] array1 = {1,2,3,4,5};
        //int[] array2 = {5,1,2,3,4};
        //permutation(array1, array2)
        //Output
        //
        //true
        System.out.println("******************************");
        int[] array1 = {1,2,3,4,5,7};
        int[] array2 = {5,1,2,3,4,7};
boolean permutation=Permutation.permutation(array1,array2);
        System.out.println(permutation);

        //Rotate Matrix
        //Given an image represented by an NxN matrix write a method to rotate the image by 90 degrees.
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(matrix));
        RotateMatriz.rotateMatrix(matrix);
    }
}