public class Main {
    public static void main(String[] args) {
       CircularDoublyLinkedList cdll= new CircularDoublyLinkedList();
       cdll.createCDLL(5);
       cdll.insertNode(2,1);


        System.out.println(cdll.head.next.value);
    }
}