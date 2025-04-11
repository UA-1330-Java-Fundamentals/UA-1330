

public abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    public boolean fly() {
        return true;
    }

    public boolean land() {
        return true;
    }
}
