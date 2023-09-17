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
    public boolean isPalindrome2(ListNode head) {
        ListNode slow=head, faster=head,prev,next;

        while(faster!=null && faster.next!=null){
            slow=slow.next;
            faster=faster.next.next;
        }
      prev=null;

        while (slow!=null){
            next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        faster=head;
        while(prev!=null){
            if (prev.val!=faster.val){
                return false;
            }
            prev=prev.next;
            faster=faster.next;
        }

return true;
    }
    public boolean isPalindrome3(ListNode head) {
        ListNode slow=head, faster=head,prev,next;
        while(faster!=null && faster.next!=null){
            slow=slow.next;
            faster=faster.next.next;
        }
        prev=null;
        while(slow!=null){
            next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        faster=head;
        slow=prev;
        while (slow!=null){
            if(slow.val!=faster.val){
                return false;
            }
            slow=slow.next;
            faster=faster.next;
        }
        return true;
    }
}
