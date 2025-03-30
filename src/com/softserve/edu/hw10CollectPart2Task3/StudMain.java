package com.softserve.edu.hw10CollectPart2Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Natalia", 4));
        students.add(new Student("Nick", 3));
        students.add(new Student("Ivanna", 5));
        students.add(new Student("Petro", 3));
        students.add(new Student("Petro", 1));

        System.out.println("Initial student list");
        for (Student current : students) {
            System.out.println(current);
        }
        System.out.println(" ");

        //call the method to print Student list with specified course
        System.out.println("Enter course number (integer) for students search: ");
        Scanner sc = new Scanner(System.in);
        int course = sc.nextInt();
        Student.printStudents(students, course);

        System.out.println(" ");

        //call the method sorted by name
        Collections.sort(students);
        System.out.println("Sorted students by name: ");
        for (Student current : students) {
            System.out.println(current);
        }

        System.out.println(" ");

        //call the method sorted by course
        students.sort(Student.byCourse());
        System.out.println("Sorted students by course: ");
        for (Student current : students) {
            System.out.println(current);
        }
    }
}
