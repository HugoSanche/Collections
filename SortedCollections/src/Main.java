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

        System.out.println("*********************");
        System.out.println(stockList);

//        for (String s : stockList.items().keySet()) {
//            System.out.println(s);
//        }

        System.out.println("----------------------------------------------------");
        Basket hugoBasket = new Basket("Hugo");
        Basket veronicaBasket = new Basket("Veronica");
        sellItem(hugoBasket, "Eggs", 30);
        // System.out.println(hugoBasket);

        sellItem(hugoBasket, "Bread", 1);
        // System.out.println(hugoBasket);
        // sellItem(hugoBasket, "Bread",2);

        sellItem(hugoBasket, "Laptop", 1);
        // System.out.println(hugoBasket);

        sellItem(hugoBasket, "Soda", 40);
        sellItem(veronicaBasket,"Soda",9);


        
        sellItem(hugoBasket, "Cheese", 7);

      //  stockList.items().get("Wine").adjustStock(20);//you modify the stock Item class not the Map
      //  stockList.get("Wine").adjustStock(-10);//you modify the stock Item class not the Map
        sellItem(hugoBasket, "Milk", 10);
        System.out.println(hugoBasket);

        sellItem(veronicaBasket, "Milk", 5);
        System.out.println(veronicaBasket);

        System.out.println("/*/*/*/*/*");
        //unservedItem(hugoBasket,"Milk",10);
        System.out.println(hugoBasket);


      //  temp = new StockItem("pen", 1.12);
        //stockList.addStock(temp);
        //  stockList.items().put(temp.getName(), temp); //you cannot modify Collections.unmodifiableMap.- you only read

       // System.out.println(stockList);

//        for (Map.Entry<String, Double> price : stockList.priceList().entrySet()) {
//            System.out.println(price.getKey() + " cost " + price.getValue());
//        }

    }
    public static int sellItem(Basket basket,String item, int deserved){

        StockItem stockItem=stockList.get(item);
        if(stockItem==null){
            System.out.println("We don't sell "+item);
            return 0;
        }

        if(stockList.sellStock(item,deserved)!=0){
            //System.out.println("PASE 1");
            basket.addToBasket(stockItem,deserved);

            return deserved;
        }

        return 0;
    }
    public static int unservedItem(Basket basket, String item, int undeserved){
        if (undeserved >basket.getDeserved()){
            System.out.println("Invalid undeserved item");
            return 0;
        }
        StockItem stockItem=stockList.get(item);
        if(stockItem==null){
            System.out.println("We don't have that item "+item);
            return 0;
        }

        if(stockList.undeserverStock(item,undeserved)!=0){
            System.out.println("PASE 1");
            basket.restToBasket(stockItem,undeserved);
            return undeserved;
        }
        return 0;
    }

}