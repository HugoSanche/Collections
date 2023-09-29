public class RemoveListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;

        while(cur.next != null) {
            if(cur.next.val == val) {
                cur.next = cur.next.next;
            }
            else
                cur = cur.next;
        }
        return dummy.next;
    }
    public ListNode removeElements2(ListNode head, int val) {
        ListNode fakeHead=new ListNode(-1);
        fakeHead.next=head;
        ListNode currentNode=fakeHead;
        while(currentNode.next!=null){
            if (currentNode.next.val==val){
                    currentNode.next=currentNode.next.next;
            }
            else{
                currentNode=currentNode.next;
            }
        }
        return fakeHead.next;
    }
}
