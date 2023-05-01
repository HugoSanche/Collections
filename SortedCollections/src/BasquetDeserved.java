public class BasquetDeserved {
    private Basket nameBasket;
    private StockItem name;
    private int deserved;

    public BasquetDeserved(Basket nameBasket, StockItem name, int deserved) {
        this.nameBasket = nameBasket;
        this.name = name;
        this.deserved = deserved;
    }

    public Basket getNameBasket() {
        return nameBasket;
    }

    public void setNameBasket(Basket nameBasket) {
        this.nameBasket = nameBasket;
    }

    public StockItem getName() {
        return name;
    }

    public void setName(StockItem name) {
        this.name = name;
    }

    public int getDeserved() {
        return deserved;
    }

    public void setDeserved(int deserved) {
        this.deserved = deserved;
    }
}
