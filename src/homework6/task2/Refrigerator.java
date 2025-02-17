package homework6.task2;

public class Refrigerator extends Appliance{
    private int capacity;

    public Refrigerator(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }


    @Override
    public void displayInfo() {
        System.out.println("Refrigerator - Brand: " + getBrand() + ", Model: " + getModel() + ", Capacity: " + getCapacity() + " liters");
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
