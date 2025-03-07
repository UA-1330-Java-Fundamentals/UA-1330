
public class PreferredCustomer extends Customer {

    private double discountRate;

    public PreferredCustomer(String name, String email, int maxPurchases, double discountRate) {
        super(name, email, maxPurchases);
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public int applyDiscount(int amount) {
        return (int) (amount - (amount * discountRate / 100));
    }

    @Override

    public void addPurchase(int amount) {
        int discountedAmount = applyDiscount(amount);
        super.addPurchase(discountedAmount);
    }

    @Override
    public void displayPurchaseHistory() {
        System.out.println(name + "'s Discounted Purchase History:");
        for (int i = 0; i < purchaseCount; i++) {
            System.out.println("Purchase " + (i + 1) + ": $" + purchaseHistory[i] + " (after discount)");
        }
    }
}