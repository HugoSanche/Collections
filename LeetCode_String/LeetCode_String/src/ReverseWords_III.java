/*
Code
Testcase
Test Result
Test Result
557. Reverse Words in a String III
Easy
Topics
Companies
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.



Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "Mr Ding"
Output: "rM gniD"

* */
public class ReverseWords_III {
    public static void main(String[] args) {

        String s="Let's take LeetCode contest";

        String result=reverseWords2(s);
        System.out.println(result);
    }

    public static String reverseWords(String s) {
        String[] r=s.split(" ");
        StringBuilder result=new StringBuilder();
        for (String string: r){
            for (int i=string.length()-1; i>=0; i--){
                result.append(string.charAt(i));
            }
            result.append(" ");
        }
        return result.deleteCharAt(result.length()-1).toString();
    }
    public static String reverseWords2(String s) {
        String[] arrayWord=s.split(" ");
        StringBuilder result=new StringBuilder();
        for (String word: arrayWord){
            StringBuilder wordToReverse=new StringBuilder(word);
            wordToReverse.reverse().append(" ");
            result.append(wordToReverse);
        }
        return result.toString().trim();
    }
}
