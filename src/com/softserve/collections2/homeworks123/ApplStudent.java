package com.softserve.collections2.homeworks123;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ApplStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students =new LinkedList<>(); // default capacity = 10
        students.add(new Student("Ivan", 2));
        students.add(new Student("Petro",  1));
        students.add(new Student("Anna", 2 ));
        students.add(new Student("Kateryna",4));
        students.add(new Student("Oleg",  5));
        System.out.println("Initial list:");
        System.out.println(students);
        students.sort(new Student.ByName());
        System.out.println("Students list sorted by name:");
        System.out.println(students);
        students.sort(new Student.ByCourse());
        System.out.println("Students list sorted by course:");
        System.out.println(students);
        System.out.print("Enter the number of course:");
        Student.PrintStudents(students,scanner.nextInt());
    }
}
