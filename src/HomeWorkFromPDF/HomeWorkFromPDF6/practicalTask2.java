/*
Create abstract class called Car with:
• fields: model, maxSpeed and yearOfProduction;
• methods: run() and stop().
Create classes called Truck and Sedan which extend class Car.
In main() method create array of Car’s objects. Add to this array some
trucks and sedans and print info about it.
*/

package HomeWorkFromPDF.HomeWorkFromPDF6;

abstract class Car{
    String model;
    int maxSpeed;
    int yearOfProduction;

    public void run(){
        System.out.println("Авто заведено!");
    }

    public void stop(){
        System.out.println("Авто заглушено!");
    }
}

class Truck extends Car{
    Truck(String model, int maxSpeed, int yearOfProduction){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
class Sedan extends Car{
    Sedan(String model, int maxSpeed, int yearOfProduction){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}

public class practicalTask2 {
    public static void main(String[] args) {
        Car[] cars = new Car[2];

        Sedan tesla = new Sedan("Tesla Model S", 250, 2023);
        cars[0] = tesla;

        Truck man = new Truck("Man 550", 120, 2009);
        cars[1] = man;

        for (Car carItem : cars){
            System.out.println(carItem);
        }
    }
}
