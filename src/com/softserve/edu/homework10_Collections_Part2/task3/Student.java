package com.softserve.edu.homework10_Collections_Part2.task3;

/*
Create a class named Student that stores information about the student's name and
course.
• The class should include properties to access these fields, a constructor with
parameters, and a method called printStudents that takes a List of students and an
Integer representing the course number as arguments.
• This method should print the names of the students from the list who are enrolled in
the specified course to the console using an iterator.
• Additionally, add methods to compare students by name and by course.
• In the main() method, create a List named "students" and add five different Student
objects to it. Then, display the list of students sorted by name and sorted by course.
 */

import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static void printStudents(List<Student> students, int courseNumber) {
        Iterator<Student> iterator = students.iterator();
        System.out.println("Following students are enrolled on " + courseNumber + "course: ");
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == courseNumber) {
                System.out.println(student.getName());
            }
        }
    }

    public static void sortByName(List<Student> students) {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j).getName().compareTo(students.get(j + 1).getName()) > 0) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }

        System.out.println("\nStudents sorted by name:");
        for (Student student : students) {
            System.out.println(student.getName() + " -> Course " + student.getCourse());
        }
    }

    public static void sortByCourse(List<Student> students) {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j).getCourse() > students.get(j + 1).getCourse()) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }

        System.out.println("\nStudents sorted by course:");
        for (Student student : students) {
            System.out.println(student.getName() + " ->  Course " + student.getCourse());
        }
    }
}
