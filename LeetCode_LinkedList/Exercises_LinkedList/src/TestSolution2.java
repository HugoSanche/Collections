public class TestSolution2 {

    public static void main(String[] args) {

        LinkedListLeet ll=new LinkedListLeet();
        ll.createLL(4);
        ll.insertLL(1);
     //   ll.insertLL(5);
      //  ll.insertLL(9);



        LinkedListLeet ll2=new LinkedListLeet();
        ll2.createLL(5);
        ll2.insertLL(6);
        ll2.insertLL(1);


        Solution solution=new Solution();
       solution.addSameNode(ll,ll2,8);
        solution.addSameNode(ll,ll2,4);
        solution.addSameNode(ll,ll2,5);
        ll.traversalLL();
        ll2.traversalLL();

        ListNode intersec=solution.findIntersection(ll,ll2);
        System.out.println(intersec.val);

        System.out.println("***************LET CODE********************");

        //Add values in first node
        ListNode node1=new ListNode(4);
        ListNode tempNode1=node1;
        node1.next=new ListNode(1);
        node1=node1.next;
        ListNode.transversal(tempNode1);

        //Add values in second node
        ListNode node2=new ListNode(5);
        ListNode tempNode2=node2;
        node2.next=new ListNode(6);
        node2=node2.next;
        node2.next=new ListNode(1);
        node2=node2.next;

        //add same node in two nodes
        ListNode sameNode=new ListNode(8);
        //node one
        node1.next=sameNode;
        node1=node1.next;

        //node two
        node2.next=sameNode;
        node2=node2.next;

        ListNode sameNode2=new ListNode(4);
        //node one
        node1.next=sameNode2;
        node1=node1.next;

        //node two
        node2.next=sameNode2;
        node2=node2.next;

        ListNode sameNode3=new ListNode(5);
        //node one
        node1.next=sameNode3;
       // node1=node1.next;

        //node two
        node2.next=sameNode3;
       // node2=node2.next;

        ListNode.transversal(tempNode2.next);

        ListNode inter=solution.findIntersection2(tempNode1,tempNode2);
        System.out.println(inter.val);
    }
}
