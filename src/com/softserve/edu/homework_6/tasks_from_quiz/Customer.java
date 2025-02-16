package com.softserve.edu.homework_6.tasks_from_quiz;

public class Customer {
    protected String name;
    protected String email;
    protected int[] purchaseHistory;
    protected int purchaseCount;

    public Customer(String name, String email, int maxPurchases ) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new int[maxPurchases];
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPurchase(int amount) {
        if (purchaseCount < purchaseHistory.length) {
            purchaseHistory[purchaseCount] = amount;
            purchaseCount++;
        } else {
            System.out.println("Purchase history is full. Cannot add more purchases.");
        }
    }

    public int calculateTotalExpenditure() {
        int total = 0;
        for (int i = 0; i < purchaseCount; i++) {
            total += purchaseHistory[i];
        }
        return total;
    }

    public void displayPurchaseHistory() {
        if (purchaseCount == 0) {
            System.out.println("No purchases found.");
            return;
        }

        System.out.println("Purchase History:");
        for (int i = 0; i < purchaseCount; i++) {
            System.out.println("- $" + purchaseHistory[i]);
        }
    }
}
