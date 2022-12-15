import beans.Product;
import beans.purchase.Purchase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class CreationList {

    //private List<Product> productList = new ArrayList<Product>();
    //private List<DiscountCard> cardList = new ArrayList<DiscountCard>();
    //private List<Purchase> purchaseList = new ArrayList<Purchase>();
    private final Purchase[] purchases = new Purchase[3];
    private final Product[] products = new Product[7];

    public CreationList(String fileName, int i) {
        try (Scanner sc = new Scanner(new FileReader(fileName))) {
            while (sc.hasNext()) {
                switch (i) {
                    case 1:
                        addProduct(sc);
                        break;
                    case 2:
                        addCard(sc);
                        break;
                    case 3:
                        addPurchase(sc);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + i);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void addProduct(Scanner sc) throws NullPointerException {
        for (int i = 0; i < products.length; i++) {
            Product product = ProductFactory.getProductFromFactory(sc.nextLine());
            products[i] = product;
        }
    }

    private void addCard(Scanner sc) {
        String line = sc.nextLine();
        String[] ell = line.split(";");
        //cardList.add(new DiscountCard(ell[0], Integer.parseInt(ell[1])));
    }

    private void addPurchase(Scanner sc) {
        for (int i = 0; i < purchases.length; i++) {
            Purchase purchase = PurchaseFactory.getPurchaseFromFactory(sc.nextLine());
            System.out.println(purchase);
            purchases[i] = purchase;
        }
    }

//    productList.toString().replaceAll("^\\[|\\]$", "").replaceAll("\\p{IsPunctuation} ", "") +
//            cardList.toString().replaceAll("^\\[|\\]$", "").replaceAll("\\p{IsPunctuation} ", "\n") +

    @Override
    public String toString() {
        return Arrays.toString(products) + "\n" + Arrays.toString(purchases);
    }
}
