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
            item.adjustQuantityDeserved(-quantity);
            int inBasket=list.getOrDefault(item,0);//busca en list la llave item, si no la encuentra regresa 0
            if (inBasket-quantity==0){
                list.remove(item);

            }else{
                list.put(item,inBasket-quantity);
            }
            return inBasket;
        }
        return 0;
    }

    public Map<StockItem,Integer> items(){
        return Collections.unmodifiableMap(list);
    }
    public void restarItem(StockItem stockItem, int quantity){
        stockItem.adjustQuantityStock(quantity);
    }

    @Override
    public String toString() {
        String s="\nShopping basket "+this.name+" contains "+list.size()+(list.size()==1 ? " item" : " items\n");
        double totalCost=0.0;
       // System.out.println(list);
        for (Map.Entry<StockItem,Integer> item:list.entrySet() ){
            s = s + "Total Deserved: "+item.getKey().quantityInDeserve()+" " +item.getKey() + ". " + item.getKey().quantityInStock() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s+"Total cost "+totalCost;
    }
}
