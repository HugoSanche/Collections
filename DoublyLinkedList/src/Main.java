public class Main {
    public static void main(String[] args) {
        DoubleLinkedList dll=new DoubleLinkedList();
        dll.createNode(1);
        dll.insertDLL(2,0);
        dll.insertDLL(3,1);
        dll.insertDLL(4,7);
        dll.traversalDLL();
       // dll.reverseTraversalDLL();
       // boolean result= dll.searchDLL(5);
      //  System.out.println(result);
        //System.out.println(dll.head.value);
       dll.deleteDLL();
        dll.traversalDLL();
    }
}
