public class Main {
    private static StockList stockList=new StockList();
    public static void main(String[] args) {
    StockItem temp=new StockItem("Bread",2.2,2);
    stockList.addStock(temp);

    temp=new StockItem("Eggs",1.5,18);
    stockList.addStock(temp);

        temp=new StockItem("Soda",1.0,50);
        stockList.addStock(temp);

        temp=new StockItem("Door",50.0,5);
        stockList.addStock(temp);

        temp=new StockItem("Milk",1.4,70);
        stockList.addStock(temp);

        temp=new StockItem("Cheese",6.0,15);
        stockList.addStock(temp);
        temp=new StockItem("Yogurt",1.0,50);
        stockList.addStock(temp);
        temp=new StockItem("Gelatin",0.5,90);
        stockList.addStock(temp);
        temp=new StockItem("Butter",1.2,30);
        stockList.addStock(temp);
        temp=new StockItem("Beer",1.0,20);
        stockList.addStock(temp);
        temp=new StockItem("Wine",70.0,5);
        stockList.addStock(temp);

        temp=new StockItem("Towel",2.0,20);
        stockList.addStock(temp);
        temp=new StockItem("Phone",1000.00,3);
        stockList.addStock(temp);
        temp=new StockItem("Juice",7.0,7);
        stockList.addStock(temp);

        System.out.println("*********************");
        System.out.println(stockList);

        for (String s: stockList.items().keySet()){
            System.out.println(s);
        }
        Basket hugoBasket =new Basket("Hugo");
        sellItem(hugoBasket, "Eggs",30);
        System.out.println(hugoBasket);

        sellItem(hugoBasket, "Bread",1);
        System.out.println(hugoBasket);
        sellItem(hugoBasket, "Bread",1);
        System.out.println(hugoBasket);
        sellItem(hugoBasket, "Bread",1);
        sellItem(hugoBasket, "Laptop",1);
        System.out.println(hugoBasket);

        sellItem(hugoBasket, "Soda",1);
        sellItem(hugoBasket, "Milk",1);
        sellItem(hugoBasket, "Cheese",1);
        System.out.println(hugoBasket);

        System.out.println(hugoBasket);
        System.out.println(stockList);

    }
    public static int sellItem(Basket basket,String item, int quantity){
        StockItem stockItem=stockList.get(item);
        if(stockItem==null){
            System.out.println("We don't sell "+item);
            return 0;
        }
        if(stockList.sellStock(item,quantity)!=0){
            basket.addToBasket(stockItem,quantity);
            return quantity;
        }
        return 0;
    }
}