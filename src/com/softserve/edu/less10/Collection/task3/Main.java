package com.softserve.edu.less10.Collection.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Lane", 1));
        students.add(new Student("Jone", 2));
        students.add(new Student("Bob", 3));
        students.add(new Student("Vasia", 4));
        students.add(new Student("Kolia", 5));
        students.add(new Student("Mary", 5));
        students.add(new Student("James", 4));
        students.add(new Student("Bob", 3));
        students.add(new Student("Mary", 2));
        students.add(new Student("Vasia", 1));

        System.out.println("Students on course 2 : ");
        Student.printStudent(2, students);

        System.out.println("Students sort by course :");
        students.sort(Student.compareByCourse());
        students.forEach(System.out::println);

        System.out.println("Students sort by name :");
        students.sort(Student.compareByName());
        students.forEach(System.out::println);


    }
}
