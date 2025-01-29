/*Write a program that simulates a purchase at a clothing store. The program should:

Take the following input:
Customer's name (a string).
Number of items bought (an integer).
Price per item (a decimal number, double).
Payment method (a string, either "cash").
Calculate the total cost of the purchase by multiplying the number of items by the price per item.*/

package HomeWorkFromAcademy.HomeWorkFromAcademy1_2;

public class Task1 {
    public static void main(String[] args) {
        // Input nesecary data
        String customerName = "Olena";
        int itemsBought = 2;
        double itemPrice = 750.5;
        String paymentMethod = "cash";

        // Calculate here the total cost
        double totalCost = itemPrice * itemsBought;


        // Print purchase details
        System.out.println("Welcome, " + customerName + ", thank you for your purchase!");
        System.out.println("Number of items: " + itemsBought);
        System.out.println("Price per item: " + itemPrice + " UAH.");
        System.out.println("Total cost: " + totalCost + " UAH.");
        System.out.println("Payment method: " + paymentMethod);
    }
}
