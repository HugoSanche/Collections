import java.util.LinkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode nodeTail=head;
        LinkedList<Integer> list=new LinkedList<>();

        while (head!=null){
            list.add(head.val);
            head=head.next;
        }
        ListNode nodeHead=nodeTail;
        for(int i=list.size()-1; i>=0;i--){
            nodeTail.val=list.get(i);
            nodeTail=nodeTail.next;
        }
        return nodeHead;
    }
    public ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while(current != null) {
            ListNode next = current.next; //guarda los nodos de adelante
            current.next = prev; //guarda el nodo actual
            prev = current; //guarda el nodo actual
            current = next; //guarda los nodos de adelante
        }
        return prev;
    }



    public ListNode reverseList3(ListNode head) {
       // ListNode current=head;
        ListNode prev=null;
        while (head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}

