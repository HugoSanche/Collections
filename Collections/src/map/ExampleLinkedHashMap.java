package map;

import java.util.LinkedHashMap;
import java.util.Map;

//Recuerda;
// HashMap       NO mantiene el orden de entrada de datos,
// LinkedHashMap SI mantiene el orden de entrada de los datos
public class ExampleLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> names=new LinkedHashMap<>();

        names.put("Veronica",3542);
        names.put("Karina",5412);
        names.put("Nadia",87451);
        names.put("Carlos",12455);
        names.put("Carlos2",12455);
        names.put("Pedro",55555);

        System.out.println(names);

        System.out.println(names.containsKey("Nadia"));
        System.out.println(names.containsValue(12455));
        System.out.println(names.get("Veronica"));
        System.out.println("********************************************************");

        names.put("Carlos",5555); //reemplaza el valor
        System.out.println(names);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        names.replace("Pedro",44444);//similar a put cuando ya existe un registro
        names.replace("Daniel",33333); //no hace nada, no existe Daniel. Es la diferencia con put
        System.out.println(names);
        System.out.println("YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");

        names.putIfAbsent("Veronica", 8888);
        for(Map.Entry<String,Integer> set: names.entrySet()){
            System.out.println("Key: "+set.getKey()+"Value: "+set.getValue());
        }


    }
}
