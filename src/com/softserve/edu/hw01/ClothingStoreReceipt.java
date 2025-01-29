package com.softserve.edu.hw01;

public class ClothingStoreReceipt {
    public static void main(String[] args) {
        // Input nesecary data
String customerName = "Olena";
int itemsBought = 2;
double itemPrice = 750.5;
double totalCost = itemsBought * itemPrice;
String paymentMethod = "cash";

        // Calculate here the total cost

        
        // Print purchase details
        System.out.println("Welcome, " + customerName + ", thank you for your purchase!");
        System.out.println("Number of items: " + itemsBought);
        System.out.println("Price per item: " + itemPrice + " UAH.");
        System.out.println("Total cost: " + totalCost + " UAH.");
        System.out.println("Payment method: " + paymentMethod);
    }
}