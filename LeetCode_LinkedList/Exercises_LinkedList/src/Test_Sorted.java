public class Test_Sorted {
    public static void main(String[] args) {
        Sorted solution=new Sorted();

        ListNode node1=new ListNode(1);
        ListNode tempNode1=node1;


        node1.next=new ListNode(2);
        node1=node1.next;
        node1.next=new ListNode(4);
//        node1=node1.next;
//        node1.next=new ListNode(4);
//        node1=node1.next;
//        node1.next=new ListNode(5);
//        node1=node1.next;
       ListNode.transversal(tempNode1);

        ListNode node2=new ListNode(1);
        ListNode tempNode2=node2;
        node2.next=new ListNode(3);
        node2=node2.next;
        node2.next=new ListNode(4);
        node2=node2.next;
        node2.next=new ListNode(8);
       node2=node2.next;
        node2.next=new ListNode(9);
//        node2=node2.next;
//        node2.next=new ListNode(5);
//        node2=node2.next;
        ListNode.transversal(tempNode2);
        ListNode result=solution.mergeTwoLists3(tempNode1,tempNode2);
        ListNode.transversal(result);
    }
}
