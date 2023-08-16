public class TestQueueLinkedList {
    public static void main(String[] args) {
        QueueLinkedList queue=new QueueLinkedList();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        int result= queue.peek();
        System.out.println(result);
        int result2= queue.peek();
        System.out.println(result2);
        queue.delete();
    }


}
