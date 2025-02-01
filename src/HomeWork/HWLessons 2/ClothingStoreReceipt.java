
public class ClothingStoreReceipt {
    public static void main(String[] args) {
        String customerName = "Olena";
        int itemsBought = 2;
        double itemPrice = 750.5;
        String paymentMethod = "cash";
        double totalCost = itemsBought * itemPrice;

        System.out.println("Welcome, " + customerName + ", thank you for your purchase!");
        System.out.println("Number of items: " + itemsBought);
        System.out.println("Price per item: " + itemPrice + " UAH.");
        System.out.println("Total cost: " + totalCost + " UAH.");
        System.out.println("Payment method: " + paymentMethod);
    }
}

