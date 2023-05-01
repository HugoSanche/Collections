public class StockItem implements  Comparable<StockItem>{
    private final String name;
    private  double price;
    private int quantityStock;
    private int quantityDeserved;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
        this.quantityDeserved =0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
        this.quantityDeserved =0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantityStock;
    }
    public int quantityInDeserve() {
        return quantityDeserved;
    }

    public void setPrice(double price) {
        if (price>0.0){
            this.price = price;
        }
    }
    public void adjustQuantityDeserved(int deserved) {

        int totalStock=this.quantityDeserved+deserved;
        System.out.println("Total Stock "+totalStock);
        if (totalStock>=0){
            this.quantityDeserved = totalStock;
        }
    }
    public void adjustQuantityStock(int deserved) {
        int totalStock=this.quantityStock-deserved;
        if (totalStock>=0){
            this.quantityStock = totalStock;
        }
    }

    @Override
    public String toString() {
        return this.name+": price: "+this.price;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+57;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj!=null || this.getClass()==obj.getClass() ){
            return false;
        }
        StockItem myObject=((StockItem) obj);
        return this.name.equals(myObject.name);

    }

    @Override
    public int compareTo(StockItem o) {
       // System.out.println("Entering "+this.getClass()+" compareTo");
        if (this == o){
            return 0;
        }
        if (o!=null){
            return this.name.compareTo(o.getName());
        }
        throw new NullPointerException();
    }
}
