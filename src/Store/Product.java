package Store;

public abstract class Product {

    public static final double DEFAULT_MIN_PRICE_VALUE = 0.01;
    private String name;
    private double price;

    public Product(String name, double price) {
        if (name == null || name.isEmpty()) {
        }
        if (price < DEFAULT_MIN_PRICE_VALUE) {
            price = DEFAULT_MIN_PRICE_VALUE;
        }

        this.name = name;
        this.price = price;
    }

    public abstract boolean isAvailable();

    public abstract boolean hasSufficientAmount(Product product);

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
