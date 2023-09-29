public class TestInsertGCD {
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
        InsertGCD insertGCD=new InsertGCD();
        ListNode result=insertGCD.insertGreatestCommonDivisors(tempNode1);
        ListNode.transversal(result);

    }
}
