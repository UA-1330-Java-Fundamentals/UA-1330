package homework6.task2;

public class WashingMachine extends Appliance{
    private int loadCapacity;

    public WashingMachine(String brand, String model, int loadCapacity) {
        super(brand, model);
        this.loadCapacity = loadCapacity;
    }


    @Override
    public void displayInfo() {
        System.out.println("Washing Machine - Brand: " + getBrand() + ", Model: " + getModel() + ", Load Capacity: " + getLoadCapacity() + " kg");
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
