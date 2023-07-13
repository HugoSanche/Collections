public class SinglyLinkedList {
    public Node head;
    public Node tail;

    int size;

    public Node createSinglyLinkedList(int valueNode){
        head =new Node();
        Node  node=new Node();

        node.next=null;
        node.value=valueNode;
        head=node;
        tail=node;
        return head;
    }
}
