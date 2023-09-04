package Store;

public class Buyer implements IBuyer {
    private ShoppingCart shoppingCart;
    private double cash;
    private Store store;
    private int numberOfItemsToBuy;

    public Buyer(int numberOfItemsToBuy, double cash, Store store) {
        this.numberOfItemsToBuy = numberOfItemsToBuy;
        this.cash = cash;
        this.store = store;
    }

    @Override
    public void addProductToCart(Product product) {
        if (product != null) {
            shoppingCart.addProduct(product);
        }
    }

    @Override
    public void removeProductFromCart(Product product) {
        if (product != null) {
            shoppingCart.removeProduct(product);
        }
    }
}
