package beans.purchase;

import beans.Product;

public class Purchase {
    private int purchaseId;
    private String purchaseName;
    private int number;
    private double price;
    Product product;

    public Purchase(int purchaseId, int number) {
        this.purchaseId = purchaseId;
        this.number = number;
    }

    @Override
    public String toString() {
        return purchaseId + ";" + purchaseName + ";" + number + ";" + price + ";";
    }
}
