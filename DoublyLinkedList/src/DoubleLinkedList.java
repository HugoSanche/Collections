public class DoubleLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    //Time Complexity: O(1)
    //Space Complexity: O(1)
    public DoublyNode createNode(int nodeValue) {
        DoublyNode newNode=new DoublyNode();
        newNode.next=null;
        newNode.previous=null;
        newNode.value=nodeValue;
        head=newNode;
        tail=newNode;
        size=1;
        return head;
    }
}
