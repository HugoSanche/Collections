package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//es mas rapido para agregar datos principalmente al inicio o al final
//es ideal para implementar stack and queue
//es lento para obtener datos
//recuerda que hereda los metodos de la interface collection.- size(), add(), remove(),isEmpty(), contains(), containsAll()
public class Example_LinkedList {
    public static void main(String[] args) {
        List<String> linkedList=new LinkedList<>();

        linkedList.add("Pedro");
        linkedList.add("Hugo");
        linkedList.add("Nadia");
        linkedList.add("Veronica");

        System.out.println(linkedList);
        linkedList.remove("Veronica");

        System.out.println(linkedList);

        System.out.println(linkedList.size());
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.contains("Veronica"));

        ArrayList<String> arrayList =new ArrayList<>();
        arrayList.add("Pedro");
        arrayList.add("Hugo");
        arrayList.add("Nadia");
       // arrayList.add("Veronica");

        System.out.println(linkedList.containsAll(arrayList));

        System.out.println(linkedList);
        ArrayList<String> arrayList2 =new ArrayList<>();
        arrayList2.add("Pedro");

        linkedList.removeAll(arrayList2);//remueve lo que tenga la lista arrayList2
        System.out.println(linkedList);
        linkedList.clear();
        System.out.println(linkedList);

    }
}
