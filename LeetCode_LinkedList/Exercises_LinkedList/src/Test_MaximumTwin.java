public class Test_MaximumTwin {
    public static void main(String[] args) {
        ListNode node1=new ListNode(8);
        ListNode tempNode1=node1;
        node1.next=new ListNode(1);
        node1=node1.next;
        node1.next=new ListNode(2);
        node1=node1.next;
        node1.next=new ListNode(3);
        node1=node1.next;
        node1.next=new ListNode(4);
        node1=node1.next;
        node1.next=new ListNode(9);

        ListNode.transversal(tempNode1);
        MaximumTwin  maximumTwin=new MaximumTwin();
        int result=maximumTwin.pairSum2(tempNode1);
        System.out.println(result);
    }
}
