//Sorting the Sentence
//Easy
//2K
//67
//Companies
//A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
//
//A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
//
//For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
//Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
//
//
//
//Example 1:
//
//Input: s = "is2 sentence4 This1 a3"
//Output: "This is a sentence"
//Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
//Example 2:
//
//Input: s = "Myself2 Me1 I4 and3"
//Output: "Me Myself and I"
//Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.

public class SortingtheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";

        String result=sortSentence2(s);
        System.out.println(result);
    }

    public static String sortSentence2(String s) {
        String[] r=s.split(" ");

        String[] result=new String[r.length];
        for(int i=0;i<r.length; i++){
            result[(Integer.valueOf(r[i].substring(r[i].length()-1)))-1]=r[i].substring(0,r[i].length()-1);
        }
        return String.join(" ",result);
    }

    public static String sortSentence(String s) {
        String[] result=s.split(" ");
        String[] r=new String[result.length+1];

        for(int i=0; i<result.length; i++){
            Integer key=Integer.valueOf(result[i].substring(result[i].length()-1));
            r[key]=result[i].substring(0,result[i].length()-1);
        }
        StringBuilder builder=new StringBuilder();
        for(int i=1; i<r.length; i++){
            builder.append(r[i]);
            if(i<r.length-1){
                builder.append(" ");
            }

        }
        return builder.toString();
    }

}

