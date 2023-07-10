import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    //Some version arrayList is initialized by 1 and value null
    //other version ArrayList is  initialized by 10    and value null

        //not specify type you can add different types of values
        ArrayList myArrayList=new ArrayList();

        myArrayList.add("H");
        myArrayList.add(1);

        //Initialized by 10 elements
        ArrayList test=new ArrayList(10);

        //only integers
        ArrayList<Integer> arrayList=new ArrayList<>();
        



        System.out.println(myArrayList);


    }
}