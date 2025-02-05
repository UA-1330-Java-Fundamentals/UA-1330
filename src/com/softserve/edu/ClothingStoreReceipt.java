package com.softserve.edu;

import java.util.Scanner;

public class ClothingStoreReceipt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Customer's name: ");
        String customerName = scanner.next();

        System.out.print("Number of items bought: ");
        int itemsBought = scanner.nextInt();

        System.out.print("Price per item: ");
        double itemPrice = scanner.nextDouble();

        System.out.print("Payment method: ");
        String paymentMethod = scanner.next();

        double totalCost = itemsBought * itemPrice;

        System.out.println("Welcome, " + customerName + ", thank you for your purchase!");
        System.out.println("Number of items: " + itemsBought);
        System.out.println("Price per item: " + itemPrice + " UAH.");
        System.out.println("Total cost: " + totalCost + " UAH.");
        System.out.println("Payment method: " + paymentMethod);
    }
}


