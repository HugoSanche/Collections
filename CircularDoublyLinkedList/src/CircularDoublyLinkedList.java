public class CircularDoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode createCDLL(int valueNode){
        DoublyNode newNode=new DoublyNode();
        head=newNode;
        tail=newNode;

        newNode.value=valueNode;
        newNode.next=newNode;
        newNode.Prev=newNode;

        return head;
    }
}
