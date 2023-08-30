import java.util.ArrayList;

public class MinStack {
    int topOfStack;
    ArrayList<Integer> list;
    public MinStack() {
        topOfStack=-1;
        list=new ArrayList<>();
    }
    public void push(int val) {
        list.add(val);
        topOfStack++;
    }
    public void pop() {
        list.remove(topOfStack);
        topOfStack--;
    }
    public int top() {
        return list.get(topOfStack);
    }

    public int getMin() {
       return list.stream().reduce(Integer.MAX_VALUE,(a,b)->a>b ? b:a);

    }
}
