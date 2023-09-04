public class TestSolution {
    public static void main(String[] args) {


        LinkedListLeet ll=new LinkedListLeet();
        ll.createLL(1);
        ll.insertLL(2);
        ll.insertLL(3);
        ll.insertLL(4);
        ll.insertLL(5);
      

      //  ll.traversalLL();
                                                                                           ll.createLL(9);
        LinkedListLeet ll2=new LinkedListLeet();                                                                                ll.insertLL(9);
        ll2.createLL(6);                                                                                                         ll.insertLL(9);
        ll2.insertLL(7);                                                                                                         ll.insertLL(9);
        ll2.insertLL(8);
        ll2.insertLL(11);
        //ll2.traversalLL();

        Solution solution=new Solution();
        ListNode result=solution.addTwoNumbers(ll.head,ll2.head);

        ll.deleteSLL();
        ll2.deleteSLL();
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
