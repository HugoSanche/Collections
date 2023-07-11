import java.util.ArrayList;


//add() – takes O(1) time; however, worst-case scenario, when a new array has to be created and all the elements copied to it, it's O(n)
//add(index, element) – on average runs in O(n) time
//get() – is always a constant time O(1) operation
//remove() – runs in linear O(n) time. We have to iterate the entire array to find the element qualifying for removal.
//indexOf() – also runs in linear time. It iterates through the internal array and checks each element one by one, so the time complexity for this operation always requires O(n) time.
//contains() – implementation is based on indexOf(), so it'll also run in O(n) time.

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    //Some version arrayList is initialized by 1 and value null
    //other version ArrayList is  initialized by 10    and value null

        //not specify type you can add different types of values
        ArrayList myArrayList=new ArrayList();

        myArrayList.add("H");
        myArrayList.add(0,5);

        //Initialized by 10 elements
        ArrayList<Integer> test=new ArrayList<Integer>(10);
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);

        //will mark exception IndexOutOfBoundsException
        test.add(5,7);
        System.out.println(test);

        //only integers
        ArrayList<Integer> arrayList=new ArrayList<>();

        System.out.println(myArrayList);


    }
}