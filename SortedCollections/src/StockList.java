import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
   private final Map<String,StockItem> list;


public StockList(){
    this.list = new LinkedHashMap<>();
}

    public  int addStock(StockItem item){
        if (item!=null){
            StockItem inStock=list.getOrDefault(item.getName(),item);//si encuentra "item.getName()" te regresa su valor
                                                                    // si no lo encuentra te regresa "item"

            if (inStock!=item){
                item.adjustStock(inStock.quantityInStock());
            }
            list.put(item.getName(),item);
        }
        return 0;
    }
    public int sellStock(String keyName, int quantity){
        StockItem stock=list.getOrDefault(keyName,null);
        if (stock!=null && stock.quantityInStock()>quantity && quantity>0){
            stock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }
    public StockItem get(String key){
        return list.get(key);
    }
    public Map<String, StockItem> items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s="\nStock List\n";
        double totalCost=0.0;
        for (Map.Entry<String,StockItem> item :list.entrySet()){
            StockItem stockItem=item.getValue();
            double itemValue=stockItem.getPrice()*stockItem.quantityInStock();
            s=s+stockItem+". There are "+stockItem.quantityInStock()+ " in stock. Value of items: ";
            s=s+String.format("%.2f",itemValue)+"\n";
            totalCost+=itemValue;
        }
        return s +"Total stock value "+totalCost;
    }
}

















