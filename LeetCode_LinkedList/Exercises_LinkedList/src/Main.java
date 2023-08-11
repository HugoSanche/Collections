public class Main {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.createLL(4);
        ll.insertLL(25);
        ll.insertLL(1);
        ll.insertLL(35);
        ll.insertLL(20);
       // ll.insertLL(2);
        ll.traversalLL();
      //  ll.deleteDups();
      //  ll.traversalLL();
        //ll.nthToLast(ll,1);
       ll.reArrange_(ll,21);
        ll.traversalLL();
    }
}