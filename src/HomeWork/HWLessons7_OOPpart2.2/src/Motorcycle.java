

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean drive() {
        return true;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Motorcycle { " +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
