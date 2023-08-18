public class StackLinkedList {
    LinkedList linkedList;

    StackLinkedList(){
        this.linkedList=new LinkedList();
    }
    //push method
    public void push(int value){
        linkedList.insertInLinkedList(value, 0);
    }

    // is Empty
    public boolean isEmpty(){
        if (linkedList.head==null){
            return true;
        }else{
            return false;
        }
    }
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
}
