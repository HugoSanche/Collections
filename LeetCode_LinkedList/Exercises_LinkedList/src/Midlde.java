public class Midlde {
    public ListNode middleNode(ListNode head) {
        ListNode current=head;
        double contNodes=0;
        while(head!=null){
            contNodes++;
            head=head.next;
        }
        double middleNumber=0;
        if(contNodes%2==0){
            middleNumber=(contNodes/2);
        }else {
            contNodes=contNodes/2;
            middleNumber =  Math.ceil(contNodes)-1;
        }
        while (middleNumber>0){
              middleNumber-=1;
              current=current.next;
        }
        return current;
    }
    public ListNode middleNode2(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
