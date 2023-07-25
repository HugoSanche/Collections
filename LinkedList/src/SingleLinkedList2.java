public class SingleLinkedList2 {
    Node2 head;
    Node2 tail;

    int size;

    public void createNewNode(int value){
        Node2 node =new Node2();
        node.value=value;

        head=node;
        tail=node;
        size=1;
    }
    public void addNewNode(int value,int position){
        Node2 node =new Node2();
        node.value=value;
        if (head==null){
            createNewNode(value);
        }
        else if(position==0){
            node.next=head.next;
            head=node;
            size+=1;
        }
        else if (position>=size){
            node.next=null;
            tail.next=node;
            tail=node;
        }else{
            Node2 tempNode=head;
            for (int i=0; i<position-1; i++){
                tempNode=tempNode.next;
            }
            tempNode.next=node;
            node.next=tempNode.next;

        }
    }

}
