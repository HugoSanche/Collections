public class QueueLinkedList {
    LinkedList list;

    //Time Complexity O(1)
    //Space complexity O(1)
    public QueueLinkedList(){
        list=new LinkedList();
        System.out.println("The circular linked list successfully created");
    }
    public boolean isEmpty(){
        if(list.head==null){
            return true;
        }else{
            return false;
        }
    }
    //enQueue
    public void enQueue(int value){
        list.insertInLinkedList(value,list.size);
        System.out.println("Successufully insert value in circular queue");
    }


}




















