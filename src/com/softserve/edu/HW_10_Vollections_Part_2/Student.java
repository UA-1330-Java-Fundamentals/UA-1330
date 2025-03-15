package com.softserve.edu.HW_10_Vollections_Part_2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Клас Student
class Student {
    private String name;
    private int course;

    // Конструктор
    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    // Геттери
    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        System.out.println("Студенти на курсі " + course + ":");
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static Comparator<Student> compareByName() {
        return Comparator.comparing(Student::getName);
    }

    public static Comparator<Student> compareByCourse() {
        return Comparator.comparingInt(Student::getCourse);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}