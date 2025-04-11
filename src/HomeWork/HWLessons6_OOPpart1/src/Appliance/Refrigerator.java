package Appliance;

public class Refrigerator extends Appliance {
    int capacity;

    public Refrigerator(String brand, String model, int capacity) {
        super(brand,model);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Refrigerator - " +
                "Brand: " + brand + ", " +
                "Model: " + model + ", " +
                "Capacity: " + capacity +
                " litres";
    }

    void displayInfo() {
        System.out.println(toString());    }
}
