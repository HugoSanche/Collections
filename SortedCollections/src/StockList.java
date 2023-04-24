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
            return item.quantityInStock();
        }
        return 0;
    }
    public int sellStock(String keyName, int quantity){
        StockItem stock=list.getOrDefault(keyName,null);
        if (stock!=null && stock.quantityInStock()>quantity && quantity>0){
            stock.adjustStock(-quantity);
            return quantity;
        }
        if (quantity>stock.quantityInStock()){
            System.out.println("Not enough items to sell");
        }
        return 0;
    }
    public StockItem get(String key){
        return list.get(key);
    }
    public Map<String,Double> priceList(){
        Map<String, Double> prices=new LinkedHashMap<>();
        for (Map.Entry<String, StockItem> item : list.entrySet()){
            prices.put(item.getKey(),item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
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
            //s=s+itemValue+"\n";
            totalCost+=itemValue;
        }
        return s +"Total stock value "+totalCost;
    }
}