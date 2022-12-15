import beans.Product;
import beans.purchase.Purchase;
import beans.purchase.PurchaseWithDiscountCard;

public class PurchaseFactory {
    private enum PurchaseKind {
        PURCHASE {
            @Override
            public Purchase getPurchase(String[] fields){
                return new Purchase(Integer.parseInt(fields[0]),Integer.parseInt(fields[1]));
            }
        },
        PURCHASE_WITH_DISKOUNT_CARD {
            @Override
            public PurchaseWithDiscountCard getPurchase(String[] fields){
                return new PurchaseWithDiscountCard(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2]);
            }
        };

        abstract protected Purchase getPurchase(String[] mas) throws RuntimeException;
    }

    public static Purchase getPurchaseFromFactory(String csvLine) {
        String[] fields = csvLine.split(";");
        return PurchaseKind.values()[fields.length-2].getPurchase(fields);

    }
}
