abstract class Device {
    String brand;
    String model;
    boolean powerStatus;

    public Device(String brand, String model, boolean powerStatus) {
        this.brand = brand;
        this.model = model;
        this.powerStatus = powerStatus;
    }

    public boolean turnOn() {
        if (!powerStatus) {
            powerStatus = true;
            System.out.println("The device is now ON.");
            return true;
        } else {
            System.out.println("The device is now ON.");
            return false; //пристрій був вже увімкнений
        }
    }

    boolean turnOff() {
        if (powerStatus) { //якщо пристрій увімкнено
            powerStatus = false;
            System.out.println("The device is now OFF.");
            return true; //вимкнення прошло успішно
        } else {
            System.out.println("The device is now OFF.");
            return false; //пристрій був вже вимкнений
        }
    }

    abstract void displayInfo();

    public static void main(String[] args) {
    }
}







