package beans;

public class SaleProduct extends Product {
    private int sale;

    public SaleProduct(int id, String name, double price, int sale) {
        super(id, name, price);
        this.sale = sale;
    }

    @Override
    public String toString() {
        return super.toString() + sale +  ";";
    }
}
