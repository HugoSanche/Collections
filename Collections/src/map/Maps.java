package map;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> names=new HashMap<>();
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

        names.replace("Pedro",44444);
        names.replace("Daniel",33333); //no hace nada, no existe Daniel
        System.out.println(names);
        System.out.println("YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");


        names.putIfAbsent("Nadia",1234); //si no existe lo agrega. Como ya existe no hace nada
        System.out.println(names);

        names.putIfAbsent("Guissel",11111);//si no existe lo agrega. Como no existe lo agrega
        System.out.println(names);
        //names.computeIfAbsent("Karina",5412);

        System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");

        //using lambda expression
        names.forEach((a,x)->{
            System.out.println("Key; "+a+", value: "+x);
        });
        System.out.println("\n");
        System.out.println("88888888888888888888888888888888888888888888888888888");
        //using iterate
        for(Map.Entry<String, Integer> set: names.entrySet()){
            System.out.println("Key; "+set.getKey()+" value: "+set.getValue());
        }

        System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
        names.put(null,9999);
        System.out.println(names);
        names.put(null,8888);
        System.out.println(names);
    }
}
