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
           // System.out.println(value);
            DoublyNode tempNode= head;
            int index=0;
            while (index<location-1){
                tempNode=tempNode.next;
                index++;
            }
            newNode.next=tempNode.next;
            newNode.previous=tempNode;

            //tempNode.next.previous=tempNode;
            tempNode.next=newNode;
           newNode.next.previous=newNode;

        }
        size++;
    }
    //Time Complexity: O(N)
    //Space Complexity: O(1)
    public void traversalDLL(){

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
    public void reverseTraversalDLL(){

        if (head!=null){
            DoublyNode tempNode=tail;
            for (int i=size-1; i>=0; i--){
                System.out.print(tempNode.value);
                if (i>0){
                    System.out.print("=>");
                }

                tempNode=tempNode.previous;
            }
        }else{
            System.out.println("The DLL does noy exists");
        }
        System.out.println("\n");
    }
}
