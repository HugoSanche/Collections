
//Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
//
//Given a balanced string s, split it into some number of substrings such that:
//
//Each substring is balanced.
//Return the maximum number of balanced strings you can obtain.
//
//
//
//Example 1:
//
//Input: s = "RLRRLLRLRL"
//Output: 4
//Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
//Example 2:
//
//Input: s = "RLRRRLLRLL"
//Output: 2
//Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
//Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.
//Example 3:
//
//Input: s = "LLLLRRRR"
//Output: 1
//Explanation: s can be split into "LLLLRRRR".
public class BalancedStrings {
    public static void main(String[] args) {
        String string ="LLLLRRRR";

        int result = balancedStringSplit(string);
        System.out.println(result);
    }

    public static int balancedStringSplit(String s) {
       // int x=0;
        int countR=0;
        int countL=0;
        int result=0;
//        while (x<s.length()){
//            if (s.charAt(x)=='R'){
//                countR++;
//            }
//            if (s.charAt(x)=='L'){
//                countL++;
//            }
//            if (countR==countL){
//                result++;
//            }
//            x++;
//        }
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='R'){
                countR++;
            }else{
                countL++;
            }

            if (countR==countL){
                result++;
            }
        }
        return result;
    }
}
