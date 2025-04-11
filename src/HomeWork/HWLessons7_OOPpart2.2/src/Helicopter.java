

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public String toString() {
        return "Helicopter { " +
                "weight=" + weight +
                ", maxHeight=" + maxHeight +
                '}';
    }
}
