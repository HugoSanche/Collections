

/*Example 1:

Input: operations = ["--X","X++","X++"]
Output: 1
Explanation: The operations are performed as follows:
Initially, X = 0.
--X: X is decremented by 1, X =  0 - 1 = -1.
X++: X is incremented by 1, X = -1 + 1 =  0.
X++: X is incremented by 1, X =  0 + 1 =  1.
Example 2:

Input: operations = ["++X","++X","X++"]
Output: 3
Explanation: The operations are performed as follows:
Initially, X = 0.
++X: X is incremented by 1, X = 0 + 1 = 1.
++X: X is incremented by 1, X = 1 + 1 = 2.
X++: X is incremented by 1, X = 2 + 1 = 3.
Example 3:

Input: operations = ["X++","++X","--X","X--"]
Output: 0
Explanation: The operations are performed as follows:
Initially, X = 0.
X++: X is incremented by 1, X = 0 + 1 = 1.
++X: X is incremented by 1, X = 1 + 1 = 2.
--X: X is decremented by 1, X = 2 - 1 = 1.
X--: X is decremented by 1, X = 1 - 1 = 0.
*
*
* */

public class FinalValue {
    public static void main(String[] args) {

        String[] operations = {"X++","++X","--X","X--"};
        int result=finalValueAfterOperations3(operations);
        System.out.println(result);
    }
    public static int finalValueAfterOperations(String[] operations) {
            int x=0;
            for (int i=0; i<operations.length; i++){
                if(operations[i].contains("++")){
                    x++;
                }else{
                    x--;
                }
            }
            return x;
    }
    public static int finalValueAfterOperations2(String[] operations) {
        int x=0;
        for(var operation:operations){
            if(operation.contains("++")){
                x++;
            }else{
                x--;
            }
        }
        return x;
    }
    public static int finalValueAfterOperations3(String[] operations) {
        int x = 0;
        for(String o : operations){

            x += (44 - o.charAt(1));

        }
        return x;
    }
}
