package com.softserve.edu.less04.task4;

import java.util.Locale;
import java.util.Scanner;

public class UniverCity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter count student ");
        int studentCount = scanner.nextInt();
        System.out.println("Please enter the following season: ");
        String seas = scanner.next();
        Season season = switch (seas.toLowerCase()) {
            case "spring" -> Season.SPRING;
            case "summer" -> Season.SUMMER;
            case "autumn" -> Season.AUTUMN;
            case "winter" -> Season.WINTER;
            default -> Season.SPRING;
        };
        Faculty faculty = new Faculty(studentCount, season);
        faculty.printInfo();
        scanner.close();
    }
}
