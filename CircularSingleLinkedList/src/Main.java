public class Main {

    //Time Complexity O(1)
    //Space Complexity O(1)
    public static void main(String[] args) {
        CircularSingleLinkedList csll = new CircularSingleLinkedList();
        csll.createCircularSingleLinkedList(5);
        //System.out.println(csll.head.value);
        //System.out.println(csll.tail.value);

        csll.insertCircularSingleLinkedList(4,0);
        csll.insertCircularSingleLinkedList(6,1);
        csll.insertCircularSingleLinkedList(7,8);
       // csll.insertCircularSingleLinkedList(5,5);
        csll.traversalCircularSingleLinkedList();
        csll.deleteNode(8);
        csll.traversalCircularSingleLinkedList();


    }

}




