package com.softserve.edu.HW4_5_Arrays_Loops;

public class Car {
    private final String type;
    private final int yearOfProduction;
    private final double engineCapacity;

    // Конструктор
    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public static Car[] getModelYear(Car[] cars, int yearOfProduction) {

        int i = 0;

        for (Car car : cars) {
            if (car.yearOfProduction == yearOfProduction) i++;
        }
        Car[] tempCar = new Car[i];

        int j = 0;
        for (Car car : cars) {
            if (car.yearOfProduction == yearOfProduction) {
            tempCar[j] = car;
            j++;
            }
        }
        return tempCar;
    }

    @Override
    public String toString() {
        return String.format("Car{type='%s', year=%d, engine=%.1fL}", type, yearOfProduction, engineCapacity);
    }

    // Так як сортую масив використав void. Як я зрозумів передаєтсья не копія масива а посилання на нього тому якщо я
    // в цьому методі зміню його то він змінться всюди й тому не треба робити повернення в метод main.
    public static void sortCarsByYear(Car[] cars) {
        int n = cars.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cars[j].yearOfProduction > cars[j + 1].yearOfProduction) {
                    // Обмін машин (міняємо місцями об'єкти `Car`)
                    Car tempCar = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = tempCar;
                }
            }
        }
    }
}

