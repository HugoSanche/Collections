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
//                System.out.println("///");
                item.adjustStock(inStock.quantityInStock());
            }
            //System.out.println("-*-*-*-*-*-*-*-*-*-*");
            list.put(item.getName(),item);
            return item.quantityInStock();
        }
        return 0;
    }
    public int sellStock(String keyName, int deserved){
        StockItem stock=list.getOrDefault(keyName,null);
  //      System.out.println(stock.getName()+" "+stock.getPrice());
    //    System.out.println(stock.quantityInDeserve());
        System.out.println("\n&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println(stock.getName());
        System.out.println(stock.quantityInStock());
        System.out.println(deserved);
        System.out.println(stock.quantityInDeserve());
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
        if (stock!=null && stock.quantityInStock()>(deserved+stock.quantityInDeserve()) && deserved>0){
           stock.adjustStock(deserved);
            return deserved+stock.quantityInDeserve();
        }
        if (deserved+stock.quantityInDeserve()>stock.quantityInStock()){
            System.out.println("Not enough "+stock.getName()+" to sell."+" You try to buy "+deserved+" but only have "+stock.quantityInStock());
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
           // System.out.println("*****************************");
           // System.out.println(item.getValue());

            StockItem stockItem=item.getValue();
            double itemValue=stockItem.getPrice()*stockItem.quantityInStock();
            int d=item.getValue().quantityInDeserve();

            s=s+"Deserved items "+d+" "+stockItem+". There are "+stockItem.quantityInStock()+ " in stock. Value of items: ";
            s=s+String.format("%.2f",itemValue)+"\n";
            //s=s+itemValue+"\n";
            totalCost+=itemValue;
        }
        return s +"Total stock value "+totalCost;
    }
}