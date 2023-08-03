public class Main {
    public static void main(String[] args) {
        DoubleLinkedList dll=new DoubleLinkedList();
        dll.createNode(1);
        dll.insertDLL(2,0);
        dll.insertDLL(3,1);
        dll.insertDLL(4,7);
        dll.transverseDLL();
        //System.out.println(dll.head.value);
    }
}