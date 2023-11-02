//1832. Check if the Sentence Is Pangram
//Easy
//2.6K
//50
//Companies
//A pangram is a sentence where every letter of the English alphabet appears at least once.
//
//Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
//
//
//
//Example 1:
//
//Input: sentence = 'thequickbrownfoxjumpsoverthelazydog'
//Output: true
//Explanation: sentence contains at least one of every letter of the English alphabet.
//Example 2:
//
//Input: sentence = 'leetcode'
//Output: false


import java.util.HashMap;

public class IsPangram {
    public static void main(String[] args) {
        String sentence ="leetcode";


        boolean result= checkIfPangram2(sentence);
        System.out.println(result);

    }
    public static boolean checkIfPangram(String sentence) {
        HashMap<Character,Boolean> alphabet=new HashMap<>();
        for (char c='a'; c<='z'; c++ ){
            alphabet.put(c,false);
        }

        for (int i=0; i<sentence.length();i++){
           if (alphabet.get(sentence.charAt(i))) {
               alphabet.put(sentence.charAt(i), true);
           }
        }
        System.out.println(alphabet);
        if (alphabet.containsValue(false)){
            return false;
        }else {
            return true;
        }
    }
    public static boolean checkIfPangram2(String sentence) {
        if (sentence.length()<26){
            return false;
        }
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        for (int i=0; i<alphabet.length();i++){
            if (sentence.indexOf(alphabet.charAt(i))==-1){
                return false;
            }
        }
    return true;
    }
}
