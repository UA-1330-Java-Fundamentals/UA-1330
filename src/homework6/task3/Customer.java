package homework6.task3;

public class Customer {
    private String name;
    private String email;
    int[] purchaseHistory; //An array to store the customer's purchase history (fixed size).
    int purchaseCount; //A counter to track the number of purchases in the purchaseHistory array.

    public Customer(String name, String email, int maxPurchases) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new int[maxPurchases];
        this.purchaseCount = 0;
    }

    //Adds a purchase to the purchaseHistory array if there is available space. Prints a message if the array is full.
    public void addPurchase(int amount){
        if ( purchaseCount < purchaseHistory.length){
            purchaseHistory[purchaseCount] = amount;
            purchaseCount++;
        } else {
            System.out.println("The array is full.");
        }

    }

    //Calculates and returns the total expenditure of the customer (type: int).
    public int calculateTotalExpenditure(){
        int total = 0;
        for (int i = 0; i < purchaseCount; i++){
            total += purchaseHistory[i];
        }
        return total;

    }

    //Prints the customer's purchase history.
    public void displayPurchaseHistory(){
        for (int i = 0; i < purchaseCount; i++) {
            System.out.print( purchaseHistory[i] + " ");
        }
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
