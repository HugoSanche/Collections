public class RemoveListElements {
    public ListNode removeElements(ListNode head, int val) {
       ListNode prev=head,tempNode=head;
        while (head.val==val && head!=null){
            head=head.next;
            prev.next=null;
            prev=head;
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
