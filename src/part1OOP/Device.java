package part1OOP;

public abstract class Device {
    protected String brand;
    protected String model;
    protected boolean powerStatus;


    Device(String brand, String model, boolean powerStatus) {
        this.brand = brand;
        this.model = model;
        this.powerStatus = powerStatus;
    }

    void turnOn() {
        if (!powerStatus) {
            this.powerStatus = true;
            System.out.println("The device is now ON.");
        }
    }
    void turnOff() {
        if (powerStatus) {
            this.powerStatus = false;
            System.out.println("The device is now OFF.");
        }
    }

    public abstract void displayInfo();
}
