public class QueueLinkedList {
    LinkedList list;

    //Time Complexity O(1)
    //Space complexity O(1)
    public QueueLinkedList(){
        list=new LinkedList();
        System.out.println("The circular linked list successfully created");
    }
    //Time Complexity O(1)
    //Space complexity O(1)
    public boolean isEmpty(){
        if(list.head==null){
            return true;
        }else{
            return false;
        }
    }
    //enQueue
    //Time Complexity O(1)
    //Space complexity O(1)
    public void enQueue(int value){
        list.insertInLinkedList(value,list.size);
        System.out.println("Successufully insert value in circular queue");
    }
    //Time Complexity O(1)
    //Space complexity O(1)
    public int deQueue(){
        int value=-1;
        if (isEmpty()){
            System.out.println("The circular linked list is empty");
        }
        else{
            value=list.head.value;
            list.deletionOfNode(0);
        }
        return value;
    }
    //Time Complexity O(1)
    //Space complexity O(1)
    public int peek(){
        if(isEmpty()){
            System.out.println("The circular linked list is empty");
            return -1;
        }else{
            return list.head.value;
        }
    }
    public void delete(){
        if (isEmpty()){
            System.out.println("The circular linked list is empty");
        }
        else{
          list.head=null;
          list.tail=null;
            System.out.println("The circular linked list successfully deleted");
        }
    }
}




















