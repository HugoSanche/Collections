import java.util.Map;

public class StockList {
   public final Map<String,StockItem> list;

    public StockList(Map<String, StockItem> list) {
        this.list = list;
    }
    public  int addStock(StockItem item){
        if (item!=null){
            StockItem inStock=list.getOrDefault(item.getName(),item);//si encuentra "item.getName()" te regresa su valor
                                                                    // si no lo encuentra te regresa "item"

            if (inStock!=item){
                item.adjustStock(inStock.getQuantityStock());
            }
            list.put(item.getName(),item);
        }
        return 0;
    }
}
