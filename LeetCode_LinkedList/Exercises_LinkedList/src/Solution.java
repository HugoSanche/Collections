public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode newList=new ListNode();
        while(l1 !=null || l2!=null){
            int result=carry;
            if (l1 !=null){
                result+=l1.val;
                l1=l1.next;
            }
            if (l2 !=null){
                result+=l2.val;
                l2=l2.next;
            }
            newList.val=result%10;
            carry=result/10;
            newList=newList.next;
        }
        return newList;
    }
}
