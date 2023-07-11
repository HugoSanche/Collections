import java.util.ArrayList;
import java.util.Iterator;

public class AccessArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> test=new ArrayList<Integer>(10);
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        for (int i=0; i<test.size(); i++){
            Integer value=test.get(i);
            System.out.println(value);
        }
        System.out.println("*******************************\n");
        for (Integer value:test){
            System.out.println(value);
        }

        System.out.println("*******************************\n");
        //using Iterator
        Iterator<Integer> iterator= test.iterator();
        while(iterator.hasNext()) {
            Integer value= iterator.next();
            System.out.println(value);
        }

    }
}
