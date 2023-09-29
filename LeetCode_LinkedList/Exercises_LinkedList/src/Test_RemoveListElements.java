public class Test_RemoveListElements {
    public static void main(String[] args) {
        ListNode node1=new ListNode(18);
        ListNode tempNode1=node1;
        node1.next=new ListNode(6);
        node1=node1.next;
        node1.next=new ListNode(10);
        node1=node1.next;
        node1.next=new ListNode(3);
//        node1=node1.next;
//        node1.next=new ListNode(4);
//        node1=node1.next;
//        node1.next=new ListNode(5);
//        node1=node1.next;
//        node1.next=new ListNode(6);

        ListNode.transversal(tempNode1);
        RemoveListElements  listElements=new RemoveListElements();
        ListNode result=listElements.removeElements2(tempNode1,6);
        ListNode.transversal(result);

    }
}
