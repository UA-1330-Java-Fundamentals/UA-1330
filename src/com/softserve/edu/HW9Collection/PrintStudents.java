package com.softserve.edu.HW9Collection;

import java.util.List;

public class PrintStudents {
    public static void printInitialStList(List<StudentAverageGrade> students) {
        System.out.println("Initial students list: ");
        for (StudentAverageGrade student : students) {
            System.out.println(student);
        }
    }

    public static void printStudents(List<StudentAverageGrade> students) {
        System.out.println("List of students with average grade 3 and more: ");
        for (StudentAverageGrade student : students) {
            System.out.println("Name: " + student.getName() + " is enrolled to the next course " + (student.getCourse() + 1));
        }
    }

}
