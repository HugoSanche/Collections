
//1528. Shuffle String
//Easy
//2.6K
//460
//Companies
//You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
//
//Return the shuffled string.

//Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
//Output: "leetcode"
//Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
//Example 2:
//
//Input: s = "abc", indices = [0,1,2]
//Output: "abc"
//Explanation: After shuffling, each character remains in its position.
//


import java.util.HashMap;

public class ShuffleString {
    public static void main(String[] args) {
        String s="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};

      //  Arrays.sort(indices);
        String result= restoreString2(s,indices);
        System.out.println(result);
    }
    public static String restoreString(String s, int[] indices) {
        StringBuilder word= new StringBuilder();
        HashMap<Integer,Character> data=new HashMap<>();

        for (int i=0; i<s.length(); i++){
                data.put(indices[i],s.charAt(i));
        }
        for (int i=0; i<s.length(); i++){
            word.append(data.get(i));
        }
        return word.toString();
    }
    public static String restoreString2(String s, int[] indices) {
        char[] c= new char[indices.length];

        StringBuilder word= new StringBuilder();
        for (int i=0;i<indices.length; i++){
             c[indices[i]]=s.charAt(i);
        }
        word.append(c);

        return word.toString();
    }

}
