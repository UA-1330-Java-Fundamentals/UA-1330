

public abstract class WaterVehicle extends Passengers implements Vehicle {


    public WaterVehicle(int passengers) {
        super(passengers);
    }

    public boolean isSailing() {
        return true;
    }
}
