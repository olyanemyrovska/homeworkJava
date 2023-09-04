package Store;

public class KilogramProduct extends Product {
    private double amount;

    public KilogramProduct(String name, double price) {
        super(name, price);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public boolean hasSufficientAmount(Product product) {
        return false;
    }
}
