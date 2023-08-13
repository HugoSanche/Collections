public class Main {
    public static void main(String[] args) {
        QueueArray queueArray=new QueueArray(4);
        queueArray.enQueue(1);
        queueArray.enQueue(2);
        queueArray.enQueue(3);
        queueArray.enQueue(4);
        int result =queueArray.deQueue();
        System.out.println(result);
        int result1 =queueArray.deQueue();
        System.out.println(result1);
        System.out.println("*******");
        int result2=queueArray.peek();
        System.out.println(result2);
        //queueArray.delete();
        boolean isEmpty=queueArray.isEmpty();
        System.out.println(isEmpty);
    }

}