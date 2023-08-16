public class TestCircularQueue {
    public static void main(String[] args) {
        CircularQueue circular=new CircularQueue(3);

        circular.enQueue(3);
        circular.enQueue(4);
        circular.enQueue(5);
        boolean result=circular.isEmpty();
        System.out.println(result);
        circular.enQueue(6);

        //deQueue
        int result1= circular.deQueue();
        System.out.println(result1);
        int result2= circular.deQueue();
        System.out.println(result2);

        int result3=circular.peek();
        System.out.println(result3);

        circular.deleted();
    }

}
