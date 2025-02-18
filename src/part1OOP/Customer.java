package part1OOP;

class Customer {
    private String name;
    private String email;
    private int[] purchaseHistory;
    private int purchaseCount;

    Customer(String name, String email, int maxPurchase) {
        this.name = name;
        this.email = email;
        purchaseHistory = new int[maxPurchase];
        purchaseCount = 0;
    }

    public void addPurchase(int purchase) {
        if (purchaseHistory.length > purchaseCount) {
            purchaseHistory[purchaseCount] = purchase;
            purchaseCount++;
        }
        else {
            System.out.println("Purchase history is full. Cannot add more purchases.");
        }
    }

    public int calculateTotalExpenditure() {
        int totalExpenditure = 0;
        for (int i = 0; i < purchaseHistory.length; i++) {
            totalExpenditure += purchaseHistory[i];
        }
        return totalExpenditure;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void displayPurchaseHistory() {
        for (int i = 0; i < purchaseHistory.length; i++) {
            System.out.println(purchaseHistory[i]);
        }
    }
}

class PreferredCustomer extends Customer {

    private double discountRate;

    PreferredCustomer(String name, String email, int maxPurchase, double discountRate) {
        super(name, email, maxPurchase);
        this.discountRate = discountRate;
    }

    public int applyDiscount(int amount) {
        //super.calculateTotalExpenditure();

        return (int) (discountRate * amount);
    }

    @Override
    public void addPurchase(int purchase) {
        purchase = applyDiscount(purchase);
        super.addPurchase(purchase);
    }

    @Override
    public void displayPurchaseHistory() {
        super.displayPurchaseHistory();
    }

    public double getDiscountRate(){
        return discountRate;
    }
}