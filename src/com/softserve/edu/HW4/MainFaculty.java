package com.softserve.edu.HW4;

import java.util.Scanner;

public class MainFaculty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Faculty faculty = new Faculty();

        System.out.println("Enter the information about the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        if (numberOfStudents >= 0) {
            faculty.setNumberOfStudents(numberOfStudents);

            System.out.println("Enter the information about current season:");
            String inputSeason = scanner.nextLine();

            if (faculty.isEnteredSeasonCorrect(inputSeason)) {
                System.out.println("Faculty has the number of students " + faculty.getNumberOfStudents() + " and current season is: " + Faculty.Season.getSemesterBySeason(inputSeason));
            } else {
                System.out.println("entered season " + inputSeason + " is unknown");
            }
        } else {
            System.out.println("entered number of Student is incorrect");
        }

        scanner.close();
    }
}
