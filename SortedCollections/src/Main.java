import java.util.Map;

public class Main {
    private static StockList stockList=new StockList();
    public static void main(String[] args) {
        StockItem temp = new StockItem("Bread", 2.2, 2);
        stockList.addStock(temp);

        temp = new StockItem("Eggs", 1.5, 18);
        stockList.addStock(temp);

        temp = new StockItem("Soda", 1.0, 50);
        stockList.addStock(temp);

        temp = new StockItem("Door", 50.0, 5);
        stockList.addStock(temp);

        temp = new StockItem("Milk", 1.4, 20);
        stockList.addStock(temp);

        temp = new StockItem("Cheese", 6.0, 15);
        stockList.addStock(temp);
        temp = new StockItem("Yogurt", 1.0, 50);
        stockList.addStock(temp);
        temp = new StockItem("Gelatin", 0.5, 90);
        stockList.addStock(temp);
        temp = new StockItem("Butter", 1.2, 30);
        stockList.addStock(temp);
        temp = new StockItem("Beer", 1.0, 20);
        stockList.addStock(temp);
        temp = new StockItem("Wine", 70.0, 5);
        stockList.addStock(temp);

        temp = new StockItem("Towel", 2.0, 20);
        stockList.addStock(temp);
        temp = new StockItem("Phone", 1000.00, 3);
        stockList.addStock(temp);
        temp = new StockItem("Juice", 7.0, 7);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket hugoBasket = new Basket("Hugo");
        Basket veronicaBasket = new Basket("Veronica");

        sellItem(hugoBasket, "Eggs", 30);
        sellItem(hugoBasket, "Bread", 1);
        sellItem(hugoBasket, "Laptop", 1);
        sellItem(hugoBasket, "Soda", 40);
        sellItem(hugoBasket, "Cheese", 7);
        sellItem(hugoBasket, "Milk", 10);
        System.out.println(hugoBasket);

        sellItem(veronicaBasket, "Soda", 9);
        sellItem(veronicaBasket, "Milk", 5);
        System.out.println(veronicaBasket);

        System.out.println(hugoBasket);
        System.out.println(stockList);

        checkOut(hugoBasket);
        checkOut(veronicaBasket);
    }
    public static int sellItem(Basket basket,String item, int deserved){

        StockItem stockItem=stockList.get(item);
        if(stockItem==null){
            System.out.println("We don't sell "+item);
            return 0;
        }

        if(stockList.sellStock(item,deserved)!=0){
            basket.addToBasket(stockItem,deserved);
            return deserved;
        }

        return 0;
    }
    public static int unservedItem(Basket basket, String item, int undeserved){

        StockItem stockItem=stockList.get(item);
        if(stockItem==null){
            System.out.println("We don't have that item "+item);
            return 0;
        }
            basket.restToBasket(stockItem,undeserved);
        return 0;
    }
    public static void checkOut(Basket basket) {

        for (Map.Entry<StockItem,Integer> item:basket.items().entrySet() ){
        {
            StockItem stockItem=stockList.get(item.getKey().getName());
            stockList.checkOutItem(item.getKey().getName(),item.getValue());
        }
        basket.cl
        }
    }
}