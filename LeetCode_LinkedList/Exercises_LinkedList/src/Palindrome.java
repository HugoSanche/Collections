import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return false;
        }
        List<Integer> numbers=new ArrayList<>();
        while (head!=null){
            numbers.add(head.val);
            head=head.next;
        }
        int j=0;
        for(int i=numbers.size()-1; i>=0;i--){
            if (numbers.get(i)!=numbers.get(j)){
                return false;
            }
            j++;
        }
        return true;
    }
}
