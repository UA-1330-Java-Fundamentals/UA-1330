package com.softserve.err.homework;

public class ApplCustomers {
    public static void main(String[] args) {

        Customer customer = new Customer("Jake", "jake@gmail.com",5);
        customer.addPurchase(10);
        customer.addPurchase(70);
        System.out.println("Preferred customer information: ");
        System.out.println(customer);
        System.out.println("Value of customer's total expediture: " + customer.calculateTotalExpenditure());
        System.out.println("Customer's purchase history:");
        customer.displayPurchaseHistory();

        PreferredCustomer prefCustomer = new PreferredCustomer("Maggie", "maggie@gmail.com",4, 10);
        prefCustomer.addPurchase(50);
        prefCustomer.addPurchase(60);
        prefCustomer.addPurchase(100);
        System.out.println("Preferred customer information: ");
        System.out.println(prefCustomer);
        System.out.println("Value of customer's total expediture: " + prefCustomer.calculateTotalExpenditure());
        System.out.println("Customer's purchase history:");
        prefCustomer.displayPurchaseHistory();

    }
}
