public class RemoveListElements {
    public ListNode removeElements(ListNode head, int val) {
       ListNode tempNode=head, prev=head;


        while (head.val==val && head!=null){
           // prev=head.next;
            head.next=null;
            head=prev.next;
            prev=prev.next;
        }

        head=head.next;
        while(head!=null) {
            if (head.val == val) {
                prev.next = head.next;
                head.next = null;
                head = prev.next;
            }
            if (head!=null) {
                if (head.val != val) {
                    head = head.next;
                    prev = prev.next;
                }
            }
        }
        return tempNode;
    }
}
