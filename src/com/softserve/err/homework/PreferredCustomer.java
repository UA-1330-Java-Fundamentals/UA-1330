package com.softserve.err.homework;

import java.util.Arrays;

public class PreferredCustomer extends Customer{
    private double discountRate;

    public PreferredCustomer(String name, String email, int maxPurchases, double discountRate) {
        super(name, email, maxPurchases);
        if (discountRate > 100){
            this.discountRate = 100;
        } else {
            this.discountRate = discountRate;
        }
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public int applyDiscount(int amount){
        return (int) (amount -(getDiscountRate()/100)*amount);
    }

    @Override
    public void addPurchase(int amount){
        if ((purchaseHistory.length > purchaseCount)) {
            purchaseHistory[purchaseCount] = applyDiscount(amount);
            purchaseCount++;
        }
        else System.out.println("The array is full");
    }

    @Override
    public void displayPurchaseHistory(){
        for (int i= 0; i < purchaseCount; i++){
            System.out.println("Purchase# " + i + " ,amount:" + purchaseHistory[i]
                    + ", Discount applied: " + discountRate + " %.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Discount Rate:" + discountRate;
    }
}
