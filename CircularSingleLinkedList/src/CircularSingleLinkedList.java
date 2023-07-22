public class CircularSingleLinkedList {
    Node head;
    Node tail;
    int size;
    public Node createCircularSingleLinkedList(int value){
        Node node=new Node();
        head=node;
        tail=node;
        node.next=node;
        node.value=value;
        size=1;
        return head;
    }
    //Time Complexity O(N)
    //Space Complexity O(1)
    public void insertCircularSingleLinkedList( int value,int position){
        Node node = new Node();
        node.value=value;
            if (head==null){
                System.out.println("Not exits Circular single List");
                createCircularSingleLinkedList(value);
            }
            else if (position==0){
                node.next=head;
                head=node;
                //tail=node;
                tail.next=head;
            }
            else if (position>=size){
                node.next=head;
                tail.next=node;
                tail=node;
               // tail.next=head;
            }else{
                Node tempNode=head;
                for (int i=0; i<position-1; i++){
                    tempNode=tempNode.next;
                }
                node.next=tempNode.next;
                tempNode.next=node;

            }
        size+=1;
    }

    //Time Complexity O(N)
    //Space Complexity O(1)
    public void traversalCircularSingleLinkedList(){
        if (head!=null){
            Node tempNode=head;

            for (int i=0; i<size; i++){
                System.out.print(tempNode.value);
                if (size>0){
                    System.out.print("->");
                }
                tempNode=tempNode.next;
            }
            System.out.println("\n");
        }
        else{
            System.out.println("Not exits Circular single List");
        }
    }
    //Time Complexity O(N)
    //Space Complexity O(1)
    public boolean searchCircularSingleLinkedList(int valueToSearch){
        if (head!=null){
            Node tempNode=head;
            for (int i=0; i<size; i++){
                if (tempNode.value==valueToSearch){
                    System.out.print("Value found in index: "+i+1);
                    return true;
                }
                tempNode=tempNode.next;
            }
        }
        System.out.println("Not exits value in Circular single List");
        return false;
    }
}





