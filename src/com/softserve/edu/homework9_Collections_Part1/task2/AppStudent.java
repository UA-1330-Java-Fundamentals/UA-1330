package com.softserve.edu.homework9_Collections_Part1.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kate", "KSM-09-1", 2, Arrays.asList(3, 4, 5)));
        students.add(new Student("Igor", "KSM-10-2", 1, Arrays.asList(2, 2, 2)));
        students.add(new Student("Juls", "KSM-08-1", 3, Arrays.asList(4, 5, 3)));
        students.add(new Student("Bohdan", "KSM-09-1", 2, Arrays.asList(5, 4, 3)));
        students.add(new Student("Eve", "KSM-10-1", 1, Arrays.asList(1, 2, 3)));

        // Remove students with GPA < 3 and promote others
        Student.removeLowScorers(students);
        System.out.println("Students after removing low scorers and promoting:");
        for (Student student : students) {
            System.out.println(student.getName() + " - Course: " + student.getCourse());
        }

        // Print students in a specific course
        System.out.println("\nStudents in course 3:");
        Student.printStudents(students, 3);
    }
}
