public class Customer {

    protected String name;
    protected String email;
    protected int[] purchaseHistory;
    protected int purchaseCount;

    public Customer(String name, String email, int maxPurchases) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new int [maxPurchases];
        this.purchaseCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
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

    public void displayPurchaseHistory(){
        System.out.println(name + "'s Purchase History:");
        for (int i = 0; i < purchaseCount; i++) {
            System.out.println("Purchase " + (i + 1) + ": $" + purchaseHistory[i]);
        }
    }
}
