package Store;

public class ShoppingCart {
    private Product[] productsInShoppingCart;
    private double totalCostOfProducts;

    public ShoppingCart(int numberOfItems) {
        if (numberOfItems <= 0) {
            System.out.println("Shopping cart size should be greater than zero");
            System.exit(-1);
        } else {
            this.productsInShoppingCart = new Product[numberOfItems];
        }
    }

    public void addProduct(Product product) {
        if (product != null) {
            for (int i = 0; i < this.productsInShoppingCart.length; i++) {
                if (this.productsInShoppingCart[i] == null) {
                    this.productsInShoppingCart[i] = product;
                    double productPrice = 0.00;
                    if (product instanceof QuantityProduct) {
                        productPrice = product.getPrice() * ((QuantityProduct) product).getAmount();
                    } else if (product instanceof KilogramProduct) {
                        productPrice = product.getPrice() * ((KilogramProduct) product).getAmount();
                    } else {
                        throw new IllegalArgumentException("Error: Unknown product");
                    }
                    totalCostOfProducts += productPrice;
                } else {
                    System.out.println("Your shopping cart is already full");
                }
            }
        } else {
            System.out.println("NULL product cannot be added to the cart");
        }
    }

    public void removeProduct(Product product) {
        if (product != null) {
            for (int i = 0; i < this.productsInShoppingCart.length; i++) {
                if (this.productsInShoppingCart[i] == product) {
                    this.productsInShoppingCart[i] = null;


                } else {
                    System.out.println("Current product was not found in shopping cart");
                }
            }
        }
    }
}
