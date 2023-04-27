import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private final String name;
    private final Map<StockItem,Integer> list;

    private  int deserved;
    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public int getDeserved() {
        return deserved;
    }

    public int addToBasket(StockItem item, int quantity){

        if((item!=null) && (quantity>0)){
            deserved=quantity;
            int inBasket=list.getOrDefault(item,0);//busca en list la llave item, si no la encuentra regresa 0
            list.put(item,inBasket+quantity);
           //System.out.println("DOS");
            return inBasket;
        }
        return 0;
    }
    public int restToBasket(StockItem item, int quantity){

        if (deserved-quantity<0){
            System.out.println("Invalid undeserved item");
            return 0;
        }

        if((item!=null) && (quantity>0)){

           deserved=deserved-quantity;

            int inBasket=list.getOrDefault(item,0);//busca en list la llave item, si no la encuentra regresa 0
            System.out.println("Deserved "+deserved);
            System.out.println("inBasket "+inBasket);
            System.out.println("quantity "+quantity);
            System.out.println("item "+item.getName());

            if (inBasket-quantity==0){
                list.remove(item);
                System.out.println("A");
            }else{
                list.put(item,inBasket-quantity);
                System.out.println("B");
            }

            //System.out.println("My Basquet "+list.get(item));
            //System.out.println("DOS");
            return inBasket;
        }
        return 0;
    }


    public Map<StockItem,Integer> items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s="\nShopping basket "+this.name+" contains "+list.size()+(list.size()==1 ? " item" : " items\n");
        double totalCost=0.0;
       // System.out.println(list);
        for (Map.Entry<StockItem,Integer> item:list.entrySet() ){
          // System.out.println(item.getKey().quantityInDeserve());
            //+"Deserved "+item.getKey().quantityInDeserve()+" "
            s = s + "Total Deserved: "+item.getKey().quantityInDeserve()+" My Deserved: "+deserved+" "+item.getKey() + ". " + item.getKey().quantityInStock() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();

        }
        return s+"Total cost "+totalCost;
    }

}
