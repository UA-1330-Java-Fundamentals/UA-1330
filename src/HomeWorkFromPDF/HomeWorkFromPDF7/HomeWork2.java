package HomeWorkFromPDF.HomeWorkFromPDF7;

interface Vehicle{

}

abstract class Passengers{
    private int passengers;

    public Passengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}

abstract class WaterVehicle extends Passengers implements Vehicle{
    public WaterVehicle(int passengers){
        super(passengers);
    }
    public abstract void isSailing();
}

abstract class FlyingVehicle extends Passengers implements Vehicle{
    public FlyingVehicle(int passengers){
        super(passengers);
    }
    public abstract void fly();
    public abstract void land();
}

abstract class GroundVehicle extends Passengers implements Vehicle{
    public GroundVehicle(int passengers){
        super(passengers);
    }
    public abstract void drive();
}

class Liner extends WaterVehicle{
    public int floors;

    public Liner(int passengers){
        super(passengers);
    }

    @Override
    public void isSailing(){
        System.out.println("Is sailing!");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}

class Boat extends WaterVehicle{
    public int volume;

    public Boat(int passengers){
        super(passengers);
    }

    @Override
    public void isSailing(){
        System.out.println("Is sailing!");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

//Дальше по тій самі схемі все решта обєктів створити, просто то довго, але суть я зрозумів)



public class HomeWork2 {
}
