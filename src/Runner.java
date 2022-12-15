import beans.purchase.Purchase;

public class Runner {
    public static void main(String[] args) throws NullPointerException{
        CreationList creationListProduct = new CreationList("src/data/productId.csv",1);
        //CreationList creationListCardDiscount = new CreationList("src/data/discountCard.csv",2);
        CreationList creationListPurchase = new CreationList("src/data/purchase.csv",3);
        System.out.println(creationListProduct);
        //System.out.println(creationListCardDiscount);
        System.out.println(creationListPurchase);
    }
}
