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
    }
}
