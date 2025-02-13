package HomeWorkFromPDF.HomeWorkFromPDF5;

import java.util.Objects;

public class Car{
    private String type;
    private int  yearOfProduction;
    private double  engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{type='" + type + "', year=" + yearOfProduction + ", engine=" + engineCapacity + "L}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction && Double.compare(engineCapacity, car.engineCapacity) == 0 && Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, yearOfProduction, engineCapacity);
    }
}
