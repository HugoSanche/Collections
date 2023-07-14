public class SinglyLinkedList {
    public Node head;
    public Node tail;

    int size;

    public Node createSinglyLinkedList(int valueNode){
        Node  node=new Node();

        node.next=null;
        node.value=valueNode;
        head=node;
        tail=node;
        return head;
    }

    //Insert Method SinglyLinkedList
    public void insertInLinkedList(int nodeValue, int location){
        Node node =new Node();
        node.value=nodeValue;
        if (head==null){
            createSinglyLinkedList(nodeValue);
            return;
        }else if (location==0){
            node.next=head;
            head=node;
        }else if (location>=size){
            node.next=null;
            tail.next=node;
            tail=node;
        }else{
            Node tempNode=head;
            int index=0;
            while(index<location-1){
                tempNode=tempNode.next;
                index++;
            }
            Node nextNode=tempNode.next;
            tempNode.next=node;
            node.next=nextNode;
        }
        size++;
    }
}
