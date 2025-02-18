package part1OOP;

public abstract class Appliance {
    protected String brand;
    protected String model;

    public Appliance(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void display();
}

class WashingMachine extends Appliance {

    private int loadCapacity;

    public WashingMachine(String brand, String model, int loadCapacity) {
        super(brand, model);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void display() {
        System.out.println("Washing Machine - Brand: " + brand + ", Model: " + model + ", Load Capacity: " + loadCapacity + "kg");
    }
}

class Refrigerator extends Appliance {

    private int capacity;

    public Refrigerator(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    @Override
    public void display() {
        System.out.println("Refrigerator - Brand: " + brand + ", Model: " + model + ", Capacity: " + capacity + "liters");
    }
}