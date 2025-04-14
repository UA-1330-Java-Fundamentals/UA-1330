package com.softserve.innerclasses.collections.homework2;

import java.util.*;

public class ApplStudent {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        List<Student> students =new LinkedList<>(); // default capacity = 10
        students.add(new Student("Ivan", "PZ", 2));
        students.add(new Student("Petro", "KS", 1));
        students.add(new Student("Anna", "AT",2 ));
        students.add(new Student("Kateryna", "PZ",4));
        students.add(new Student("Oleg", "KS", 5));

        Student.PrintStudentInformation(students);
        Student.RemoveStudentsWithLowGrades(students);
        System.out.print("Enter course number to see students who study on that course:");
        int numberOfCourse = sc.nextInt();
        Student.PrintStudents(students, numberOfCourse);
    }
}
