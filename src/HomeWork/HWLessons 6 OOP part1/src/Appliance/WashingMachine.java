package Appliance;

public class WashingMachine extends Appliance {
    int loadCapacity;

    public WashingMachine(String brand, String model, int loadCapacity) {
        super(brand,model);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "WashingMachine - " +
                "Brand: " + brand + ", " +
                "Model: " + model + ", " +
                "Load Capacity: " + loadCapacity +
                " kg";
    }

    void displayInfo() {
        System.out.println(toString());
    }
}
