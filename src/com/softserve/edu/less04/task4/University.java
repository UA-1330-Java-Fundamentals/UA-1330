package com.softserve.edu.less04.task4;

import java.util.Locale;
import java.util.Scanner;

public class University {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter count student ");
        int studentCount = scanner.nextInt();
        System.out.println("Please enter the following season: ");
        String seas = scanner.next();
        Seasons season = switch (seas.toLowerCase()) {
            case "spring" -> Seasons.SPRING;
            case "summer" -> Seasons.SUMMER;
            case "autumn" -> Seasons.AUTUMN;
            case "winter" -> Seasons.WINTER;
           // default -> Season.SPRING;//not correct default value
            default -> throw new IllegalArgumentException("Unexpected value: " + seas);
        };
        Faculty faculty = new Faculty(studentCount, season);
        faculty.printInfo();
        scanner.close();
    }
}
