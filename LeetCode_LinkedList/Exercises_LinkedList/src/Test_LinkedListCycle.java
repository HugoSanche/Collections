public class Test_LinkedListCycle {
    public static void main(String[] args) {
        ListNode prev=null;
        ListNode node1=new ListNode(3);
        ListNode tempNode1=node1;
        node1.next=new ListNode(2);
        prev=node1.next;

        node1=node1.next;
        node1.next=new ListNode(0);
        node1=node1.next;
        node1.next=new ListNode(-4);
        node1=node1.next;
        node1.next=prev;

      //  ListNode.transversal(tempNode1);
       LinkedListCycle linkedListCycle=new LinkedListCycle();

        boolean result=linkedListCycle.hasCycle(tempNode1);
        System.out.println(result);
    }
}
