import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaximumTwin {
    public int pairSum(ListNode head) {
        List<Integer> myList=new ArrayList<>();
        while (head!=null){
            myList.add(head.val);
            head=head.next;
        }
        int j=myList.size()-1;
      // int[] values= new int[myList.size()-1];
        List<Integer> values=new ArrayList<>();
        for (int i=0; i<myList.size()/2; i++ ){
                values.add(myList.get(i)+myList.get(j));
                j--;
        }
        return values.stream().max(Comparator.naturalOrder()).stream().findFirst().orElse(-1);
    }
    public int pairSum2(ListNode head) {
        ListNode slow=head, faster=head;
        int maxValue=0;
        ListNode prev=null, nextNode=null;

        while (faster!=null && faster.next!=null){
            slow=slow.next;
            faster=faster.next.next;
        }
        while (slow!=null){
            nextNode=slow.next;
            slow.next=prev;
            prev=slow;
            slow=nextNode;
        }
        while(prev!=null){
            maxValue=Math.max(maxValue,head.val+ prev.val);
            head=head.next;
            prev=prev.next;
        }
    return maxValue;
    }
}
