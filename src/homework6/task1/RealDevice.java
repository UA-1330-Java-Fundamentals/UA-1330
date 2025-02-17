package homework6.task1;

public class RealDevice extends Device {

    public RealDevice(String brand, String model, boolean powerStatus) {
        super(brand, model, powerStatus);
    }

    @Override
    public void displayInfo() {
        System.out.println(brand + model + powerStatus);
    }
}
