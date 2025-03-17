package Task2;

public class WaterVehicle extends Passengers implements Vehicle {


    public WaterVehicle(int passengers) {
        super(passengers);
    }

    public boolean isSailing() {
        return true;
    }
}
