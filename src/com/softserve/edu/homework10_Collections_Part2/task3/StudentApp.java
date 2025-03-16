package com.softserve.edu.homework10_Collections_Part2.task3;

import java.util.ArrayList;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Serhiy", 2));
        students.add(new Student("Orest", 1));
        students.add(new Student("Michael", 3));
        students.add(new Student("Olha", 2));
        students.add(new Student("Kate", 1));

        Student.printStudents(students, 2);

        Student.sortByName(students);

        Student.sortByCourse(students);

    }
}
