public class StackLinkedList {
    LinkedList linkedList;

    StackLinkedList(){
        this.linkedList=new LinkedList();
    }

    //Time Complexity O(1)
    //Space Complexity O(1)
    //push method
    public void push(int value){
        linkedList.insertInLinkedList(value, 0);
    }

    //Time Complexity O(1)
    //Space Complexity O(1)
    // is Empty
    public boolean isEmpty(){
        if (linkedList.head==null){
            return true;
        }else{
            return false;
        }
    }
    //Time Complexity O(1)
    //Space Complexity O(1)
    //pop method
    public int pop(){
       int result= -1;
        if(isEmpty()){
            System.out.println("The Stack is empty");
            return -1;
        }else{
            result=linkedList.head.value;
            linkedList.deletionOfNode(0);
        }
        return result;
    }
    //Time Complexity O(1)
    //Space Complexity O(1)

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        else{
            return linkedList.head.value;
        }
    }
    //Time Complexity O(1)
    //Space Complexity O(1)
    public void delete(){
        linkedList.head=null;
        System.out.println("The stack was successfully deleted");
    }
}
