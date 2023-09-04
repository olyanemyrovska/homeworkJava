package Store;

public class QuantityProduct extends Product {
    private int amount;

    public QuantityProduct(String name, double price) {
        super(name, price);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
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
