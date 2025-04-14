package com.softserve.loopsandarrays;
import java.util.Scanner;

public class ApplCar {
    public static void main(String[] args) {

        Car car1 = new Car("Volvo",3.5);
        Car car2 = new Car("BMW", 2.1);
        Car car3 = new Car("Audi" , 2.5);
        Car car4 = new Car("VW", 1.8);

        Car[] arrOfCars = { car1,car2,car3,car4};

        for (int k=0; k<4; k++){
            arrOfCars[k].enterYearOfProduction();
        }

        Car.sortByYear(arrOfCars);

       for (Car car : arrOfCars){
           System.out.println("Information about cars we have sorted by year");
           System.out.println(car);
       }
    }

}
