import java.util.HashMap;
import java.util.Map;

public class TestMapEntry {
    public static void main(String[] args) {


        Map<Integer,String> names=new HashMap<>();
        names.put(1,"Hugo Baltazar");
        names.put(2, "Karina Lopez");
        names.put(3,"Veronica Perez");

        for(Map.Entry<Integer,String> name: names.entrySet()){
            System.out.println("Key: "+name.getKey()+" Value: "+name.getValue());
        }
        System.out.println("**************************************");
        for(Integer key: names.keySet()){
            System.out.println("Key: "+key+" Value: "+names.get(key));
        }
    }
}
