public class Main {
    public static void main(String[] args) {
       CircularDoublyLinkedList cdll= new CircularDoublyLinkedList();
       cdll.createCDLL(1);
       cdll.insertNode(2,0);
        cdll.insertNode(3,2);
        cdll.insertNode(4,5);
        cdll.traversalCSLL();
       // System.out.println(cdll.head.next.value);
        cdll.reverseTraversalCSLL();
       // boolean result=cdll.searchCSLL(1);
       // System.out.println(result);
        cdll.deleteNodeCSLL(6);
        cdll.traversalCSLL();
        cdll.deleteCDLL();
        cdll.traversalCSLL();
    }
}