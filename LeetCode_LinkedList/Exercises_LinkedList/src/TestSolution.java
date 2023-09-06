public class TestSolution {
    public static void main(String[] args) {


        LinkedListLeet ll=new LinkedListLeet();
        ll.createLL(9);
        ll.insertLL(9);
        ll.insertLL(9);
        ll.insertLL(9);
        ll.insertLL(9);
        ll.insertLL(9);
        ll.insertLL(9);

     //  ll.traversalLL();
        LinkedListLeet ll2=new LinkedListLeet();
        ll2.createLL(9);
        ll2.insertLL(9);
        ll2.insertLL(9);
        ll2.insertLL(9);
        //ll2.traversalLL();

        Solution solution=new Solution();
        ListNode result=solution.addTwoNumbers(ll.head,ll2.head);

        ListNode.transversal(result);
      //  ll.deleteSLL();
      //  ll2.deleteSLL();
       // ListNode.transversal(ll.head);

        /*
        Solution solution=new Solution();
        ListNode node1=new ListNode();

        //node1=node1.next;
        // node1=new ListNode(7);

        node1.next=new ListNode(7);
        node1=new ListNode(1);
        node1.next=new ListNode(6);

        ListNode node2=new ListNode(5);
        node2.next=new ListNode(9);
        node2.next=new ListNode(2);

       ListNode result= solution.addTwoNumbers(node1,node2);
       ListNode.tranversal(result);
        */
    }
}
