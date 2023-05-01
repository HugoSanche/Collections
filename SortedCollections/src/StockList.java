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
                item.adjustQuantityDeserved(inStock.quantityInStock());
            }
            list.put(item.getName(),item);
            return item.quantityInStock();
        }
        return 0;
    }
    public int sellStock(String keyName, int deserved){
        StockItem stock=list.getOrDefault(keyName,null);
        if (stock!=null && stock.quantityInStock()>(deserved+stock.quantityInDeserve()) && deserved>0){
           stock.adjustQuantityDeserved(deserved);
            return deserved+stock.quantityInDeserve();
        }
        if (deserved+stock.quantityInDeserve()>stock.quantityInStock()){
            System.out.println("Not enough "+stock.getName()+" to sell."+" You try to buy "+deserved+" but only have "+stock.quantityInStock());
        }
        return 0;
    }

    public int undeserverStock(String keyName, int undeserved){
        StockItem stock=list.getOrDefault(keyName,null);
        if (stock!=null && stock.quantityInDeserve()>=(undeserved) && undeserved>0){
            stock.adjustQuantityDeserved(-undeserved);
            return stock.quantityInDeserve();
        }
        if (undeserved>stock.quantityInDeserve()){
            System.out.println(stock.getName()+" You try to undeserved "+undeserved+" but Its higher than "+stock.quantityInDeserve());
        }
        return 0;
    }
    public void checkOutItem(String keyName, int deserved){
        StockItem stock=list.getOrDefault(keyName,null);
        if ( deserved>stock.quantityInStock()){
            System.out.println("Not enough "+stock.getName()+" to sell."+" You try to buy "+deserved+" but only have "+stock.quantityInStock());
        }
        if (stock!=null && stock.quantityInStock()> deserved){
            stock.adjustQuantityStock(deserved);
        }
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
            int d=item.getValue().quantityInDeserve();

            s=s+"Deserved items "+d+" "+stockItem+". There are "+(stockItem.quantityInStock()-stockItem.quantityInDeserve())+ " in stock. Value of items: ";
            s=s+String.format("%.2f",itemValue)+"\n";
            //s=s+itemValue+"\n";
            totalCost+=itemValue;
        }
        return s +"Total stock value "+totalCost;
    }
}