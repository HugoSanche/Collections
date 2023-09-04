public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int carry=0;
            ListNode temp= new ListNode(0);
            ListNode newList=temp;
            while(l1 !=null || l2!=null){
                System.out.println("l1 value "+l1.val);

                int result=carry;
                if (l1 !=null){
                    result+=l1.val;
                    l1=l1.next;
                }
                if (l2 !=null){
                    result+=l2.val;
                    l2=l2.next;
                }
              //  System.out.println("l1 value "+l1.val);

                System.out.println("add "+result%10);
                newList.next= new ListNode(result%10);
                newList=newList.next;
                carry=result/10;

            }
            return temp.next;
        }
}
