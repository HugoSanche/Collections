public class Main {
    public static void main(String[] args) {
        Stack stack=new Stack(5);
      //  boolean result=stack.isEmpty();
      //  System.out.println(result);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        int result=stack.pop();
        System.out.println(result);

        int result1=stack.pop();
        System.out.println(result1);

        int result2=stack.peek();
        System.out.println(result2);
    }
}