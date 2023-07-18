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
        size=1;
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

//Time complexity O(N)
//Time complexity O(1)

    // Transversal single linked list
    public void traverseSingleLinkedList(){
        if (head==null){
            System.out.println("SSL does not exist");
        }else{
            Node printNode=head;
            for (int i=0; i<size; i++){
                System.out.print(printNode.value);
                if (i!=size-1){
                    System.out.print("- >");
                }
                printNode=printNode.next;
            }
        }
        System.out.println("\n");
    }

    //Time complexity O(N)
    //Time complexity O(1)
    public boolean searchSingleLinkedList(int value){
        if (head==null){
            System.out.println("SSL does not exist");
        }else{
            Node searchNode=head;
            for (int i=0; i<size; i++){
                //System.out.print(searchNode.value);
                if (value==searchNode.value){
                    System.out.println("Value found at the location: "+i);
                    return true;
                }
                searchNode=searchNode.next;
            }
        }
        System.out.println("\n Node value not found");
        return false;
    }
}
