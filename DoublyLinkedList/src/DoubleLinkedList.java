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

    //Time Complexity: O(N)
    //Space Complexity: O(1)
    public void insertDLL(int value, int location){
        DoublyNode newNode =new DoublyNode();
        newNode.value=value;
        if (head==null){
            createNode(value);
            return;
        }
        else if (location==0){
            newNode.next=head;
            newNode.previous=null;
            head.previous=newNode;
            head=newNode;
        }else if (location>=size){
            newNode.next=null;
            newNode.previous=tail;
            tail.next=newNode;
            tail=newNode;
        }else{
            DoublyNode tempNode= head;
            int index=0;
            while (index<location-1){
                tempNode=tempNode.next;
                index++;
            }
            newNode.next=tempNode.next;
            newNode.previous=tempNode;
            tempNode.next=newNode;
            tempNode.next.previous=tempNode;
          //  newNode.next.previous=newNode;
        }
        size++;
    }
    //Time Complexity: O(N)
    //Space Complexity: O(1)
    public void transverseDLL(){

        if (head!=null){
            DoublyNode tempNode=head;
            for (int i=0; i<size; i++){
                System.out.print(tempNode.value);
                if (i!=size-1){
                    System.out.print("=>");
                }
                tempNode=tempNode.next;
            }
        }else{
            System.out.println("The DLL does noy exists");
        }
        System.out.println("\n");
    }
}
