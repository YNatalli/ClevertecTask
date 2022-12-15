import beans.Product;
import beans.SaleProduct;

public class ProductFactory {
    private enum ProductKind {
        PRODUCT {
            @Override
            public Product getProduct(String[] fields) throws RuntimeException {
                return new Product(Integer.parseInt(fields[0]), fields[1], Double.parseDouble(fields[2]));
            }
        },
        SALE_PRODUCT {
            @Override
            public Product getProduct(String[] fields) throws RuntimeException {
                return new SaleProduct(Integer.parseInt(fields[0]), fields[1], Double.parseDouble(fields[2]), Integer.parseInt(fields[3]));
            }
        };

        abstract protected Product getProduct(String[] mas) throws RuntimeException;
    }

    public static Product getProductFromFactory(String csvLine) {
        String[] fields = csvLine.split(";");
        return ProductKind.values()[fields.length-3].getProduct(fields);

    }
}
