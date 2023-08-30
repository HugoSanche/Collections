public class TestStackMin {
    public static void main(String[] args) {
        StackMin newStack= new StackMin();
        newStack.push(5);
        newStack.push(4);
        newStack.push(2);
        newStack.push(7);
        //newStack.pop();
        //newStack.pop();
        System.out.println(newStack.min());
       System.out.println(newStack.top.value);
    }
}
