//1662. Check If Two String Arrays are Equivalent
//Easy
//2.3K
//178
//Companies
//Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
//
//A string is represented by an array if the array elements concatenated in order forms the string.
//
//
//
//Example 1:
//
//Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
//Output: true
//Explanation:
//word1 represents string "ab" + "c" -> "abc"
//word2 represents string "a" + "bc" -> "abc"
//The strings are the same, so return true.
//Example 2:
//
//Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
//Output: false
//Example 3:
//
//Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
//Output: true
//

public class IfTwoStringArraysareEquivalent {

    public static void main(String[] args) {
        String[] word1={"ab", "c"};
        String[] word2={"a", "bc"};

        boolean result=arrayStringsAreEqual2(word1,word2);
        System.out.println(result);

    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder allWord1 =new StringBuilder();
        StringBuilder allWord2=new StringBuilder();
        for (String string:word1){
            allWord1.append(string);
        }
        for (String string:word2){
            allWord2.append(string);
        }
       boolean equivalent=allWord1.toString().contentEquals(allWord2);
        return equivalent;

    }
    public static boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        String allWord1=String.join("",word1);
        String allword2=String.join("",word2);

        boolean equivalent=allWord1.equals(allword2);

        return equivalent;

    }
}
