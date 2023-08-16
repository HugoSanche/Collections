public class TestQueueLinkedList {
    public static void main(String[] args) {
        QueueLinkedList queue=new QueueLinkedList();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        boolean result= queue.isEmpty();
        System.out.println(result);
    }


}
