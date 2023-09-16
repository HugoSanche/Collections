public class Test_ReverseLinkedList {
    public static void main(String[] args) {
        ReverseLinkedList solution=new ReverseLinkedList();
        ListNode node1=new ListNode(1);
        ListNode tempNode1=node1;
        node1.next=new ListNode(2);
        node1=node1.next;
        node1.next=new ListNode(3);
        node1=node1.next;
        node1.next=new ListNode(4);
        node1=node1.next;
        node1.next=new ListNode(5);
       // node1=node1.next;

        ListNode.transversal(tempNode1);
        ListNode result=solution.reverseList2(tempNode1);
        ListNode.transversal(result);
    }
}
