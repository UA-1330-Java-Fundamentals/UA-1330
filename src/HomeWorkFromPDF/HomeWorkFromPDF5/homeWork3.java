/*
* Create class called Car with fields: type, year of production and engine capacity.
• Create and initialize in main() method four instances of class Car.
• Output result for cars:
o certain model year (enter year in the console);
o sorted cars by the field “year of production ”
.
*/

package HomeWorkFromPDF.HomeWorkFromPDF5;

import java.util.Objects;
import java.util.Scanner;

public class homeWork3 {

    public static String getTypeByYear(Car[] cars, int yearByUser) {
        for (Car c : cars) {
            if (c.getYearOfProduction() == yearByUser) {
                System.out.println(c.getType());
                return c.getType();
            }
        }
        System.out.println("Автомобіль не знайдено");
        return "";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Car[] car = {
            new Car("SUV", 2006, 1.6),
            new Car("sedan", 2026, 9.0),
            new Car("coupe", 1992, 2.5),
            new Car("crossover", 2014, 0.7)
        };

        System.out.println("Введіть рік авто щоб отримати її модель: ");
        int yearByUser = sc.nextInt();
        getTypeByYear(car, yearByUser);

        for(int i = 0; i < car.length - 1; i++){
            for(int j = 0; j < car.length - i - 1; j++){
                if (car[j].getYearOfProduction() < car[j + 1].getYearOfProduction()) {
                    Car temp = car[j];
                    car[j] = car[j + 1];
                    car[j + 1] = temp;
                }
            }
        }

        System.out.println("\nВідсортовані авто за роком виробництва:");

        for (Car c : car) {
            System.out.println(c);
        }

    }
}
