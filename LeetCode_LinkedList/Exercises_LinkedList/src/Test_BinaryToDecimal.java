public class Test_BinaryToDecimal {
    public static void main(String[] args) {
        BinaryToDecimal solution=new BinaryToDecimal();
        ListNode node1=new ListNode(1);
        ListNode tempNode1=node1;
        node1.next=new ListNode(0);
        node1=node1.next;
        node1.next=new ListNode(1);
        node1=node1.next;
        node1.next=new ListNode(0);
        node1=node1.next;
        node1.next=new ListNode(1);
        node1=node1.next;
        node1.next=new ListNode(1);
        node1=node1.next;
        node1.next=new ListNode(0);
        node1=node1.next;
        node1.next=new ListNode(1);

        ListNode.transversal(tempNode1);
        int result=solution.getDecimalValue2(tempNode1);
        System.out.println(result);

    }
}
