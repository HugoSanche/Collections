public class TestCircularQueue {
    public static void main(String[] args) {
        CircularQueue circular=new CircularQueue(3);

        circular.enQueue(3);
        circular.enQueue(4);
        circular.enQueue(5);
        boolean result=circular.isEmpty();
        System.out.println(result);
        circular.enQueue(6);
    }

}
