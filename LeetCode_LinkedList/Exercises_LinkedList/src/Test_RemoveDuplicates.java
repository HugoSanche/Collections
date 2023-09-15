public class Test_RemoveDuplicates {
    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode tempNode1=node1;


        node1.next=new ListNode(1);
        node1=node1.next;
        node1.next=new ListNode(2);
        node1=node1.next;
//        node1.next=new ListNode(3);
//        node1=node1.next;
//        node1.next=new ListNode(3);
        ListNode.transversal(tempNode1);
        RemoveDuplicates removeDuplicates=new RemoveDuplicates();
       ListNode result= removeDuplicates.deleteDuplicates(tempNode1);
        ListNode.transversal(result);
    }
}
