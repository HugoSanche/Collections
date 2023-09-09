public class TestMiddle {
    public static void main(String[] args) {
        Midlde solution=new Midlde();
        ListNode node1=new ListNode(1);
       ListNode tempNode1=node1;
        node1.next=new ListNode(2);
        node1=node1.next;
        node1.next=new ListNode(3);
        node1=node1.next;
        node1.next=new ListNode(4);
        node1=node1.next;
        node1.next=new ListNode(5);
        node1=node1.next;
        node1.next=new ListNode(6);
        node1=node1.next;
        node1.next=new ListNode(7);
        node1=node1.next;
        node1.next=new ListNode(8);


//        node1=node1.next;
//        node1.next=new ListNode(0);
//        node1=node1.next;
//        node1.next=new ListNode(1);

        ListNode.transversal(tempNode1);
        ListNode result=solution.middleNode2(tempNode1);
        ListNode.transversal(result);
    }
}
