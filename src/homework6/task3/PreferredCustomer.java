package homework6.task3;

public class PreferredCustomer extends Customer{
    private final double discountRate; //The discount rate for the loyal customer.


    public PreferredCustomer(String name, String email, int maxPurchases, double discountRate) {
        super(name, email, maxPurchases);
        this.discountRate = discountRate;
    }

    //Applies the discount to the purchase amount and returns the discounted amount (type: int).
    public int applyDiscount(int amount){
        return (int) (amount - (amount * discountRate / 100));



    }

    //Overrides the addPurchase method from the Customer class, adding the purchase with a discount to the purchaseHistory array.
    @Override
    public void addPurchase(int amount){
        if ( purchaseCount < purchaseHistory.length){
            purchaseHistory[purchaseCount] = applyDiscount(amount);
            purchaseCount++;
            System.out.println("Adding purchase with discount: Original: $" + amount + ", After Discount: $" + applyDiscount(amount));
        } else {
            System.out.println("The array is full.");
        }

    }

    //Overrides the displayPurchaseHistory method from the Customer class, printing the purchase history with the discount applied.
    @Override
    public void displayPurchaseHistory(){
        for (int i = 0; i < purchaseCount; i++) {
            System.out.print( purchaseHistory[i] + " ");
        }
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
