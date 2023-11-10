//2828. Check if a String Is an Acronym of Words
//Easy
//248
//7
//Companies
//Given an array of strings words and a string s, determine if s is an acronym of words.
//
//The string s is considered an acronym of words if it can be formed by concatenating the first character of each string in words in order. For example, "ab" can be formed from ["apple", "banana"], but it can't be formed from ["bear", "aardvark"].
//
//Return true if s is an acronym of words, and false otherwise.
//
//
//
//Example 1:
//
//Input: words = ["alice","bob","charlie"], s = "abc"
//Output: true
//Explanation: The first character in the words "alice", "bob", and "charlie" are 'a', 'b', and 'c', respectively. Hence, s = "abc" is the acronym.
//Example 2:
//
//Input: words = ["an","apple"], s = "a"
//Output: false
//Explanation: The first character in the words "an" and "apple" are 'a' and 'a', respectively.
//The acronym formed by concatenating these characters is "aa".
//Hence, s = "a" is not the acronym.
//Example 3:
//
//Input: words = ["never","gonna","give","up","on","you"], s = "ngguoy"
//Output: true
//Explanation: By concatenating the first character of the words in the array, we get the string "ngguoy".
//Hence, s = "ngguoy" is the acronym.

import java.util.ArrayList;
import java.util.List;

public class AcronymOfWords {

    public static void main(String[] args) {
        boolean rest=false;
        List<String> words= new ArrayList<>();
        words.add("alice");
        words.add("bob");
       words.add("charlie");

        String s= "abc";
        rest=isAcronym2(words,s);
        System.out.println(rest);
    }
    public static boolean isAcronym(List<String> words, String s) {

        StringBuilder stringBuilder=new StringBuilder();
        for (String word: words){
            //System.out.println(word.charAt(0));
            stringBuilder.append(word.charAt(0));
        }

      if (stringBuilder.toString().compareTo(s)==0){
          return true;
      }else{
          return false;
      }
    }
    public static boolean isAcronym2(List<String> words, String s) {

   if(words.size()!=s.length()){
       return false;
   }
     for (int i=0;i<words.size();i++){
         if (words.get(i).charAt(0)!=s.charAt(i)){
              return false;
         }
     }
     return true;
    }

}
