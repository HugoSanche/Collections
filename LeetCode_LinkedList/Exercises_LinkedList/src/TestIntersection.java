public class TestIntersection {
    public static void main(String[] args) {

        ListNode node1=new ListNode(4);
        ListNode tempNode1=node1;
        node1.next=new ListNode(1);
        node1=node1.next;
        node1.next=new ListNode(8);
        node1=node1.next;
        node1.next=new ListNode(4);
        node1=node1.next;
        node1.next=new ListNode(5);
        node1=node1.next;
        ListNode.transversal(tempNode1);

        ListNode node2=new ListNode(5);
        ListNode tempNode2=node2;
        node2.next=new ListNode(6);
        node2=node2.next;
        node2.next=new ListNode(1);
        node2=node2.next;
        node2.next=new ListNode(8);
        node2=node2.next;
        node2.next=new ListNode(4);
        node2=node2.next;
        node2.next=new ListNode(5);
        node2=node2.next;
        ListNode.transversal(tempNode2);

       ListNode result= Intersection.getIntersectionNode(tempNode1,tempNode2);
        System.out.println(result);

    }
}
