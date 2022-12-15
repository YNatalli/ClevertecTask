package beans.purchase;

public class PurchaseWithDiscountCard extends Purchase{
    private String card;
    private int discount;

    public PurchaseWithDiscountCard(int purchaseId, int number, String card) {
        super(purchaseId, number);
        this.card = card;
    }

    @Override
    public String toString() {
        return super.toString() + card + ";" + discount + ";";
    }
}
