package com.softserve.err.homework;

import java.util.Arrays;

public class Customer {
    protected String name;
    protected String email;
    protected int[] purchaseHistory;
    protected int purchaseCount;

    public Customer(String name, String email, int maxPurchases ) {
        this.name = name;
        this.purchaseCount = 0;
        this.purchaseHistory = new int[maxPurchases];
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void addPurchase(int amount){

        if ((purchaseHistory.length > purchaseCount)) {
            purchaseHistory[purchaseCount] = amount;
            purchaseCount++;
        }
         else System.out.println("The array is full");
    }

    public int calculateTotalExpenditure(){
        int sum = 0;
        for(int i=0; i < purchaseHistory.length; i++){
            sum+= purchaseHistory[i];
        }
        return sum;
    }

    public void displayPurchaseHistory(){
        for (int i= 0; i < purchaseCount; i++){
            System.out.println("Purchase #" + i + " amount:" + purchaseHistory[i]);
        }
    }

    @Override
    public String toString() {
        return "Name: " + name  +
                ", Email: " + email +
             //   ", Purchase History " + Arrays.toString(purchaseHistory) +
                ", Purchase Count: " + purchaseCount;
    }
}
