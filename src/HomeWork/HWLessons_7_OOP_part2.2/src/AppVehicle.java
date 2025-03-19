

public class AppVehicle {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Boat(10, 12),
                new Bus(30, "London"),
                new Car(3, "BMW"),
                new Helicopter(6, 3,2000),
                new Liner(300, 3),
                new Plane(50, 3500),
                new Motorcycle(2, 300)
        };
        for (Vehicle current : vehicles) {
            System.out.println(current);
        }
    }
}
