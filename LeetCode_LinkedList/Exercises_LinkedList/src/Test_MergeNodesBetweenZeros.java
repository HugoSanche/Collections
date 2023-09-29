public class Test_MergeNodesBetweenZeros {
    public static void main(String[] args) {
        ListNode node1=new ListNode(0);
        ListNode tempNode1=node1;
        node1.next=new ListNode(1);
        node1=node1.next;
        node1.next=new ListNode(0);
        node1=node1.next;
        node1.next=new ListNode(3);
        node1=node1.next;
        node1.next=new ListNode(0);
        node1=node1.next;
        node1.next=new ListNode(2);
        node1=node1.next;
        node1.next=new ListNode(2);
        node1=node1.next;
        node1.next=new ListNode(0);

        ListNode.transversal(tempNode1);
        MergeNodesBetweenZeros mergeNodesBetweenZeros=new MergeNodesBetweenZeros();
        ListNode result=mergeNodesBetweenZeros.mergeNodes(tempNode1);
        ListNode.transversal(result);

    }
}
