public class CircularDoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    //Time complexity O(1)
    //Space complexity O(1)
    public DoublyNode createCDLL(int valueNode){
        DoublyNode newNode=new DoublyNode();
        head=newNode;
        tail=newNode;

        newNode.value=valueNode;
        newNode.next=newNode;
        newNode.prev=newNode;
        size=1;
        return head;
    }
    //Time complexity O(N)
    //Space complexity O(1)
    public void insertNode(int nodeValue, int location){
        DoublyNode newNode=new DoublyNode();
        newNode.value=nodeValue;
        if (head==null){
            createCDLL(nodeValue);
            return;
        }else if(location==0){
            newNode.prev=tail;
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            tail.next=newNode;
        } else if (location>=size) {
            newNode.next=head;
            newNode.prev=tail;
            head.prev=newNode;
            tail.next=newNode;
            tail=newNode;
        }else {
            DoublyNode tempNode=head;
            int index=0;
            while(index<location-1){
                tempNode=tempNode.next;
                index++;
            }
            newNode.prev=tempNode;
            newNode.next=tempNode.next;
            newNode.next.prev=newNode;
            tempNode.next=newNode;
        }
        size++;
    }
    //Time complexity O(N)
    //Space complexity O(1)
    public void traversalCSLL(){
        if (head!=null){
            DoublyNode tempNode=head;
                for (int i=0; i<size;i++){
                   System.out.print(tempNode.value);
                    if (i!=size-1){
                        System.out.print("=>");
                    }
                    tempNode=tempNode.next;
                }
            }
        else {
            System.out.println("CSLL does not exist");
            }
        System.out.println();
    }
    //Time complexity O(N)
    //Space complexity O(1)
    public void reverseTraversalCSLL(){
        if (head!=null){
            DoublyNode tempNode=tail;
            for (int i=0; i<size;i++){
                System.out.print(tempNode.value);
                if (i!=size-1){
                    System.out.print("=>");
                }
                tempNode=tempNode.prev;
            }
        }
        else {
            System.out.println("CSLL does not exist");
        }
        System.out.println();
    }
    //Time complexity O(N)
    //Space complexity O(1)
    public boolean searchCSLL(int valueToSearch) {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == valueToSearch) {
                    return true;
                }
                tempNode = tempNode.next;
            }

        } else {
            System.out.println("CSLL does not exist");
        }
        System.out.println();
        return false;
    }
    //Time complexity O(N)
    //Space complexity O(1)
    public void deleteNodeCSLL(int location){
        if (head!=null){
            //
            if (location==0){

                //if only one node exist
                if (size==1){
                    head.next=null;
                    head.prev=null;
                    head=null;
                    tail=null;
                    size--;
                //if I have more nodes
                }else{
                    head=head.next;
                   head.prev=tail;
                   tail.next=head;
                   size--;
                }
                //if the node was the last
            } else if (location>=size) {
                //if only one node exist
                if (size==1){
                    head.next=null;
                    head.prev=null;
                    head=null;
                    tail=null;
                    size--;
                    //if I have more nodes
                }else{
                    tail=tail.prev;
                    tail.next=head;
                    head.prev=tail;
                    size--;
                }
                //if the node is the middle
                }else{
                     DoublyNode tempNode=head;
                    int index=0;
                    while(index<location-1){
                         tempNode=tempNode.next;
                          index++;
                }
                    tempNode.next=tempNode.next.next;
                    tempNode.next.prev=tempNode;
                    size--;
            }
        }else {
            System.out.println("CDLL does not exist");
        }
    }
    public void deleteCDLL(){
        if (head!=null){
            DoublyNode tempNode=head;
            int index=0;
            while(index<size){
                tempNode.prev=null;
                tempNode=tempNode.next;
                index++;
            }
            head=null;
            tail=null;
            System.out.println("The CSLL has been deleted!");
        }
        else{
            System.out.println("The CSLL does not exist");
        }
    }
}
