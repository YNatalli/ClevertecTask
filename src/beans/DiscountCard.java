package beans;

public class DiscountCard {
    private String cardName;
    private int discount;

    public DiscountCard(String cardName, int discount) {
        this.cardName = cardName;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return cardName + ";" + discount;
    }
}
