package Task2;

public class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public boolean drive() {
        return true;
    }
}
