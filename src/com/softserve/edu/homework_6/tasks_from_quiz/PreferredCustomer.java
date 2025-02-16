package com.softserve.edu.homework_6.tasks_from_quiz;

public class PreferredCustomer extends Customer{
    private double discountRate;
    public PreferredCustomer(String name, String email, int maxPurchases, double discountRate) {
        super(name, email, maxPurchases);
        this.discountRate = discountRate;
    }
    public int applyDiscount(int amount) {
        return (int) (amount - (amount * discountRate / 100)); // Discounted amount
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public void addPurchase(int amount) {
        int discountedAmount = applyDiscount(amount);
        if (purchaseCount < purchaseHistory.length) {
            purchaseHistory[purchaseCount] = discountedAmount;
            purchaseCount++;
            System.out.println("Adding purchase with discount: Original: $" + amount + ", After Discount: $" + discountedAmount);
        } else {
            System.out.println("Purchase history is full. Cannot add more purchases.");
        }
    }
    @Override
    public void displayPurchaseHistory() {
        if (purchaseCount == 0) {
            System.out.println("No purchases found.");
            return;
        }

        System.out.println("Purchase History (with discounts applied):");
        for (int i = 0; i < purchaseCount; i++) {
            System.out.println("- $" + purchaseHistory[i]);
        }
    }
}
