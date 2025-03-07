abstract class Appliance {
    public String brand;
    public String model;

    public Appliance (String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public abstract void displayInfo();

}


